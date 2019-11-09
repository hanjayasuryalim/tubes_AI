
package View;

import Utilities.ResizeImage;
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
        //Font
        Font f = new Font("Sniglet", Font.BOLD, 18);
        
        //create meta element of JFrame
        setTitle("TBC Analyzer Application");
        setSize(600,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        //create title panel
        titlePanel = new JPanel();
        titlePanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.black));
        titleLabel = new JLabel(new ImageIcon(ResizeImage.resize("image/TBCAnalyzer.png", 250, 60)));
        titlePanel.add(titleLabel);
        
        //create card Panel
        cardPanel = new JPanel();
        cl = new CardLayout();
        cardPanel.setLayout(cl);
        
        tbcPanel = new TBCPanel();
        diagnozePanel=new DiagnozePanel(); 
        addDataSetPanel=new AddDataSetPanel();
     
        cardPanel.add(tbcPanel, "1"); 
        cardPanel.add(diagnozePanel, "2");
        cardPanel.add(addDataSetPanel, "3"); 
        
        buttonPanel = new JPanel(); 
        buttonPanel.setLayout(new GridLayout(1,3));
        
        tbcButton = new JButton("TBC");
        tbcButton.setFont(f);
        diagnozeButton = new JButton("Diagnoze");
        diagnozeButton.setFont(f);
        addDataSetButton = new JButton("Add Data Set");
        addDataSetButton.setFont(f);
        
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
    
    public MainFrame(){
        initComponent();
        
    }
}
