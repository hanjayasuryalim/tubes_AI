
package Utilities;

import java.util.ArrayList;
import Model.Data;
import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hanjaya
 */
public class DataAkses {
    
    //select all
    public static ArrayList<Data> getData(){
        ArrayList<Data> listData=new ArrayList<>(); 
        ConnectionManager conManager = new ConnectionManager();
        
       try{
           String query = "select * from gejala";
            PreparedStatement st =  conManager.getConnection().prepareStatement(query);
            ResultSet rs = st.executeQuery();
            
             while (rs.next()) {
                Data data = new Data();
                data.setMerokok(rs.getBoolean("merokok"));
                data.setKelembabanUdara(rs.getBoolean("kelembabanUdara"));
                data.setKeadaanRumah(rs.getBoolean("keadaanRumah"));
                data.setDiabetes(rs.getBoolean("diabetes"));
                data.setHiv(rs.getBoolean("hiv"));
                data.setBatuk(rs.getBoolean("batuk"));
                data.setSesakNafas(rs.getBoolean("sesakNafas"));
                data.setNyeriDada(rs.getBoolean("nyeriDada"));
                data.setDahak(rs.getBoolean("dahak"));
                data.setDemam(rs.getBoolean("demam"));
                data.setNafsuMakan(rs.getBoolean("nafsuMakan"));
                data.setKeringatMalam(rs.getBoolean("keringatMalam"));
                data.setTurunBeratBadan(rs.getBoolean("turunBeratBadan"));
                data.setTBC(rs.getBoolean("TBC"));
                listData.add(data);
                
                
            }
       }catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
       return listData;
    }
    
    //add data to database
    public static void addData(Data data){
        String query="insert into gejala(merokok,kelembabanUdara,keadaanRumah,diabetes,hiv,batuk,sesakNafas,nyeriDada,dahak,demam,nafsuMakan,keringatMalam,turunBeratBadan,TBC)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            ConnectionManager conManager = new ConnectionManager();
            PreparedStatement st=conManager.getConnection().prepareStatement(query);
            st.setBoolean(1, data.isMerokok());
            st.setBoolean(2, data.isKelembabanUdara());
            st.setBoolean(3, data.isKeadaanRumah());
            st.setBoolean(4, data.isDiabetes());
            st.setBoolean(5, data.isHiv());
            st.setBoolean(6, data.isBatuk());
            st.setBoolean(7, data.isSesakNafas());
            st.setBoolean(8, data.isNyeriDada());
            st.setBoolean(9, data.isDahak());
            st.setBoolean(10, data.isDemam());
            st.setBoolean(11, data.isNafsuMakan());
            st.setBoolean(12, data.isKeringatMalam());
            st.setBoolean(13, data.isTurunBeratBadan());
            st.setBoolean(14, data.isTBC());
            
            st.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
