
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Hanjaya
 */
public class ConnectionManager {
    private Connection conn;
    private static String server = "jdbc:mysql://localhost/tbc";
    private String username = "root";
    private String password = "";
    
    public Connection getConnection(){
         if(this.conn == null){
             this.conn = connectDataBase();
         }
         return conn;
     }
   
        private Connection connectDataBase(){
            try{
                Class.forName("com.mysql.jdbc.Driver"); 
                System.out.println("Succes Konek ke Database");
                return DriverManager.getConnection(server, username, password); 
            } catch(ClassNotFoundException ex){
                System.out.println("JDBC not found");
            } catch(SQLException ex){
                System.out.println("Failed to connect to database " + ex.getMessage());
            } 
            return null;
        }
        
        public void logOff(){
            try{
                getConnection().close();
                System.out.println("Koneksi Diputus!");
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
 
    
}
