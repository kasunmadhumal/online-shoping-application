/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations.AddNewItemsRepositoryOperation;

import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationForItemTableDataAdding;
import com.mycompany.adminpanel.repository.DataRepository;
import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

/**
 *
 * @author Kasun Madhumal
 */
public class AddnewItemToItemTable implements RepositoryOperationForItemTableDataAdding {
    String itemID;
    String sportName;
    String productType;
    String brand;
    String size;
    double prize;
    int countOfItems;
    String category;
    String description;
    
    private  Connection con;
    public AddnewItemToItemTable()
    {   
       
          DataRepository dataRepository = new MySQLDatabaseConnection();
          con = dataRepository.getDatabaseConnection();
          
          OperationActivater();
    
    }
    
    
    @Override
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
    public void OperationActivater(){
       
             try {
            String imagePath = "src\\main\\java\\com\\mycompany\\sportsitemapplication\\view\\img\\";
            String id = sportName+ productType + brand + size;
            String queryToUpdateItemsTable = "INSERT INTO items(id,sportName,productType,brand,size,prize,countOfItems,category,imagePath,description) VALUES (?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement preparedStmtToUpdateItemDetails = con.prepareStatement(queryToUpdateItemsTable);
            preparedStmtToUpdateItemDetails.setString(1,id);
            preparedStmtToUpdateItemDetails.setString(2,sportName );
            preparedStmtToUpdateItemDetails.setString(3,productType);
            preparedStmtToUpdateItemDetails.setString(4,brand);
            preparedStmtToUpdateItemDetails.setString(5,size);
            preparedStmtToUpdateItemDetails.setDouble(6,prize);
            preparedStmtToUpdateItemDetails.setInt(7,countOfItems);
            preparedStmtToUpdateItemDetails.setString(8,category);
            preparedStmtToUpdateItemDetails.setString(9, imagePath);
            preparedStmtToUpdateItemDetails.setString(10,description);

            preparedStmtToUpdateItemDetails.execute();


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }
             
     
    
    }


    
}
