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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private JButton proses;
    
    //button Group
    private ButtonGroup merokok;
    private ButtonGroup kelembapan;
    private ButtonGroup keadaanRumah;
    private ButtonGroup diabetes;
    private ButtonGroup hiv;
    private ButtonGroup batuk;
    private ButtonGroup sesakNafas;
    private ButtonGroup nyeriDada;
    private ButtonGroup dahak;
    private ButtonGroup demam;
    private ButtonGroup nafsuMakan;
    private ButtonGroup keringatMalam;
    private ButtonGroup turunBeratBadan;
    
    //JRadio Button
    private JRadioButton merokokYes;
    private JRadioButton kelembapanYes;
    private JRadioButton keadaanRumahYes;
    private JRadioButton diabetesYes;
    private JRadioButton hivYes;
    private JRadioButton batukYes;
    private JRadioButton sesakNafasYes;
    private JRadioButton nyeriDadaYes;
    private JRadioButton dahakYes;
    private JRadioButton demamYes;
    private JRadioButton nafsuMakanYes;
    private JRadioButton keringatMalamYes;
    private JRadioButton turunBeratBadanYes;
    private JRadioButton temp2;
    
    private Data setData = new Data();
    
    
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
        JPanel formPanel=new JPanel(new GridLayout(13,3));
        JPanel buttonPanel=new JPanel(new GridLayout(1,1));
        
        //create panelNavbar
        JPanel navbar = new JPanel(new GridLayout(1,2));
        navbar.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));
        back = new JLabel(new ImageIcon(ResizeImage.resize("image/Back.png", 50, 50)), JLabel.LEFT);
        navbar.add(back);        
        img = new JLabel(new ImageIcon(ResizeImage.resize("image/NaiveBayesTitle.png", 200, 50)), JLabel.RIGHT);
        navbar.add(img);
        mainPanel.add(navbar, BorderLayout.NORTH);
        
        //CONTENT 
        JPanel contentPanel = new JPanel(new GridLayout(13,3));
        contentPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            //Merokok
        temp = new JLabel("Merokok", JLabel.CENTER);
        contentPanel.add(temp);
        merokokYes = new JRadioButton("Yes");
        contentPanel.add(merokokYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        merokok = new ButtonGroup();
        merokok.add(merokokYes);
        merokok.add(temp2);
        
            //KelembapanUdara
        temp = new JLabel("Kelembapan Udara", JLabel.CENTER);
        contentPanel.add(temp);
        kelembapanYes = new JRadioButton("Lembap");
        contentPanel.add(kelembapanYes);
        temp2 = new JRadioButton("Tidak Lembap");
        contentPanel.add(temp2);
        kelembapan = new ButtonGroup();
        kelembapan.add(kelembapanYes);
        kelembapan.add(temp2);
        
            //KeadaanRumah
        temp = new JLabel("Keadaan Rumah", JLabel.CENTER);
        contentPanel.add(temp);
        keadaanRumahYes = new JRadioButton("Bersih");
        contentPanel.add(keadaanRumahYes);
        temp2 = new JRadioButton("Kotor");
        contentPanel.add(temp2);
        keadaanRumah = new ButtonGroup();
        keadaanRumah.add(keadaanRumahYes);
        keadaanRumah.add(temp2);
        
            //Diabetes
        temp = new JLabel("Diabetes", JLabel.CENTER);
        contentPanel.add(temp);
        diabetesYes = new JRadioButton("Yes");
        contentPanel.add(diabetesYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        diabetes = new ButtonGroup();
        diabetes.add(diabetesYes);
        diabetes.add(temp2);
        
            //HIV
        temp = new JLabel("HIV", JLabel.CENTER);
        contentPanel.add(temp);
        hivYes = new JRadioButton("Yes");
        contentPanel.add(hivYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        hiv = new ButtonGroup();
        hiv.add(hivYes);
        hiv.add(temp2);
        
            //Batuk
        temp = new JLabel("Batuk", JLabel.CENTER);
        contentPanel.add(temp);
        batukYes = new JRadioButton("Yes");
        contentPanel.add(batukYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        batuk = new ButtonGroup();
        batuk.add(batukYes);
        batuk.add(temp2);
        
            //SesakNafas
        temp = new JLabel("Sesak Nafas", JLabel.CENTER);
        contentPanel.add(temp);
        sesakNafasYes = new JRadioButton("Yes");
        contentPanel.add(sesakNafasYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        sesakNafas = new ButtonGroup();
        sesakNafas.add(sesakNafasYes);
        sesakNafas.add(temp2);
        
            //NyeriDada
        temp = new JLabel("Sakit Dada", JLabel.CENTER);
        contentPanel.add(temp);
        nyeriDadaYes = new JRadioButton("Yes");
        contentPanel.add(nyeriDadaYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        nyeriDada = new ButtonGroup();
        nyeriDada.add(nyeriDadaYes);
        nyeriDada.add(temp2);
        
            //Dahak
        temp = new JLabel("Dahak", JLabel.CENTER);
        contentPanel.add(temp);
        dahakYes = new JRadioButton("Yes");
        contentPanel.add(dahakYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        dahak = new ButtonGroup();
        dahak.add(dahakYes);
        dahak.add(temp2);
        
            //Demam
        temp = new JLabel("Demam", JLabel.CENTER);
        contentPanel.add(temp);
        demamYes = new JRadioButton("Yes");
        contentPanel.add(demamYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        demam = new ButtonGroup();
        demam.add(demamYes);
        demam.add(temp2);
        
            //NafsuMakan
        temp = new JLabel("Nafsu Makan", JLabel.CENTER);
        contentPanel.add(temp);
        nafsuMakanYes = new JRadioButton("Bertambah");
        contentPanel.add(nafsuMakanYes);
        temp2 = new JRadioButton("Berkurang");
        contentPanel.add(temp2);
        nafsuMakan = new ButtonGroup();
        nafsuMakan.add(nafsuMakanYes);
        nafsuMakan.add(temp2);
        
            //KeringatMalam
        temp = new JLabel("Keringat Malam", JLabel.CENTER);
        contentPanel.add(temp);
        keringatMalamYes = new JRadioButton("Yes");
        contentPanel.add(keringatMalamYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        keringatMalam = new ButtonGroup();
        keringatMalam.add(keringatMalamYes);
        keringatMalam.add(temp2);
        
            //TurunBeratBadan
        temp = new JLabel("Turun Berat Badan", JLabel.CENTER);
        contentPanel.add(temp);
        turunBeratBadanYes = new JRadioButton("Yes");
        contentPanel.add(turunBeratBadanYes);
        temp2 = new JRadioButton("No");
        contentPanel.add(temp2);
        turunBeratBadan = new ButtonGroup();
        turunBeratBadan.add(turunBeratBadanYes);
        turunBeratBadan.add(temp2);
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        
        //Footer
        JPanel footerPanel = new JPanel(new FlowLayout());
        proses = new JButton("Proses");
        footerPanel.add(proses);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);
        
        temp = new JLabel("             ");
        add(temp, BorderLayout.EAST);
        temp = new JLabel("             ");
        add(temp, BorderLayout.WEST);
        
        
        //add to frame
        getContentPane().add(mainPanel);
        
        //actionListener
        back.addMouseListener(new mouseAction());   
        
        proses.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(merokokYes.isSelected()){ //rokok
                    setData.setMerokok(true);
                } else {
                    setData.setMerokok(false);
                }
                
                if(kelembapanYes.isSelected()){ //kelembapan
                    setData.setKelembabanUdara(true);
                } else {
                    setData.setKelembabanUdara(false);
                }
                
                if(keadaanRumahYes.isSelected()){ //keadaanrumah
                    setData.setKeadaanRumah(true);
                } else {
                    setData.setKeadaanRumah(false);
                }
                
                if(diabetesYes.isSelected()){ //diabetes
                    setData.setDiabetes(true);
                } else {
                    setData.setDiabetes(false);
                }
                
                if(hivYes.isSelected()){ //hiv
                    setData.setHiv(true);
                } else {
                    setData.setHiv(false);
                }
                
                if(batukYes.isSelected()){ //batuk
                    setData.setBatuk(true);
                } else {
                    setData.setBatuk(false);
                }
                
                if(sesakNafasYes.isSelected()){ //sesakNafas
                    setData.setSesakNafas(true);
                } else {
                    setData.setSesakNafas(false);
                }
                
                if(nyeriDadaYes.isSelected()){ //nyeridada
                    setData.setNyeriDada(true);
                } else {
                    setData.setNyeriDada(false);
                }
                
                if(dahakYes.isSelected()){ //dahak
                    setData.setDahak(true);
                } else {
                    setData.setDahak(false);
                }
                
                if(demamYes.isSelected()){ //demam
                    setData.setDemam(true);
                } else {
                    setData.setDemam(false);
                }
                
                if(nafsuMakanYes.isSelected()){ //NafsuMakan
                    setData.setNafsuMakan(true);
                } else {
                    setData.setNafsuMakan(false);
                }
                
                if(keringatMalamYes.isSelected()){ //keringatMalam
                    setData.setKeringatMalam(true);
                } else {
                    setData.setKeringatMalam(false);
                }
                
                if(turunBeratBadanYes.isSelected()){ //turunBeratBadan
                    setData.setTurunBeratBadan(true);
                } else {
                    setData.setTurunBeratBadan(false);
                }
                
                System.out.println(setData.toString()); //pengecekan data
            }
        });
            
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
