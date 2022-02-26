
package com.mycompany.adminpanel.RepositoryOperations.updateItemDetailsPageRepositoyOperation;

import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationForItemTableDataAdding;
import com.mycompany.adminpanel.repository.DataRepository;
import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;


public class UpdateItemDataToItemTable implements RepositoryOperationForItemTableDataAdding{
    private String itemID;
    private String sportName;
    private String productType;
    private String brand;
    private String size;
    private double prize;
    private int countOfItems;
    private String category;
    private String description;
    
    
    
    private final Connection con;
    public UpdateItemDataToItemTable()
    {   
       
          DataRepository dataRepository = new MySQLDatabaseConnection();
          con = dataRepository.getDatabaseConnection();
          
          OperationActivator();
    
    }
    
    
    public void setItemDetails(String itemID,String sportName,String productType,String brand,String size,
                        double prize,int countOfItems,String category,String description)
    {
         this.itemID = itemID;
        this.sportName = sportName;
        this.productType = productType;
        this.brand = brand;
        this.size = size;
        this.prize = prize;
        this.countOfItems = countOfItems;
        this.category = category;
        this.description = description;
    
    
    
    }
    

    

    @Override
    public void OperationActivator(){
       
             try {

            
            String queryToUpdateItemsTable = "UPDATE items SET sportName = ?, productType = ?,brand = ?,size = ?, prize = ?,countOfItems = ?,category = ?,description = ? WHERE id = ?";
            PreparedStatement preparedStmtToUpdateItemDetails = con.prepareStatement(queryToUpdateItemsTable);
            preparedStmtToUpdateItemDetails.setString(1, sportName);
            preparedStmtToUpdateItemDetails.setString(2, productType);
            preparedStmtToUpdateItemDetails.setString(3, brand);
            preparedStmtToUpdateItemDetails.setString(4, size);
            preparedStmtToUpdateItemDetails.setDouble(5, prize);
            preparedStmtToUpdateItemDetails.setInt(6, countOfItems);
            preparedStmtToUpdateItemDetails.setString(7, category);
            preparedStmtToUpdateItemDetails.setString(8, description);
            preparedStmtToUpdateItemDetails.setString(9, itemID);

            preparedStmtToUpdateItemDetails.execute();


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }
             
     
    
    }



    
}
