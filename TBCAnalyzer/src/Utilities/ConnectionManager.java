
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Hanjaya
 */
public class ConnectionManager {
    private static Connection conn;
    private static String server = "jdbc:mysql://localhost/tbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String username = "root";
    private static String password = "";
    
    public static Connection getConnection(){
         if(conn == null){
             conn = connectDataBase();
         }
         return conn;
     }
   
        private static  Connection connectDataBase(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                System.out.println("Succes Konek ke Database");
                return DriverManager.getConnection(server, username, password); 
            } catch(ClassNotFoundException ex){
                System.out.println("JDBC not found");
            } catch(SQLException ex){
                System.out.println("Failed to connect to database " + ex.getMessage());
            } 
            return null;
        }
        
        public static void logOff(){
            try{
                getConnection().close();
                System.out.println("Koneksi Diputus!");
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
 
    
}
