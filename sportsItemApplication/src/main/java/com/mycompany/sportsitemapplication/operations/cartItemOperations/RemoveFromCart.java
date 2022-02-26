
package com.mycompany.sportsitemapplication.operations.cartItemOperations;

import com.mycompany.sportsitemapplication.dbconnection.DataRepository;
import com.mycompany.sportsitemapplication.dbconnection.MySQLDatabaseConnection;
import com.mycompany.sportsitemapplication.product.ProductImplementation;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;


public class RemoveFromCart extends CartItemOperation {
    
    private int rowNumber;
    ArrayList<ProductImplementation> list;
    private String ItemID;
    private int itemTableItemCount, cartTableCartCount,updateItemCount;
    DataRepository dataRepository ;
    Connection con ;
    
   
    
    public RemoveFromCart(String userID, int rowNumber,ArrayList<ProductImplementation> list){
        
        this.userID = userID;
        this.rowNumber = rowNumber;
        this.list = list;
        dataRepository = new MySQLDatabaseConnection();
        con = dataRepository.getDatabaseConnection();
        selectedItemRemover(this.userID,this.itemID);


        
          
    }
    
    private void selectedItemRemover(String userName,String itemIDName){
      
        
       
        ItemID = list.get(rowNumber).getId();     
      
     
        try{
               

            
            String query = "DELETE FROM cart WHERE id = ? AND email = ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1,ItemID);
            preparedStmt.setString(2,userID);

            // execute the preparedstatement
            preparedStmt.execute();
            
            
//calculate Update cart Item value
            for(int i =0;i<list.size();i++){
                 if(list.get(i).getId() == ItemID){
                    itemTableItemCount = list.get(i).getCountOfItem();
                    cartTableCartCount = list.get(i).getCountOfCartItem();
                    updateItemCount = itemTableItemCount + cartTableCartCount;
                    
                    
                 }
            
            }
            


            String queryToUpdate = "UPDATE items SET countOfItems = ? WHERE id = ?";
            PreparedStatement preparedStmtToUpdate = con.prepareStatement(queryToUpdate);
            preparedStmtToUpdate.setInt(1,updateItemCount);
            preparedStmtToUpdate.setString(2,ItemID);

            // execute the preparedstatement
            preparedStmtToUpdate.execute();


         

        }catch(SQLException e){
            
        System.out.print(Arrays.toString(e.getStackTrace()));
        
        }


       
    
    }
    
    
    
}
