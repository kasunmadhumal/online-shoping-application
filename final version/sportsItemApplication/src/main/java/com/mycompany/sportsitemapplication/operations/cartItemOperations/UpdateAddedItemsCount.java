
package com.mycompany.sportsitemapplication.operations.cartItemOperations;

import com.mycompany.sportsitemapplication.dbconnection.DataRepository;
import com.mycompany.sportsitemapplication.dbconnection.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;


public class UpdateAddedItemsCount extends CartItemOperation{

    private final int updateItemCount;
    private final int presentCartItemCount;
    private final int presentDatabaseItemCount;
    DataRepository dataRepository ;
    Connection con ;


    private int increasedItemCount,decreaseItemCount,itemCountForUpdateItemsTable;
    

    public UpdateAddedItemsCount(String itemID, String userID, int updateItemCount, int presentCartItemCount, int presentDatabaseItemCount) {
          this.itemID = itemID;
          this.userID = userID;
          this.updateItemCount = updateItemCount;
          this.presentCartItemCount = presentCartItemCount;
          this.presentDatabaseItemCount = presentDatabaseItemCount;
          dataRepository = new MySQLDatabaseConnection();
          con = dataRepository.getDatabaseConnection();
          cartItemCountUpdater();
       
          
    }
    
    private void cartItemCountUpdater(){
        //calculate increased or decreased item count in cart item
        if(updateItemCount > presentCartItemCount){
            increasedItemCount = updateItemCount - presentCartItemCount;
            itemCountForUpdateItemsTable = presentDatabaseItemCount - increasedItemCount;
        }else{
            decreaseItemCount = presentCartItemCount - updateItemCount;
            itemCountForUpdateItemsTable = presentDatabaseItemCount + decreaseItemCount;
        }

     


        try{


           


            //update cart table
            String queryToUpdateCart = "UPDATE cart SET count = ? WHERE id = ? AND email = ? ";
            PreparedStatement preparedStmtToUpdateCart = con.prepareStatement(queryToUpdateCart);
            preparedStmtToUpdateCart.setInt(1,updateItemCount);
            preparedStmtToUpdateCart.setString(2,itemID);
            preparedStmtToUpdateCart.setString(3,userID);

            preparedStmtToUpdateCart.execute();

            //update items table

            String queryToUpdateToItemsTable = "UPDATE items SET countOfItems = ? WHERE id = ?";
            PreparedStatement preparedStmtToUpdateItemsTable = con.prepareStatement(queryToUpdateToItemsTable);
            preparedStmtToUpdateItemsTable.setInt(1,itemCountForUpdateItemsTable);
            preparedStmtToUpdateItemsTable.setString(2,itemID);

            preparedStmtToUpdateItemsTable.execute();



        }catch(SQLException e){

            System.out.print(Arrays.toString(e.getStackTrace()));

        }





    }


    
}
