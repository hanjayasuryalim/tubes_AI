
package Controller;

import java.util.ArrayList;
import Model.Data;
import Utilities.*;
/**
 *
 * @author Hanjaya
 */
public class NaiveBayes {
    private static ArrayList<Data>dataList=new ArrayList<>();
    
    public static void setArrayList(){
        dataList=DataAkses.getData();
    }
   
     //probabilitas a terhadap b
    public static double getNaiveProbability(String a,String b,ArrayList<Data>dataList){
        
        
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
    public static double getNormalProbability(String a,ArrayList<Data>dataList){
        
        
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
    
   public static double getPercentageYesNaive(Data data){
       setArrayList();
       
       double probability=1;
       double PYes=getNormalProbability("tbc",dataList);   
       
       if(data.isMerokok()){
           probability*=getNaiveProbability("merokok","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nomerokok","tbc",dataList);
       }
       
       if(data.isKelembabanUdara()){
           probability*=getNaiveProbability("kelembabanudara","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nokelembabanudara","tbc",dataList);
       }
       
       if(data.isKeadaanRumah()){
           probability*=getNaiveProbability("keadaanrumah","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nokeadaanrumah","tbc",dataList);
       }
       
       if(data.isDiabetes()){
           probability*=getNaiveProbability("diabetes","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nodiabetes","tbc",dataList);
       }
       
       if(data.isHiv()){
           probability*=getNaiveProbability("hiv","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nohiv","tbc",dataList);
       }
       
       if(data.isBatuk()){
           probability*=getNaiveProbability("batuk","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nobatuk","tbc",dataList);
       }
       
       if(data.isSesakNafas()){
           probability*=getNaiveProbability("sesaknafas","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nosesaknafas","tbc",dataList);
       }
       
       if(data.isNyeriDada()){
           probability*=getNaiveProbability("nyeridada","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nonyeridada","tbc",dataList);
       }
       
       if(data.isDahak()){
           probability*=getNaiveProbability("dahak","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nodahak","tbc",dataList);
       }
       
       if(data.isDemam()){
           probability*=getNaiveProbability("demam","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nodemam","tbc",dataList);
       }
       
       if(data.isNafsuMakan()){
           probability*=getNaiveProbability("nafsumakan","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nonafsumakan","tbc",dataList);
       }
       
       if(data.isKeringatMalam()){
           probability*=getNaiveProbability("keringatmalam","tbc",dataList);
       }else{
           probability*=getNaiveProbability("nokeringatmalam","tbc",dataList);
       }
       
       if(data.isTurunBeratBadan()){
           probability*=getNaiveProbability("turunberatbadan","tbc",dataList);
       }else{
           probability*=getNaiveProbability("noturunberatbadan","tbc",dataList);
       }
       
       return PYes*probability;
   }
 
   public static double getPercentageNoNaive(Data data){
       setArrayList();
       
       double probability=1;
       double PNo=getNormalProbability("notbc",dataList);
       
       if(data.isMerokok()){
           probability*=getNaiveProbability("merokok","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nomerokok","notbc",dataList);
       }
       
       if(data.isKelembabanUdara()){
           probability*=getNaiveProbability("kelembabanudara","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nokelembabanudara","notbc",dataList);
       }
       
       if(data.isKeadaanRumah()){
           probability*=getNaiveProbability("keadaanrumah","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nokeadaanrumah","notbc",dataList);
       }
       
       if(data.isDiabetes()){
           probability*=getNaiveProbability("diabetes","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nodiabetes","notbc",dataList);
       }
       
       if(data.isHiv()){
           probability*=getNaiveProbability("hiv","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nohiv","notbc",dataList);
       }
       
       if(data.isBatuk()){
           probability*=getNaiveProbability("batuk","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nobatuk","notbc",dataList);
       }
       
       if(data.isSesakNafas()){
           probability*=getNaiveProbability("sesaknafas","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nosesaknafas","notbc",dataList);
       }
       
       if(data.isNyeriDada()){
           probability*=getNaiveProbability("nyeridada","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nonyeridada","notbc",dataList);
       }
       
       if(data.isDahak()){
           probability*=getNaiveProbability("dahak","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nodahak","notbc",dataList);
       }
       
       if(data.isDemam()){
           probability*=getNaiveProbability("demam","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nodemam","notbc",dataList);
       }
       
       if(data.isNafsuMakan()){
           probability*=getNaiveProbability("nafsumakan","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nonafsumakan","notbc",dataList);
       }
       
       if(data.isKeringatMalam()){
           probability*=getNaiveProbability("keringatmalam","notbc",dataList);
       }else{
           probability*=getNaiveProbability("nokeringatmalam","notbc",dataList);
       }
       
       if(data.isTurunBeratBadan()){
           probability*=getNaiveProbability("turunberatbadan","notbc",dataList);
       }else{
           probability*=getNaiveProbability("noturunberatbadan","notbc",dataList);
       }
       
       return PNo*probability;
   }
   
}
