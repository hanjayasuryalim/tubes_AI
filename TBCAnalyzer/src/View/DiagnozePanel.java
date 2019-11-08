
package View;

import java.awt.Color;
import java.awt.Component;
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

        fuzzyButton=new JButton("Fuzzy Method");
        naiveBayesButton=new JButton("NaiveBayes Method");
        forwardChainingButton=new JButton("Forward Chaining Method");
        backwardChainingButton=new JButton("Backward Chaining Method");
        
        fuzzyButton.setBackground(Color.BLACK);
        fuzzyButton.setForeground(Color.WHITE);
        naiveBayesButton.setBackground(Color.BLACK);
        naiveBayesButton.setForeground(Color.WHITE);
        forwardChainingButton.setBackground(Color.BLACK);
        forwardChainingButton.setForeground(Color.WHITE);
        backwardChainingButton.setBackground(Color.BLACK);
        backwardChainingButton.setForeground(Color.WHITE);
        
        
        add(fuzzyButton);
        add(naiveBayesButton);
        add(forwardChainingButton);
        add(backwardChainingButton);
        
        //function
        class mouseHover extends MouseAdapter{
            @Override
            public void mouseEntered(MouseEvent evt){
                Component c=evt.getComponent();
                c.setBackground(Color.WHITE);
                c.setForeground(Color.BLACK);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt)
            {                                      
                Component c = evt.getComponent();
                c.setBackground(Color.BLACK);
                c.setForeground(Color.WHITE);
            }  
        }
        
        fuzzyButton.addMouseListener(new mouseHover());
        naiveBayesButton.addMouseListener(new mouseHover());
        forwardChainingButton.addMouseListener(new mouseHover());
        backwardChainingButton.addMouseListener(new mouseHover());
        
    }
}
