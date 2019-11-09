package View;
import Utilities.ResizeImage;
import static View.Cover.f;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
/**
 *
 * @author Hanjaya
 */
public class DiagnozePanel extends JPanel{
    
    private JButton fuzzyButton;
    private JButton naiveBayesButton;
    private JButton forwardChainingButton;
    private JButton backwardChainingButton;
    
    DiagnozePanel(){
        setLayout(new GridLayout(2,2));
        
        //create button
        fuzzyButton=new JButton(new ImageIcon(ResizeImage.resize("image/FuzzyLogic.png", 220, 220)));
        naiveBayesButton=new JButton(new ImageIcon(ResizeImage.resize("image/NaiveBayes.png", 220, 220)));
        forwardChainingButton=new JButton(new ImageIcon(ResizeImage.resize("image/ForwardChain.png", 250, 220)));
        backwardChainingButton=new JButton(new ImageIcon(ResizeImage.resize("image/BackwardChain.png", 250, 220)));
        
        fuzzyButton.setBackground(Color.WHITE);
        naiveBayesButton.setBackground(Color.WHITE);
        forwardChainingButton.setBackground(Color.WHITE);
        backwardChainingButton.setBackground(Color.WHITE);
        
        add(fuzzyButton);
        add(naiveBayesButton);
        add(forwardChainingButton);
        add(backwardChainingButton);

        fuzzyButton.addMouseListener(new mouseHover());
        naiveBayesButton.addMouseListener(new mouseHover());
        forwardChainingButton.addMouseListener(new mouseHover());
        backwardChainingButton.addMouseListener(new mouseHover());
        
        //action listener
        backwardChainingButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                JFrame frame = new BackwardChaining();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        
        forwardChainingButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                JFrame frame2 = new ForwardChaining();
                frame2.setVisible(true);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        
        naiveBayesButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                JFrame frame3 = new NaiveBayes();
                frame3.setVisible(true);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        
        fuzzyButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                JFrame frame4 = new FuzzyLogic();
                frame4.setVisible(true);
                frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
    
    //function listener mouse
    class mouseHover extends MouseAdapter{
        @Override
        public void mouseEntered(MouseEvent evt){
            Component c=evt.getComponent();
            c.setBackground(Color.GRAY);
        }
            
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt){                                      
            Component c = evt.getComponent();
            c.setBackground(Color.WHITE);
        }  
    }
}