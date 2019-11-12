/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Data;
import Utilities.ResizeImage;
import static View.Cover.f;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.*;
import Controller.*;
import Model.*;

/**
 *
 * @author Daniel
 */
public class FuzzyLogic extends JFrame{
    private JLabel temp;
    private JLabel img;
    private JLabel back;

    private JButton proses;
    
    private final String[] modes = {"Tsukamoto", "Sugeno"};
    private JComboBox cbMethod;
    private JTextField tfSuhu;
    private JTextField tfTekanan;
    
    private Data setData = new Data();
    
    
    public static  FuzzySet suhuDingin;
    public static  FuzzySet suhuNormalNaik;
    public static  FuzzySet suhuNormalTurun;
    public static  FuzzySet suhuPanas;
    public static  FuzzySet tekananRendah;
    public static  FuzzySet tekananNormalNaik;
    public static  FuzzySet tekananNormalTurun;
    public static  FuzzySet tekananTinggi;
    public static  FuzzySet tbcNegatif;
    public static  FuzzySet tbcLatenTurun;
    public static  FuzzySet tbcLatenNaik;
    public static  FuzzySet tbcAktif;
    
    public static double suhuDinginValue;
    public static double suhuNormalValue;
    public static double suhuPanasValue;
    public static double tekananRendahValue;
    public static double tekananNormalValue;
    public static double tekananTinggiValue;
    
    public static double suhu;
    public static double tekanan;
    
    public FuzzyLogic(){
        setSize(700,550);
        setTitle("Fuzzy Logic");
        setLocationRelativeTo(null);
        setResizable(false);
        initComponent();
    }
    
    private void initComponent(){
        //create mainPanel
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        //inisialisasi fuzzy sets
        initFuzzySets();
        
        //create panelNavbar
        JPanel navbar = new JPanel(new GridLayout(1,2));
        navbar.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));
        back = new JLabel(new ImageIcon(ResizeImage.resize("image/Back.png", 50, 50)), JLabel.LEFT);
        navbar.add(back);
        img = new JLabel(new ImageIcon(ResizeImage.resize("image/FuzzyLogicTitle.png", 200, 50)), JLabel.RIGHT);
        navbar.add(img);
        mainPanel.add(navbar, BorderLayout.NORTH);
        
        //CONTENT 
        JPanel contentPanel = new JPanel(new GridLayout(13,3));
        contentPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        mainPanel.add(createLegend(), BorderLayout.CENTER);
        
        
        //Footer
        JPanel footerPanel = new JPanel(new FlowLayout());
        proses = new JButton("Proses");
        
        proses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                dispose();
                fuzzify();
                
            }
        
        });
        footerPanel.add(proses);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);
        
        temp = new JLabel("             ");
        add(temp, BorderLayout.EAST);
        temp = new JLabel("             ");
        add(temp, BorderLayout.WEST);
        
        //add to frame
        getContentPane().add(mainPanel);
        
        getContentPane().add(mainPanel);
        
        
        //actionListener
        back.addMouseListener(new mouseAction());        
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
    
    public JPanel createLegend(){
        JPanel legendPanel = new JPanel();
        legendPanel.setBorder(BorderFactory.createTitledBorder("Fuzzy"));
        legendPanel.setLayout(new GridBagLayout());
        
        cbMethod = new JComboBox();
        for (String mode : modes) {
            cbMethod.addItem(mode);
        }
        
        
        JLabel labelSuhu = new JLabel("Suhu Tubuh: ");
        JLabel labelTekanan = new JLabel("Tekanan Darah: ");
        
        GridBagConstraints c =  new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        legendPanel.add(new JLabel("Method: "), c);
        
        c.gridx = 2;
        c.gridy = 0;
        
        legendPanel.add(cbMethod, c);
        
        
        c.gridx = 0;
        c.gridy = 1;
        legendPanel.add(labelSuhu, c);
        
        c.gridx = 0;
        c.gridy = 2;
        legendPanel.add(labelTekanan, c);
        
        
        tfSuhu = new JTextField("36.0", 5);
        tfTekanan = new JTextField("120", 5);
        JButton buttonUpSuhu = new JButton("+");
        buttonUpSuhu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                editNumber(tfSuhu, .1);
            }
        });
        JButton buttonDownSuhu = new JButton("-");
        buttonDownSuhu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                editNumber(tfSuhu, -.1);
            }
        });
        
        JButton buttonUpTekanan = new JButton("+");
        buttonUpTekanan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                editNumber(tfTekanan, .1);
            }
        });
        JButton buttonDownTekanan = new JButton("-");
        buttonDownTekanan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                editNumber(tfTekanan, -.1);
            }
        });
        
        JPanel panelSliderSuhu = new JPanel(new BorderLayout());
        JPanel panelSliderTekanan = new JPanel(new BorderLayout());
        
        // add slider stuff
        panelSliderSuhu.add(buttonDownSuhu, BorderLayout.WEST);
        panelSliderSuhu.add(tfSuhu, BorderLayout.CENTER);
        panelSliderSuhu.add(buttonUpSuhu, BorderLayout.EAST);
        
        c.gridx = 2;
        c.gridy = 1;
        legendPanel.add(panelSliderSuhu, c);
        
        panelSliderTekanan.add(buttonDownTekanan, BorderLayout.WEST);
        panelSliderTekanan.add(tfTekanan, BorderLayout.CENTER);
        panelSliderTekanan.add(buttonUpTekanan, BorderLayout.EAST);
        
        c.gridx = 2;
        c.gridy = 2;
        legendPanel.add(panelSliderTekanan, c);
        
        return legendPanel;
    }
    
    public void editNumber(JTextField a, double value){
        int getValue =  (int) (Double.valueOf(a.getText()) * 10);
        getValue += (value*10);
        double result = (double)(getValue / 10.0);
        a.setText(String.valueOf(result));
        System.out.println(result);
    }
    
    public void initFuzzySets(){
        //fuzzy set suhu
        suhuDingin = new FuzzySet(new Model.Point(36,1), new Model.Point(37, 0));
        suhuNormalNaik = new FuzzySet(new Model.Point(36,0), new Model.Point(37, 1));
        suhuNormalTurun = new FuzzySet(new Model.Point(37,1), new Model.Point(38, 0));
        suhuPanas = new FuzzySet(new Model.Point(37,0), new Model.Point(38, 1));
        
        //fuzzy set tekanan
        tekananRendah = new FuzzySet(new Model.Point(110,1), new Model.Point(120, 0));
        tekananNormalNaik = new FuzzySet(new Model.Point(110,0), new Model.Point(120, 1));
        tekananNormalTurun = new FuzzySet(new Model.Point(120,1), new Model.Point(120, 0));
        tekananTinggi = new FuzzySet(new Model.Point(120,0), new Model.Point(130, 1));
        
        
        //fuzzy set tbc
        tbcNegatif = new FuzzySet(new Model.Point(0, 1), new Model.Point(20, 0));
        tbcLatenNaik = new FuzzySet(new Model.Point(40, 0), new Model.Point(60, 1));
        tbcLatenTurun = new FuzzySet(new Model.Point(60, 1), new Model.Point(80, 0));
        tbcAktif = new FuzzySet(new Model.Point(80, 0), new Model.Point(100, 1));
        
    }
    
    public void fuzzify(){
        suhu = Double.valueOf(tfSuhu.getText());
        tekanan = Double.valueOf(tfTekanan.getText());
        
        suhuDinginValue = suhuDingin.fuzzify(suhu);
        if (suhu > 36 && suhu<37) {
            suhuNormalValue = suhuNormalNaik.fuzzify(suhu);
        } else if (suhu >37 && suhu <38){
            suhuNormalValue = suhuNormalTurun.fuzzify(suhu);
        } else if (suhu <= 36 || suhu >= 38){
            suhuNormalValue = 0.0;
        } else{
            suhuNormalValue = 1.0;
        }
        suhuPanasValue = suhuPanas.fuzzify(suhu);
        
        tekananRendahValue = tekananRendah.fuzzify(tekanan);
        if (tekanan > 110 && tekanan<120) {
            tekananNormalValue = tekananNormalNaik.fuzzify(tekanan);
        } else if (tekanan >120 && tekanan <130){
            tekananNormalValue = tekananNormalTurun.fuzzify(tekanan);
        } else if (tekanan <= 110 || tekanan >= 130){
            tekananNormalValue = 0.0;
        } else{
            tekananNormalValue = 1.0;
        }
        tekananTinggiValue = tekananTinggi.fuzzify(tekanan);
        
        String selected = cbMethod.getSelectedItem().toString();
        
        FuzzyResultFrame resultFrame = new FuzzyResultFrame(selected);
        
    }
    
    
    
    
    
    
    
    
    
    
}
