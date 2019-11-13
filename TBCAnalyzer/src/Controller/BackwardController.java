/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Daniel
 */
public class BackwardController {
    
    public HashMap<String,String> bacaText(String url){
        HashMap<String, String> hashData = new HashMap<>();
        BufferedReader reader = null; //baca file
        String[] arrString = new String[2]; //simpen sementara
        try{
            File file = new File(url);
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while(line != null){
                line = line.trim();
                arrString = line.split("=");
                hashData.put(arrString[0], arrString[1]);
                line = reader.readLine();
                System.out.println(arrString[0] + " : " + hashData.get(arrString[0]));
            }
        } catch(IOException ex){
            ex.printStackTrace();
        }
        
        return hashData;
    }
    
    public ArrayList<String> getFact(Data setData){
        ArrayList<String> fact = new ArrayList<>();

        if(setData.isMerokok()){
            fact.add("Merokok");
        }
        
        if(setData.isKelembabanUdara()){
            fact.add("Kelembapan Udara");
        }
        
        if(setData.isKeadaanRumah()){
            fact.add("Keadaan Rumah Kotor");
        }
        
        if(setData.isDiabetes()){
            fact.add("Diabetes");
        }
        
        if(setData.isHiv()){
            fact.add("HIV");
        }
        
        if(setData.isBatuk()){
            fact.add("Batuk Berdarah");
        }
        
        if(setData.isSesakNafas()){
            fact.add("Sesak Nafas");
        }
        
        if(setData.isNyeriDada()){
            fact.add("Nyeri Dada");
        }
        
        if(setData.isDahak()){
            fact.add("Dahak");
        }
        
        if(setData.isDemam()){
            fact.add("Demam");
        }
        
        if(setData.isNafsuMakan()){
            fact.add("Nafsu Makan Berkurang");
        }
        
        if(setData.isKeringatMalam()){
            fact.add("Keringat Malam");
        }
        
        if(setData.isTurunBeratBadan()){
            fact.add("Turun Berat Badan");
        }
        
        return fact;
    }
    
    public String searchingGoals(HashMap<String, String> hashRule, String rule, HashMap<String, String> visited, HashMap<String, String> goal){
        boolean pilih;
        String[] arrData = new String[2];
        for(String data : hashRule.keySet()){
            pilih = true;

            for(String visit : visited.keySet()){
                if(data.equals(visit)){
                    pilih = false;
                }
            }    
            
            if(hashRule.get(data).equals(rule) && pilih == true){
                return data;
            }
        }
        return null;
    }
    
    public String getDataGoal(HashMap<String, String> goal, ArrayList<String> sudahDicari){
        for(String data : goal.keySet()){
            if(goal.get(data).equals("n") && sudahDicari.contains(data) == false){
                return data;
            }
        }
        return null;
    }
    
    public boolean checkingFact(HashMap<String, String> goal){
        for(String data : goal.keySet()){
            if(goal.get(data).equals("n")){
                return false;
            }
        }
        return true;
    }
    
    public HashMap<String, String> checkingGoal(HashMap<String, String> goal, ArrayList<String> arrFact, HashMap<String, String> hashData, HashMap<String, String> hashRule){
        for(String data : goal.keySet()){
            for(int i = 0; i < arrFact.size(); i++){
                if(arrFact.get(i).equals(hashData.get(data))){
                    goal.put(data, "y");
                }
            }
        }
        
        for(String temp : goal.keySet()){
            if(goal.get(temp).equals("n")){
                for(String temp2 : hashRule.keySet()){
                    if(temp.equals(hashRule.get(temp2))){
                        if(temp2.length() > 1){
                            String[] arrTemp = temp2.split(":");
                            for(int i = 0; i < arrFact.size(); i++){   
                                if(arrFact.get(i).equals(hashData.get(arrTemp[0]))){
                                    for(int j = 0; j < arrFact.size(); j++){
                                        if(arrFact.get(j).equals(hashData.get(arrTemp[1]))){
                                            System.out.println(arrFact.get(j) + " = " + hashData.get(arrTemp[1]));
                                            goal.put(temp, "y");
                                            System.out.println("Temp : " + temp);
                                        }
                                    }
                                }
                            }
                        } else {
                            for(int i = 0; i < arrFact.size(); i++){
                                if(arrFact.get(i).equals(hashData.get(temp2))){
                                    goal.put(temp, "y");
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        return goal;
    }
}
