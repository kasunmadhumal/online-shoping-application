/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations.customerInformationRepositoryOperations;

import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationWithoutParameters;
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
public class RetrieveTopCustomersDetails implements RepositoryOperationWithoutParameters {
    
    private Statement st;
    private ResultSet rs ;
    private  Connection con;
    
    public  RetrieveTopCustomersDetails(){
        DataRepository dataRepository = new MySQLDatabaseConnection();
        con = dataRepository.getDatabaseConnection();
    
    }

    @Override
    public ResultSet OperationActivater() {
            try {


            st = con.createStatement();
            rs = st.executeQuery("SELECT users.email,users.username,users.password,users.first_name,users.last_name,users.registerDate,SUM(sales.price) as no  FROM sales INNER JOIN users ON sales.email = users.email  group by users.email ORDER BY no DESC");


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }
    
}
