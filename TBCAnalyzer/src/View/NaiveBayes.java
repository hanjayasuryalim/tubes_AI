/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilities.ResizeImage;
import static View.Cover.f;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author Daniel
 */
public class NaiveBayes extends JFrame{
    private JLabel temp;
    private JLabel img;
    private JLabel back;
    
    
    public NaiveBayes(){
        setSize(700,550);
        setTitle("Backward Chaining ");
        setLocationRelativeTo(null);
        setResizable(false);
        initComponent();
    }
    
    private void initComponent(){
        //create mainPanel
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        //create panelNavbar
        JPanel navbar = new JPanel(new GridLayout(1,2));
        navbar.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));
        back = new JLabel(new ImageIcon(ResizeImage.resize("image/Back.png", 50, 50)), JLabel.LEFT);
        navbar.add(back);
        
        img = new JLabel(new ImageIcon(ResizeImage.resize("image/NaiveBayesTitle.png", 200, 50)), JLabel.RIGHT);
        navbar.add(img);
        
        mainPanel.add(navbar, BorderLayout.NORTH);
        add(mainPanel);
        
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
}
