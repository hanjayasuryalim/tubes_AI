
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
    public double getNaiveProbability(String a,String b){
        setArrayList();
        
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
                    }else if(!data.isMerokok() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("kelembabanudara")){
                for (Data data : dataList) {
                    if(data.isKelembabanUdara() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isKelembabanUdara() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("keadaanrumah")){
                for (Data data : dataList) {
                    if(data.isKeadaanRumah() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isKeadaanRumah() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("diabetes")){
                for (Data data : dataList) {
                    if(data.isDiabetes() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isDiabetes() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("hiv")){
                for (Data data: dataList) {
                    if(data.isHiv() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isHiv() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("batuk")){
                for (Data data: dataList) {
                    if(data.isBatuk() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isBatuk() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("sesaknafas")){
                for (Data data: dataList) {
                    if(data.isSesakNafas() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isSesakNafas() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("nyeridada")){
                for (Data data: dataList) {
                    if(data.isNyeriDada() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isNyeriDada() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("dahak")){
                for (Data data: dataList) {
                    if(data.isDahak() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isDahak() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("demam")){
                for (Data data: dataList) {
                    if(data.isDemam() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isDemam() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("nafsumakan")){
                for (Data data: dataList) {
                    if(data.isNafsuMakan() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isNafsuMakan() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("keringatmalam")){
                for (Data data: dataList) {
                    if(data.isKeringatMalam() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isKeringatMalam() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("turunberatbadan")){
                for (Data data: dataList) {
                    if(data.isTurunBeratBadan() && data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isTurunBeratBadan() && data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
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
                    }else if(!data.isMerokok() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("kelembabanudara")){
                for (Data data : dataList) {
                    if(data.isKelembabanUdara() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isKelembabanUdara() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("keadaanrumah")){
                for (Data data : dataList) {
                    if(data.isKeadaanRumah() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isKeadaanRumah() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("diabetes")){
                for (Data data : dataList) {
                    if(data.isDiabetes() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isDiabetes() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("hiv")){
                for (Data data: dataList) {
                    if(data.isHiv() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isHiv() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("batuk")){
                for (Data data: dataList) {
                    if(data.isBatuk() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isBatuk() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("sesaknafas")){
                for (Data data: dataList) {
                    if(data.isSesakNafas() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isSesakNafas() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("nyeridada")){
                for (Data data: dataList) {
                    if(data.isNyeriDada() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isNyeriDada() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("dahak")){
                for (Data data: dataList) {
                    if(data.isDahak() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isDahak() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("demam")){
                for (Data data: dataList) {
                    if(data.isDemam() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isDemam() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("nafsumakan")){
                for (Data data: dataList) {
                    if(data.isNafsuMakan() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isNafsuMakan() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("keringatmalam")){
                for (Data data: dataList) {
                    if(data.isKeringatMalam() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isKeringatMalam() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
                    }
                }
            }else if(a.equals("turunberatbadan")){
                for (Data data: dataList) {
                    if(data.isTurunBeratBadan() && !data.isTBC()){
                        pembilangTrue++;
                    }else if(!data.isTurunBeratBadan() && !data.isTBC()){
                        pembilangFalse++;
                        naiveFalse=true;
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
    public double getNormalProbability(String a){
        setArrayList();
        
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
    
    
}
