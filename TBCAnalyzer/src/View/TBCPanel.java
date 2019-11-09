package View;

import java.awt.GridLayout;
import javax.swing.*;

import Utilities.ResizeImage;
import java.awt.Color;
/**
 *
 * @author Hanjaya
 */
public class TBCPanel extends JPanel{
    private JPanel imagePanel;
    private JPanel descPanel;
    private JLabel img;
    private JLabel img2;
    private JLabel explanation;
    
    TBCPanel(){
        setLayout(new GridLayout(1,2));
       
        //create imagePanel
        imagePanel=new JPanel();
        imagePanel.setLayout(new GridLayout(2,1));
        img=new JLabel(new ImageIcon(ResizeImage.resize("image\\\\\\\\tbc.jpg",250,200)));
        img2=new JLabel(new ImageIcon(ResizeImage.resize("image\\\\\\\\mycobacterium.jpg", 250, 200)));
        
        imagePanel.add(img);
        imagePanel.add(img2);
        imagePanel.setBackground(Color.LIGHT_GRAY);
        add(imagePanel);
        
        //create descPanel
        descPanel=new JPanel();
        descPanel.setLayout(new GridLayout(1,1));
        descPanel.setBackground(Color.LIGHT_GRAY);
        explanation=new JLabel();
        explanation.setText("<html>Tuberkulosis (Tuberculosis, disingkat \nTbc), atau Tb (singkatan dari \"Tubercle bacillus\") "
                + "merupakan penyakit menular yang umum, dan dalam banyak kasus bersifat mematikan. Penyakit ini disebabkan "
                + "oleh berbagai strain mikobakteria, umumnya Mycobacterium tuberculosis (disingkat \"MTb\" atau \"MTbc\")."
                + "Tuberkulosis biasanya menyerang paru-paru, tetapi juga bisa berdampak pada bagian tubuh lainnya. Tuberkulosis "
                + "menyebar melalui udara ketika seseorang dengan infeksi TB aktif batuk, bersin, atau menyebarkan butiran ludah"
                + " mereka melalui udara.Infeksi TB umumnya bersifat asimtomatikdan laten. Namun hanya satu dari sepuluh kasus "
                + "infeksi laten yang berkembang menjadi penyakit aktif. Bila Tuberkulosis tidak diobati maka lebih dari 50% "
                + "orang yang terinfeksi bisa meninggal.<html>");
        explanation.setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);
        descPanel.add(explanation);
        add(descPanel);
    }
}