/* cette classe permet de se connecter à la base de donnée */

package application;

import java.sql.Connection;
import java.sql.DriverManager;


public class connect {
    Connection cnx =null;
    /*public static void main(String[] args)
 
    {
       Connection cnx =  connecterDB();
    }*/
    
    public static Connection connecterDB() {
      try{
 
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver ok");
         
       
        String url = "jdbc:mysql://localhost:3306/projet";
 
        String user = "root";
 
        String password = "root";
 
        Connection cnx = DriverManager.getConnection(url, user, password);
        System.out.println("connexion ok");
        return cnx;
      }catch(Exception e){
          e.printStackTrace();
          return null;
      }
       
 
}
    
    
}