/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;
//import javax.swing.*;

public class ForwardChain { 
    private static boolean result;
    private static ArrayList<Boolean> list =  new ArrayList<Boolean>();
    
    public static boolean isResult() {
        return result;
    }
    
    public static void isiFakta(Data setData){         
            list.add(setData.isMerokok()); //0
            list.add(setData.isKelembabanUdara()); //1
            list.add(setData.isKeadaanRumah()); //2
            list.add(setData.isDiabetes()); //3
            list.add(setData.isHiv()); //4
            list.add(setData.isBatuk()); //5
            list.add(setData.isSesakNafas()); //6
            list.add(setData.isNyeriDada()); //7
            list.add(setData.isDahak()); //8
            list.add(setData.isDemam()); //9
            list.add(setData.isNafsuMakan()); //10
            list.add(setData.isKeringatMalam()); //11
            list.add(setData.isTurunBeratBadan()); //12
            list.add(false);//TBC 13

        result = hasilTBC(list);
    }
    
    public static boolean hasilTBC(ArrayList<Boolean> list){
        boolean flag = true;
        
        //openWindow();
        while(flag == true && list.get(13).equals(false)){
            if(list.get(0).equals(true) && list.get(3).equals(false)){ // merokok maka diabetes
                list.set(3, true);
            }else if(list.get(1).equals(true) && list.get(6).equals(false)){ // lembab maka sesak nafas
                list.set(6, true);
            }else if(list.get(2).equals(false) && list.get(6).equals(false)){ //rumah kotor maka sesak nafas
                list.set(6, true);
            }else if(list.get(10).equals(true) && list.get(12).equals(false)){ // nafsu makan berkurang maka turun berat
                list.set(12, true);
            }else if(list.get(9).equals(true) && list.get(12).equals(true) && list.get(4).equals(false)){ //demam dan turun berat maka HIV
                list.set(4, true);
            }else if(list.get(4).equals(true) && list.get(11).equals(false)){ //HIV maka keringat malam
                list.set(11, true);
            }else if(list.get(3).equals(true) && list.get(6).equals(false)){ //diabetes maka sesak nafas
                list.set(6, true);
            }else if(list.get(9).equals(true) && list.get(7).equals(false)){ //demam maka nyeri dada
                list.set(7, true);
            }else if(list.get(6).equals(true) && list.get(7).equals(false)){ //sesak nafas maka nyeri dada
                list.set(7, true);
            }else if(list.get(10).equals(true) && list.get(1).equals(true) && list.get(7).equals(false)){ //nafsu makan berkurang dan lembab maka nyeri dada
                list.set(7, true);
            }else if(list.get(7).equals(true) && list.get(4).equals(true) && list.get(5).equals(false)){ //nafsu makan berkurang dan lembab maka nyeri dada
                list.set(5, true);
            }else if(list.get(5).equals(true) && list.get(3).equals(true) && list.get(13).equals(false)){ //nafsu makan berkurang dan lembab maka nyeri dada
                list.set(13, true);
            }else{
                flag = false;
            }
        }
        System.out.println(list);
        list.clear();
        return flag;
    }
    
    /*
    public static void openWindow(){
        JFrame process = new JFrame();
        process.setVisible(true);
        process.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        process.setSize(300,300);
        process.setLocation(1000, 1000);
        process.setTitle("Forward Chaining Process");
        process.setLocationRelativeTo(null);
    }
    */
}
