
package com.mycompany.sportsitemapplication.operations.cartItemOperations;

import com.mycompany.sportsitemapplication.dbconnection.DataRepository;
import com.mycompany.sportsitemapplication.dbconnection.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;


public class AddToCart extends CartItemOperation {
    
    private String userID,ItemID;
    private int numberOfItems;
    private int updateItemTableCount;
    DataRepository dataRepository ;
    Connection con ;
    
    
   public  AddToCart(String userID, String ItemID, int numberOfItems,int updateItemTableCount){
           this.ItemID = ItemID;
           this.userID = userID;
           this.numberOfItems = numberOfItems;
           this.updateItemTableCount = updateItemTableCount;
           dataRepository = new MySQLDatabaseConnection();
           con = dataRepository.getDatabaseConnection();
           cartAndItemTableUpdater();
    }
    
    public void cartAndItemTableUpdater(){
          
        try{
            
            //add to cart table
            String queryToAddToCart = "INSERT INTO cart ( email,id,count) VALUES ( ?,?,?) ";
            PreparedStatement preparedStmtToAddToCart = con.prepareStatement(queryToAddToCart);
            preparedStmtToAddToCart.setString(1,userID);
            preparedStmtToAddToCart.setString(2,ItemID);
            preparedStmtToAddToCart.setInt(3,numberOfItems);

            preparedStmtToAddToCart.execute();

            //update items table

            String queryToUpdateToItemsTable = "UPDATE items SET countOfItems = ? WHERE id = ?";
            PreparedStatement preparedStmtToUpdateItemsTable = con.prepareStatement(queryToUpdateToItemsTable);
            preparedStmtToUpdateItemsTable.setInt(1,updateItemTableCount);
            preparedStmtToUpdateItemsTable.setString(2,ItemID);

            preparedStmtToUpdateItemsTable.execute();









        }catch(SQLException e){

            System.out.print(Arrays.toString(e.getStackTrace()));

        }
    
    
    
    }

  
    
    
    
}
