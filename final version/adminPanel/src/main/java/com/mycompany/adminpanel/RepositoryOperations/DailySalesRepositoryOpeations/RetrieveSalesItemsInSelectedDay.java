/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations.DailySalesRepositoryOpeations;

import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationDetailsOfSelectedDay;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationWithoutParameters;
import com.mycompany.adminpanel.repository.DataRepository;
import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;



/**
 *
 * @author Kasun Madhumal
 */
public class RetrieveSalesItemsInSelectedDay implements RepositoryOperationDetailsOfSelectedDay {
    
    private Date selectedDate;
    private Statement st;
    private ResultSet rs ;
    private Connection con;
    
     public RetrieveSalesItemsInSelectedDay(){
        DataRepository dataRepository = new MySQLDatabaseConnection();
        con = dataRepository.getDatabaseConnection();
     }    
     
     @Override
    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }

    @Override
    public ResultSet OperationActivater() {
            try {

            
            String strDate = selectedDate.toString();
            st = con.createStatement();
            rs = st.executeQuery("SELECT sales.id, sales.count,sales.price,sales.email,sales.soldDate,items.productType,items.imagePath,items.sportName ,items.brand,items.size FROM "
                    + "sales INNER  JOIN items ON sales.id = items.id WHERE soldDate LIKE '%"+strDate+"%'");
            
           
           


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }

   
     
}
