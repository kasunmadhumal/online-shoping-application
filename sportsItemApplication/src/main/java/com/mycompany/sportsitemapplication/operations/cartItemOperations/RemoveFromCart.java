/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportsitemapplication.operations.cartItemOperations;

import com.mycompany.sportsitemapplication.App;
import com.mycompany.sportsitemapplication.Main;
import com.mycompany.sportsitemapplication.dbconnection.DataRepository;
import com.mycompany.sportsitemapplication.dbconnection.MySQLDatabaseConnection;
import com.mycompany.sportsitemapplication.product.Product;
import com.mycompany.sportsitemapplication.view.Cart;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kasun Madhumal
 */
public class RemoveFromCart extends CartItemOperation {
    
    private int rowNumber;
    ArrayList<Product> list;
    private String ItemID;
    private int itemTableItemCount, cartTableCartCount,updateItemCount;
    
   
    
    public RemoveFromCart(String userID, int rowNumber,ArrayList<Product> list){
        
        this.userID = userID;
        this.rowNumber = rowNumber;
        this.list = list;
        selectedItemRemover(this.userID,this.itemID);


        
          
    }
    
    private void selectedItemRemover(String userName,String itemIDName){
      
        
        DataRepository dataRepository = new MySQLDatabaseConnection();
        ItemID = list.get(rowNumber).getId();
      
     
        try{
               Connection con = dataRepository.getDatabaseConnection();
//
//                st = con.createStatement();
//                st.executeQuery("DELETE FROM cart WHERE id ='"+itemIDName+"' AND email = '"+userName+"'");
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
            
//           System.out.print(updateItemCount);
//           System.out.print(ItemID);
//////         add items again to Item table count
////            Statement st;
////            st = con.createStatement();
////            st.executeQuery("UPDATE items SET countOfItems ="+Integer.toString(updateItemCount)+" WHERE id= '"+ItemID+"'");

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
