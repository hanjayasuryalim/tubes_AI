
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Hanjaya
 */
public class ConnectionManager {
    private static String server="jdbc:mysql://localhost/tbc";
    private static String username="root";
    private static String password="";
    private static Connection connection;
    
    public static Connection getConnection() throws ClassNotFoundException{
        if(connection==null){
            connection=logOn();
        }
        return connection;
    }
    
    private static Connection logOn() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("conection build success!");
            return DriverManager.getConnection(server,username,password);
        }catch(SQLException e){
            e.printStackTrace(System.err);
            System.out.println("JDBC.ODBC not found!");
        }
        return null;
    }
    
    private static void logOff(){
        try{
            connection.close();
            System.out.println("connection closed!");
        }catch(Exception e){
            e.printStackTrace(System.err);
        }
    }
}
