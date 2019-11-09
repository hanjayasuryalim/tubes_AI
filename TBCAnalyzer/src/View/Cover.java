/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Utilities.ResizeImage;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Daniel
 */
public class Cover extends JFrame{
    private JLabel img;
    private JButton start;
    
    public Cover(){
        setSize(450,300);
        setTitle("TBC ANALYZER");
        setResizable(false);
        setLocationRelativeTo(null);
        initComponent();
    }
    
    private void initComponent(){
        //create mainPanel
        JPanel mainPanel = new JPanel(null);
        
        //create image
        img = new JLabel(new ImageIcon(ResizeImage.resize("image/CoverTBC.png", 240, 240)));
        img.setBounds(5, 5, 300, 250);
        mainPanel.add(img);
        
        //create button
        start = new JButton("START");
        start.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        start.setBounds(260, 100, 130, 60);
        start.setPreferredSize(new Dimension(68,68));
        mainPanel.add(start);
        
        getContentPane().add(mainPanel);
        
        //actionListener
        start.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame f = new MainFrame();
                dispose();
            }
        });
    }
}
