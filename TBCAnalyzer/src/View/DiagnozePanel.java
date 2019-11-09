package View;
import Utilities.ResizeImage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
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

        fuzzyButton=new JButton(new ImageIcon(ResizeImage.resize("image/Fuzzy Logic.png", 220, 220)));
        naiveBayesButton=new JButton(new ImageIcon(ResizeImage.resize("image/NaiveBayes.png", 220, 220)));
        forwardChainingButton=new JButton(new ImageIcon(ResizeImage.resize("image/Forward Chain.png", 250, 220)));
        backwardChainingButton=new JButton(new ImageIcon(ResizeImage.resize("image/BackwardChain.png", 250, 220)));
        
        fuzzyButton.setBackground(Color.WHITE);
        naiveBayesButton.setBackground(Color.WHITE);
        forwardChainingButton.setBackground(Color.WHITE);
        backwardChainingButton.setBackground(Color.WHITE);
        
        add(fuzzyButton);
        add(naiveBayesButton);
        add(forwardChainingButton);
        add(backwardChainingButton);
        
        //function
        class mouseHover extends MouseAdapter{
            @Override
            public void mouseEntered(MouseEvent evt){
                Component c=evt.getComponent();
                c.setBackground(Color.GRAY);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt)
            {                                      
                Component c = evt.getComponent();
                c.setBackground(Color.WHITE);
            }  
        }
        
        fuzzyButton.addMouseListener(new mouseHover());
        naiveBayesButton.addMouseListener(new mouseHover());
        forwardChainingButton.addMouseListener(new mouseHover());
        backwardChainingButton.addMouseListener(new mouseHover());
        
    }
}