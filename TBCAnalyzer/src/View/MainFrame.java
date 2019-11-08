
package View;

import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.*; 
/**
 *
 * @author Hanjaya
 */
public class MainFrame extends JFrame{
    //panels
    private JPanel titlePanel;
    private JPanel cardPanel;
    private JPanel tbcPanel;
    private JPanel diagnozePanel;
    private JPanel addDataSetPanel;
    private JPanel buttonPanel;
    
    //buttons
    private JButton tbcButton;
    private JButton diagnozeButton;
    private JButton addDataSetButton;
    
    //labels
    private JLabel titleLabel;
    
    //layout
    private CardLayout cl;
    
    private int currentCard=1;
    
    
    public void initComponent(){
        //create meta element of JFrame
        setTitle("TBC Analyzer Application");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        //create title panel
        titlePanel=new JPanel();
        titleLabel=new JLabel("TBC ANALYZER");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(titleLabel);
        titlePanel.setBackground(Color.black);
        titleLabel.setForeground(Color.WHITE);
        
        //create card Panel
        cardPanel=new JPanel();
        cl=new CardLayout();
        cardPanel.setLayout(cl);
        
        tbcPanel=new TBCPanel();
        diagnozePanel=new DiagnozePanel(); 
        addDataSetPanel=new AddDataSetPanel();
     
        cardPanel.add(tbcPanel, "1"); 
        cardPanel.add(diagnozePanel, "2");
        cardPanel.add(addDataSetPanel, "3"); 
        
        buttonPanel = new JPanel(); 
        buttonPanel.setLayout(new GridLayout(1,3));
        
        tbcButton=new JButton("TBC");
        diagnozeButton=new JButton("Diagnoze");
        addDataSetButton=new JButton("Add Data Set");
        
        buttonPanel.add(tbcButton);
        buttonPanel.add(diagnozeButton);
        buttonPanel.add(addDataSetButton);
        
        
        //adding title panel to main frame
        add(titlePanel,BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.SOUTH);
        add(cardPanel,BorderLayout.CENTER);
        
        //functions
        tbcButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.first(cardPanel);
                currentCard=1;
            }
        });
        
        addDataSetButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.last(cardPanel);
                currentCard=3;
            }
        });
        
        diagnozeButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                currentCard=2;
                cl.show(cardPanel,""+currentCard);
            }
        });
    }
    
    MainFrame(){
        initComponent();
        
    }
}
