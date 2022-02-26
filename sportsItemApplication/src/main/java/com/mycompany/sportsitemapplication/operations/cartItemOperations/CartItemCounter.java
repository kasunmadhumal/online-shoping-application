/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsitemapplication.operations.cartItemOperations;

import com.mycompany.sportsitemapplication.dbconnection.DataRepository;
import com.mycompany.sportsitemapplication.dbconnection.MySQLDatabaseConnection;
import com.mycompany.sportsitemapplication.users.Customer;
import com.mycompany.sportsitemapplication.users.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;


public class CartItemCounter extends CartItemOperation{
    

    private Statement st;
    private ResultSet rs = null;
    DataRepository dataRepository ;
    Connection con ;
    
    public CartItemCounter(){
 
          User user = new Customer();
          this.userID = user.getEmail();
          dataRepository = new MySQLDatabaseConnection();
          con = dataRepository.getDatabaseConnection();
    
    }
    
     public ResultSet getCartItemCount() {

        try {


            st = con.createStatement();
            rs = st.executeQuery("SELECT SUM(count) FROM cart WHERE email ='" + userID + "'");


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }
    
    
    
}
