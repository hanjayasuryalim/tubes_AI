/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilities.ResizeImage;
import javax.swing.*;
import java.awt.*;
import View.*;
import static View.Cover.f;
import static View.FuzzyLogic.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author User
 */
public class FuzzyResultFrame extends JFrame{
    private JLabel temp;
    private JLabel img;
    private JLabel back;
    private JScrollPane sp;
    private JPanel panelMain;
    JPanel panel;
    
    public static String method;
    
    double[] alpha = new double[9];
    double[] zScore = new double[9];
    
    double result;

    
    public FuzzyResultFrame(String method) {
        this.method = method;
        initComponents();
    }
    
    private void initComponents(){
        // metas
        
        setTitle("Fuzzy Results");
        setSize(700,550);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        //create mainPanel
        JPanel mainPanel = new JPanel(new BorderLayout());
        getContentPane().add(mainPanel);
        
        //create panelNavbar
        JPanel navbar = new JPanel(new GridLayout(1,2));
        navbar.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));
        back = new JLabel(new ImageIcon(ResizeImage.resize("image/Back.png", 50, 50)), JLabel.LEFT);
        navbar.add(back);        
        img = new JLabel(new ImageIcon(ResizeImage.resize("image/FuzzyLogicTitle.png", 200, 50)), JLabel.RIGHT);
        navbar.add(img);
        
        
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createLineBorder(Color.red));
        panel.setPreferredSize(new Dimension(600, 3000));
        mainPanel.add(panel, BorderLayout.SOUTH);
        
        final JScrollPane scroll = new JScrollPane(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().add(scroll, BorderLayout.CENTER);
        setVisible(true);
        
        Graph graphSuhuDingin = new Graph(34, 36, 37, 38, 40, "Suhu Tubuh Rendah", "Rendah", suhuDinginValue, suhu, (suhu-34)/(40-34));
        Graph graphSuhuNormal = new Graph(34, 36, 37, 38, 40, "Suhu Tubuh Normal", "Normal", suhuNormalValue, suhu, (suhu-34)/(40-34));
        Graph graphSuhuPanas = new Graph(34, 36, 37, 38, 40, "Suhu Tubuh Tinggi", "Tinggi", suhuPanasValue, suhu, (suhu-34)/(40-34));
        Graph graphTekananRendah = new Graph(100, 110, 120, 130, 140, "Tekanan Darah Rendah", "Rendah", tekananRendahValue, tekanan, (tekanan-100)/(140-100));
        Graph graphTekananNormal = new Graph(100, 110, 120, 130, 140, "Tekanan Darah Normal", "Normal", tekananNormalValue, tekanan, (tekanan-100)/(140-100));
        Graph graphTekananTinggi = new Graph(100, 110, 120, 130, 140, "Tekanan Darah Tinggi", "Tinggi", tekananTinggiValue, tekanan, (tekanan-100)/(140-100));
//        Graph graphTbcNegatif = new Graph(0, 40, 60, 80, 100, "Probabilitas TBC", tbcNegatifValue);
//        Graph graphTbc = new Graph(0, 40, 60, 80, 100, "Probabilitas TBC");
//        Graph graphTbc = new Graph(0, 40, 60, 80, 100, "Probabilitas TBC");
        
        if (FuzzyResultFrame.method.equals("Tsukamoto")) {
            result = tsukamoto();
        } else if (FuzzyResultFrame.method.equals("Sugeno")){
            result = sugeno();
        }
        
        panel.add(graphSuhuDingin);
        panel.add(graphSuhuNormal);
        panel.add(graphSuhuPanas);
        panel.add(graphTekananRendah);
        panel.add(graphTekananNormal);
        panel.add(graphTekananTinggi);
        panel.add(navbar);
//        panel.add(graphTbc);

        back.addMouseListener(new mouseAction());   
        
        
        
        JOptionPane.showMessageDialog(null,"Menurut metode Fuzzy" + method +  ",\n probabilitas Anda terkena TBC adalah"+ result);
        
        
        
    }
    
    class mouseAction extends MouseAdapter{
        @Override
        public void mouseEntered(MouseEvent e){
            back.setIcon(new ImageIcon(ResizeImage.resize("image/BackPutih.png", 50, 50)));
        }
        
        @Override
        public void mouseExited(MouseEvent e){
            back.setIcon(new ImageIcon(ResizeImage.resize("image/Back.png", 50, 50)));
        }
        
        @Override
        public void mouseClicked(MouseEvent e){
            dispose();
            f.setVisible(true);           
        }
    }
    protected void ruleBase(){
        alpha[0] = Math.min(suhuDinginValue, tekananRendahValue);
        alpha[1] = Math.min(suhuDinginValue, tekananNormalValue);
        alpha[2] = Math.min(suhuDinginValue, tekananTinggiValue);
        alpha[3] = Math.min(suhuNormalValue, tekananRendahValue);
        alpha[4] = Math.min(suhuNormalValue, tekananNormalValue);
        alpha[5] = Math.min(suhuNormalValue, tekananTinggiValue);
        alpha[6] = Math.min(suhuPanasValue, tekananRendahValue);
        alpha[7] = Math.min(suhuPanasValue, tekananNormalValue);
        alpha[8] = Math.min(suhuPanasValue, tekananTinggiValue);
    }
    
    protected double tsukamoto(){
        ruleBase();
        zScore[0] = tbcLatenNaik.getZScore(alpha[0]);
        zScore[1] = tbcNegatif.getZScore(alpha[1]);
        zScore[2] = tbcAktif.getZScore(alpha[2]);
        zScore[3] = tbcLatenNaik.getZScore(alpha[3]);
        zScore[4] = tbcNegatif.getZScore(alpha[4]);
        zScore[5] = tbcLatenTurun.getZScore(alpha[5]);
        zScore[6] = tbcAktif.getZScore(alpha[6]);
        zScore[7] = tbcLatenTurun.getZScore(alpha[7]);
        zScore[8] = tbcAktif.getZScore(alpha[8]);
        
        double res = 0;
        double quotient = 0;
        for (int i = 0; i < 9; i++) {
            res+=(alpha[i] * zScore[i]);
        }
        for (int i = 0; i < 9; i++) {
            quotient+=alpha[i];
        }
        
//        System.out.println(result/quotient);
        this.result = (res/quotient);
        
        
        for (double d : zScore) {
            System.out.println(d);
        }
        
        for (double d : alpha) {
            System.out.println(d);
        }
//        System.out.println(this.result);

        return (res/quotient);
    }

    protected double sugeno(){
        ruleBase();
        zScore[0] = 40;
        zScore[1] = 30;
        zScore[2] = 50;
        zScore[3] = 20;
        zScore[4] = 10;
        zScore[5] = 70;
        zScore[6] = 60;
        zScore[7] = 30;
        zScore[8] = 40;
        
        double res = 0;
        double quotient = 0;
        
        for (int i = 0; i < 9; i++) {
            res+=(alpha[i] * zScore[i]);
        }
        for (int i = 0; i < 9; i++) {
            quotient+=zScore[i];
        }
        
        this.result = (res/quotient);
        
        return (res/quotient);
    }
    
    
    
}
