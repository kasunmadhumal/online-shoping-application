
package com.mycompany.sportsitemapplication.operations.cartItemOperations;

import com.mycompany.sportsitemapplication.dbconnection.DataRepository;
import com.mycompany.sportsitemapplication.dbconnection.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;


public class RetrieveCartItemData extends CartItemOperation{
    
    
    private Statement st ;
    private ResultSet rs = null;
    DataRepository dataRepository ;
    Connection con ;
   
    
    public RetrieveCartItemData(String userID){
       this.userID = userID;
       dataRepository = new MySQLDatabaseConnection();
       con = dataRepository.getDatabaseConnection();
    }
    
    
    public ResultSet cartItemDataRetriver(){
  
        try{
               
               
                st = con.createStatement();
                rs = st.executeQuery("SELECT cart.email,cart.id,cart.count,items.sportName,items.productType,items.brand,items.size,items.prize,items.countOfItems,items.category,items.imagePath,items.description FROM cart INNER JOIN items ON cart.id = items.id WHERE email = '"+userID+"'");

              

        }catch(SQLException e){
            
        System.out.print(Arrays.toString(e.getStackTrace()));
        
        }
        
        return rs;
    
    }
    
    
     public ResultSet discountItemsInCartList(){
 
        try{
                
               
                st = con.createStatement();
                rs = st.executeQuery("SELECT cart.id, discounteditems.discount FROM cart INNER JOIN discounteditems ON cart.id=discounteditems.id WHERE email = '"+userID+"'");
              

        }catch(SQLException e){
            
        System.out.print(Arrays.toString(e.getStackTrace()));
        
        }
        
        return rs;
     
     
     
     }
    
}
