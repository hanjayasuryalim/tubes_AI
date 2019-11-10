
package View;

import Model.Data;
import Utilities.DataAkses;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Sherina
 */
public class AddDataSetPanel extends JPanel {
    private JLabel temp;
    private JLabel img;
    private JLabel back;

    private JButton submit;
    private JButton reset;
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
    private ButtonGroup tbc;
    
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
    private JRadioButton tbcYes;
    
    
    private Data setData = new Data();
    
    public AddDataSetPanel(){
        setLayout(new BorderLayout());
        //CONTENT 
        JPanel contentPanel = new JPanel(new GridLayout(14,3));
        contentPanel.setBorder(BorderFactory.createMatteBorder(2, 3, 3, 3, Color.BLACK));
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
        nafsuMakanYes = new JRadioButton("Berkurang");
        contentPanel.add(nafsuMakanYes);
        temp2 = new JRadioButton("Tidak");
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
        
            //TBC
        temp = new JLabel("TBC", JLabel.CENTER);
        contentPanel.add(temp);
        tbcYes = new JRadioButton("TBC");
        contentPanel.add(tbcYes);
        temp2 = new JRadioButton("Tidak TBC");
        contentPanel.add(temp2);
        tbc = new ButtonGroup();
        tbc.add(tbcYes);
        tbc.add(temp2);   
        
        add(contentPanel, BorderLayout.CENTER);
        
        //Footer
        JPanel footerPanel = new JPanel(new FlowLayout());
        submit = new JButton("Submit");
        footerPanel.add(submit);
        reset = new JButton("Reset");
        footerPanel.add(reset);
        
        add(footerPanel, BorderLayout.SOUTH);        
        
        temp = new JLabel("             ");
        add(temp, BorderLayout.EAST);
        temp = new JLabel("             ");
        add(temp, BorderLayout.WEST);
        
        //actionListener  
        reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                merokok.clearSelection();
                kelembapan.clearSelection();
                keadaanRumah.clearSelection();
                diabetes.clearSelection();
                hiv.clearSelection();
                batuk.clearSelection();
                sesakNafas.clearSelection();
                nyeriDada.clearSelection();
                dahak.clearSelection();
                demam.clearSelection();
                nafsuMakan.clearSelection();
                keringatMalam.clearSelection();
                turunBeratBadan.clearSelection();
                tbc.clearSelection();
            }
        });
                
        submit.addActionListener(new ActionListener(){
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
                
                if(tbcYes.isSelected()){ //TBC
                    setData.setTBC(true);
                }else{
                    setData.setTBC(false);
                }
                      
                boolean check_value = DataAkses.addData(setData);
                if(check_value){
                    merokok.clearSelection();
                    kelembapan.clearSelection();
                    keadaanRumah.clearSelection();
                    diabetes.clearSelection();
                    hiv.clearSelection();
                    batuk.clearSelection();
                    sesakNafas.clearSelection();
                    nyeriDada.clearSelection();
                    dahak.clearSelection();
                    demam.clearSelection();
                    nafsuMakan.clearSelection();
                    keringatMalam.clearSelection();
                    turunBeratBadan.clearSelection();
                    tbc.clearSelection();
                }
            }
        });
    }
}
