/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations.customerInformationRepositoryOperations;

import com.mycompany.adminpanel.RepositoryOperations.SearchCustomersDetails;
import com.mycompany.adminpanel.repository.DataRepository;
import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author Kasun Madhumal
 */
public class RetrieveSearchCutomerDetails implements SearchCustomersDetails{
    
    private Statement st;
    private ResultSet rs ;
    private  Connection con;
    private String userDetail;
    
    public  RetrieveSearchCutomerDetails(){
        DataRepository dataRepository = new MySQLDatabaseConnection();
        con = dataRepository.getDatabaseConnection();
    
    }

    @Override
    public ResultSet OperationActivater() {
            try {


            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM users WHERE username LIKE '%"+userDetail+"%'");


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }
    

    @Override
    public void setUserDetails(String userDetail) {
        
        this.userDetail = userDetail;
      
    }

   
    
    
}
