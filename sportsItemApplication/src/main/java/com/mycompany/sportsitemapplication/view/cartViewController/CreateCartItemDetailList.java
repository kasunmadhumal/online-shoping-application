/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportsitemapplication.view.cartViewController;

import com.mycompany.sportsitemapplication.operations.cartItemOperations.CartItemOperation;
import com.mycompany.sportsitemapplication.operations.cartItemOperations.RetrieveCartItemData;
import com.mycompany.sportsitemapplication.product.Product;
import com.mycompany.sportsitemapplication.users.Customer;
import com.mycompany.sportsitemapplication.users.User;
import com.mysql.cj.protocol.Resultset;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kasun Madhumal
 */
public class CreateCartItemDetailList {
    
    User user = new Customer();
    public String UserName = user.GetUsername();
    
    public CreateCartItemDetailList(){
             getCartItemList();
    }
    
    public ArrayList<Product> getCartItemList(){
      
      RetrieveCartItemData retrieveCartItemData = new RetrieveCartItemData(UserName);
      ResultSet cartItemData = (ResultSet) retrieveCartItemData.cartItemDataRetriver();
      
      ArrayList<Product> list = new ArrayList<>();
      
      Product product;

        try {
            while(cartItemData.next()){
                
                product = new Product(
                        cartItemData.getString("id"),
                        cartItemData.getString("sportName"),
                        cartItemData.getString("productType"),
                        cartItemData.getString("brand"),
                        cartItemData.getString("size"),
                        cartItemData.getDouble("prize"),
                        cartItemData.getInt("countOfItems"),
                        cartItemData.getInt("count"),
                        cartItemData.getString("category"),
                        cartItemData.getString("imagePath"),
                        cartItemData.getString("description")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateCartItemDetailList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
        
}
    
}   
      
      
    

