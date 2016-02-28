package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Article {
    
    public String nom,prix;
    public int id;
    static connect cnx = new connect();
    static Statement stm;
    static ResultSet rs;
      
 
    
    
    public static ArrayList<Article> getArticle(String type) throws SQLException{
        
       ArrayList<Article> listeArticle= new ArrayList<Article>();
       Article article = new Article();
       
       String requete =" select nom,prix from article where type='"+type+"'";
            
       stm = cnx.connecterDB().createStatement();
       rs = stm.executeQuery(requete);
       while(rs.next()){
               article.nom= rs.getString("nom") ;
               article.prix = rs.getString("prix");
               listeArticle.add(article);
                 }
            
       return listeArticle;
             }
    
    
}
    
