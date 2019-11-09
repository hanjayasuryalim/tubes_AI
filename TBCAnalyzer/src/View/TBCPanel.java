package View;

import java.awt.GridLayout;
import javax.swing.*;

import Utilities.ResizeImage;
import java.awt.Color;
import java.awt.Font;
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
        setLayout(null);
        
        //import imgae
        img = new JLabel(new ImageIcon(ResizeImage.resize("image\\\\\\\\tbc.jpg",250,200)));
        img.setBounds(15, 13, 250, 200);
        add(img);
        img2 = new JLabel(new ImageIcon(ResizeImage.resize("image\\\\\\\\mycobacterium.jpg", 250, 200)));
        img2.setBounds(15, 240, 250, 200);
        add(img2);
                
        //create descPanel
        explanation = new JLabel();
        explanation.setText("<html><div style='text-align: justify;'>Tuberkulosis (Tuberculosis, disingkat \nTbc), atau Tb (singkatan dari \"Tubercle bacillus\") "
                + "merupakan penyakit menular yang umum, dan dalam banyak kasus bersifat mematikan. Penyakit ini disebabkan "
                + "oleh berbagai strain mikobakteria, umumnya Mycobacterium tuberculosis (disingkat \"MTb\" atau \"MTbc\")."
                + " Tuberkulosis biasanya menyerang paru-paru, tetapi juga bisa berdampak pada bagian tubuh lainnya. <br><br>Tuberkulosis "
                + "menyebar melalui udara ketika seseorang dengan infeksi TB aktif batuk, bersin, atau menyebarkan butiran ludah"
                + " mereka melalui udara.Infeksi TB umumnya bersifat asimtomatikdan laten. Namun hanya satu dari sepuluh kasus "
                + "infeksi laten yang berkembang menjadi penyakit aktif. Bila Tuberkulosis tidak diobati maka lebih dari 50% "
                + "orang yang terinfeksi bisa meninggal.</div><html>");
        explanation.setFont(new Font("Sniglet", Font.BOLD, 14));
        explanation.setBounds(290, 10, 280, 440);
        add(explanation);
        
    }
}