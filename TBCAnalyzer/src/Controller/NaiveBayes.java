
package Controller;

import java.util.ArrayList;
import Model.Data;
import Utilities.*;
/**
 *
 * @author Hanjaya
 */
public class NaiveBayes {
    private ArrayList<Data>dataList=new ArrayList<>();
    
    public void setArrayList(){
        dataList=DataAkses.getData();
    }
   
     //probabilitas a terhadap b
    public double getNaiveProbability(String a,String b,ArrayList<Data>dataList){
        
        
        //variables
        a=a.toLowerCase();
        b=b.toLowerCase();
        int pembilangTrue=0,pembilangFalse=0,penyebut=0;
        boolean naiveFalse=false;
        
        //process
        if(b.equals("tbc")){
            for (Data data : dataList) {
                if(data.isTBC()){
                    penyebut++;
                }
            }
            if(a.equals("merokok")){
                for (Data data : dataList) {
                    if(data.isMerokok() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("kelembabanudara")){
                for (Data data : dataList) {
                    if(data.isKelembabanUdara() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("keadaanrumah")){
                for (Data data : dataList) {
                    if(data.isKeadaanRumah() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("diabetes")){
                for (Data data : dataList) {
                    if(data.isDiabetes() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("hiv")){
                for (Data data: dataList) {
                    if(data.isHiv() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("batuk")){
                for (Data data: dataList) {
                    if(data.isBatuk() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("sesaknafas")){
                for (Data data: dataList) {
                    if(data.isSesakNafas() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("nyeridada")){
                for (Data data: dataList) {
                    if(data.isNyeriDada() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("dahak")){
                for (Data data: dataList) {
                    if(data.isDahak() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("demam")){
                for (Data data: dataList) {
                    if(data.isDemam() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("nafsumakan")){
                for (Data data: dataList) {
                    if(data.isNafsuMakan() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("keringatmalam")){
                for (Data data: dataList) {
                    if(data.isKeringatMalam() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("turunberatbadan")){
                for (Data data: dataList) {
                    if(data.isTurunBeratBadan() && data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("nomerokok")){
                naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isMerokok() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nokelembabanudara")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isKelembabanUdara() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nokeadaanrumah")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isKeadaanRumah() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nohiv")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isHiv() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nodiabetes")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isDiabetes() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nobatuk")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isBatuk() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nosesaknafas")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isSesakNafas() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nonyeridada")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isNyeriDada() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nodahak")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isDahak() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nodemam")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isDemam() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nonafsumakan")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isNafsuMakan() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nokeringatmalam")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isKeringatMalam() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("noturunberatbadan")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isTurunBeratBadan() && data.isTBC()){
                        pembilangFalse++;
                    }
                }
            } 
        }else{
            for (Data data : dataList) {
                if(!data.isTBC()){
                    penyebut++;
                }
            }
            
             if(a.equals("merokok")){
                for (Data data : dataList) {
                    if(data.isMerokok() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("kelembabanudara")){
                for (Data data : dataList) {
                    if(data.isKelembabanUdara() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("keadaanrumah")){
                for (Data data : dataList) {
                    if(data.isKeadaanRumah() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("diabetes")){
                for (Data data : dataList) {
                    if(data.isDiabetes() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("hiv")){
                for (Data data: dataList) {
                    if(data.isHiv() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("batuk")){
                for (Data data: dataList) {
                    if(data.isBatuk() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("sesaknafas")){
                for (Data data: dataList) {
                    if(data.isSesakNafas() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("nyeridada")){
                for (Data data: dataList) {
                    if(data.isNyeriDada() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("dahak")){
                for (Data data: dataList) {
                    if(data.isDahak() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("demam")){
                for (Data data: dataList) {
                    if(data.isDemam() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("nafsumakan")){
                for (Data data: dataList) {
                    if(data.isNafsuMakan() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("keringatmalam")){
                for (Data data: dataList) {
                    if(data.isKeringatMalam() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("turunberatbadan")){
                for (Data data: dataList) {
                    if(data.isTurunBeratBadan() && !data.isTBC()){
                        pembilangTrue++;
                    }
                }
            }else if(a.equals("nomerokok")){
                naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isMerokok() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nokelembabanudara")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isKelembabanUdara() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nokeadaanrumah")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isKeadaanRumah() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nohiv")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isHiv() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nodiabetes")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isDiabetes() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nobatuk")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isBatuk() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nosesaknafas")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isSesakNafas() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nonyeridada")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isNyeriDada() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nodahak")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isDahak() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nodemam")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isDemam() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nonafsumakan")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isNafsuMakan() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("nokeringatmalam")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isKeringatMalam() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }else if(a.equals("noturunberatbadan")){
                 naiveFalse=true;
                for (Data data : dataList) {
                    if(!data.isTurunBeratBadan() && !data.isTBC()){
                        pembilangFalse++;
                    }
                }
            }
    
        }
        
        if(naiveFalse){
            return (double)pembilangFalse/penyebut;
        }else{
            return (double)pembilangTrue/penyebut;
        }
        
    }
    
    //probabilitas a terhadap semua
    public double getNormalProbability(String a,ArrayList<Data>dataList){
        
        
        //variables
        int total=dataList.size();
        int pembilang=0;
        a=a.toLowerCase();
        if(a.equals("tbc")){
            for (Data data: dataList) {
                if(data.isTBC()){
                    pembilang++;
                }
            }
        }else{
            for (Data data : dataList) {
                if(!data.isTBC()){
                    pembilang++;
                }
            }
        }
        
        return (double)pembilang/total;
    }
    
   public void getPercentageNaive(){
       setArrayList();
       
       double PYes=getNormalProbability("tbc",dataList);
       double PNo=getNormalProbability("noTbc",dataList);
       
       System.out.println(getNaiveProbability("merokok","tbc",dataList));
       System.out.println(getNaiveProbability("nomerokok","tbc",dataList));
   }
   
 
}
