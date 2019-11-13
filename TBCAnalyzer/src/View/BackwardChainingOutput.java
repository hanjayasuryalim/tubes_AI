/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.Data;
import Controller.BackwardController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;
/**
 *
 * @author Daniel
 */
public class BackwardChainingOutput extends JFrame{
    BackwardController obj = new BackwardController();
    private JLabel temp;
    private JButton process;
    
    Data setData;
    
    private HashMap<String, String> hashData = obj.bacaText("data/Fact.txt");
    private HashMap<String, String> hashRule = obj.bacaText("data/RuleBased.txt");
    
    private HashMap<String, String> visited = new HashMap<>();
    private HashMap<String, String> goal = new HashMap<>();
    
    public BackwardChainingOutput(Data setData){
        this.setData = setData;
        setSize(700,600);
        setLocationRelativeTo(null);
        setTitle("Backward Chaining Output");
        setResizable(false);
        initComponent();
    }
    
    private void initComponent(){
        //get data fact
        ArrayList<String> arrFact = obj.getFact(setData);
        //GUI
        Font f = new Font("Sniglet", Font.BOLD, 15);
        
            //create mainPanel
        JPanel mainPanel = new JPanel(new BorderLayout());
        
            //create KeteranganPanel
        JPanel outerKeteranganPanel = new JPanel(new BorderLayout());
        outerKeteranganPanel.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        temp = new JLabel("Keterangan", JLabel.CENTER);
        temp.setFont(f);
        outerKeteranganPanel.add(temp, BorderLayout.NORTH);
        
        JPanel keteranganPanel = new JPanel(new GridLayout(4,4));
        keteranganPanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        
        for(String data : hashData.keySet()){
            temp = new JLabel(data + " : " + hashData.get(data), JLabel.LEFT);
            temp.setFont(f);
            keteranganPanel.add(temp);
        }
        outerKeteranganPanel.add(keteranganPanel, BorderLayout.CENTER);
        
        //CReate midPanel
        JPanel contentPanel = new JPanel(new GridLayout(3,1));         
            //create RulePanel
        JPanel outerRulePanel = new JPanel(new BorderLayout());
        outerRulePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        temp = new JLabel("Rule Based", JLabel.CENTER);
        temp.setFont(f);
        outerRulePanel.add(temp, BorderLayout.NORTH);
        
        String[] arr = {"R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", "R11", "R12"};
        JLabel[] label = new JLabel[12];
        int i = 0;
        String[] arrTemp = new String[2];
        JPanel rulePanel = new JPanel(new GridLayout(4,3));
        rulePanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        for(String data : hashRule.keySet()){
            String a = data;
            label[i] = new JLabel();
            if(a.length() == 3){               
                arrTemp = a.split(":");
                String rule = arr[i] + " : IF " + arrTemp[0] + " AND " + arrTemp[1] + " THEN " + hashRule.get(data);
                label[i].setText(rule);
                
            } else {
                String rule = arr[i] + " : IF " + a + " THEN " + hashRule.get(data);
                label[i].setText(rule);
            }
            label[i].setFont(f);
            rulePanel.add(label[i]);            
            i++;
        }
        outerRulePanel.add(rulePanel, BorderLayout.CENTER);
        contentPanel.add(outerRulePanel);
        
                         
            //Create FactPanel
        JPanel outerFactPanel = new JPanel(new BorderLayout());
        outerFactPanel.setBorder(BorderFactory.createEmptyBorder(5, 3, 5, 3));
        temp = new JLabel("Fact", JLabel.CENTER);
        temp.setFont(f);
        outerFactPanel.add(temp, BorderLayout.NORTH);
        
        JPanel factPanel = new JPanel(new GridLayout(4,4));
        factPanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        String[] arr2 = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13"};  
        JLabel[] label2 = new JLabel[13];
        for(int j = 0; j < arrFact.size(); j++){ //arr Fact itu kumpulan fact
            label2[j] = new JLabel(arr2[j] + " : " + arrFact.get(j));
            label2[j].setFont(f);
            factPanel.add(label2[j]);         
        }
        outerFactPanel.add(factPanel, BorderLayout.CENTER); 
        contentPanel.add(outerFactPanel);
        
        temp = new JLabel("Did you get TBC?", JLabel.CENTER);
        temp.setFont(f);
        contentPanel.add(temp);
        
            //create button
        process = new JButton("Process");
        process.setFont(f);
        mainPanel.add(process, BorderLayout.SOUTH);
        
        //add to mainFrame
        mainPanel.add(outerKeteranganPanel, BorderLayout.NORTH);
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        
        temp = new JLabel("     ");
        mainPanel.add(temp, BorderLayout.EAST);
        temp = new JLabel("     ");
        mainPanel.add(temp, BorderLayout.WEST);
        
        getContentPane().add(mainPanel);
        
        //function
        process.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                boolean result = true;
                String search;
                ArrayList<String> sudahDicari = new ArrayList<>();
                while(result && visited.size() != hashRule.size() ){
                    if(visited.isEmpty()){                      
                        search = obj.searchingGoals(hashRule, "Z", visited, goal); //cari data ada di rule mana 
                        sudahDicari.add("Z");
                        System.out.println("Masuk SINI : " + search);
                    } else { 
                        String rule = obj.getDataGoal(goal, sudahDicari);
                        System.out.println("YAng dicari : " + rule);
                        search = obj.searchingGoals(hashRule, rule, visited, goal);
                        sudahDicari.add(rule);
                        System.out.println("MASUK ELSE : " + search);
                    }
                    
                    if(search!=null){
                        boolean coba = false;
                        boolean coba2 = false;
                        //searching jalur yang didapat ada berapa
                        if(search.length() != 1){
                            String[] arrData = search.split(":");   
                            goal.put(arrData[0], "n");
                            for(int k = 0; k < arrFact.size(); k++){
                                if(arrFact.get(k).equals(hashData.get(arrData[0]))){
                                    goal.put(arrData[0], "y");
                                    coba = true;
                                    System.out.println("Masukkin ke Goal : " + arrData[0]);
                                    break;
                                }
                            }
                            goal.put(arrData[1], "n");
                            for(int l = 0; l < arrFact.size(); l++){
                                if(arrFact.get(l).equals(hashData.get(arrData[1]))){                               
                                    goal.put(arrData[1], "y");
                                    coba2 = true;
                                    System.out.println("Masukkin ke Goal : " + arrData[1]);
                                    break;
                                }
                            }

                            if(coba==true && coba2==true){
                                arrFact.add(hashData.get(hashRule.get(search)));
                                System.out.println("Masukin ke Fact : " + hashData.get(hashRule.get(search)));
                            }

                        } else {
                            goal.put(search, "n");
                            for(int k = 0; k < arrFact.size(); k++){
                                if(arrFact.get(k).equals(hashData.get(search))){
                                    goal.put(search, "y");
                                    System.out.println("Masukkin ke Goal : " + search);
                                    arrFact.add(hashData.get(hashRule.get(search))); 
                                    System.out.println("Masukin ke Fact : " + hashData.get(hashRule.get(search)));
                                    break;
                                }
                            }
                        }
                        
                        visited.put(search, hashRule.get(search));
                        System.out.println("Yang sudah didatangi : " + search + " = " + hashRule.get(search));
                        
                        goal = obj.checkingGoal(goal, arrFact, hashData, hashRule);

                        //sout goal
                        System.out.println("Fact : ");
                        for(int k = 0; k < arrFact.size(); k++){
                            System.out.println(arrFact.get(k));
                        }

                        //sout goal
                        System.out.println("Goal : ");
                        for(String akhir : goal.keySet()){
                            System.out.println(akhir + " : " + goal.get(akhir));
                        }
                        
                    } else {
                        result = false;
                        JOptionPane.showMessageDialog(null, "Anda Tidak Terkena Penyakit TBC");
                    }
                    

                    if(obj.checkingFact(goal)){ //pengecekan goal sudah tercapai atau belum
                        result = false;
                        JOptionPane.showMessageDialog(null, "Anda Terkena Penyakit TBC");
                    }
                }
            }
        });
    }
    
    
}
