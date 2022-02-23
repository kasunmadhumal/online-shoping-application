/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations.DashboardHomePageRepositoryOperations;

import com.mycompany.adminpanel.repository.DataRepository;
import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationWithoutParameters;

/**
 *
 * @author Kasun Madhumal
 */
public class RetrieveMinimumSalesItemsData implements RepositoryOperationWithoutParameters{
    private Statement st;
    private ResultSet rs ;
    private final Connection con;
    
    public  RetrieveMinimumSalesItemsData(){
        DataRepository dataRepository = new MySQLDatabaseConnection();
        con = dataRepository.getDatabaseConnection();
    
    }

    @Override
    public ResultSet OperationActivater() {
            try {


            st = con.createStatement();
            rs = st.executeQuery("SELECT items.id,items.productType,items.prize,items.brand,items.countOfItems,items.size,items.sportName,items.category,items.description,items.imagePath,SUM(sales.count) as no  FROM sales INNER JOIN items ON sales.id = items.id  group by items.id ORDER BY no ASC LIMIT 12");


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }
    
}
