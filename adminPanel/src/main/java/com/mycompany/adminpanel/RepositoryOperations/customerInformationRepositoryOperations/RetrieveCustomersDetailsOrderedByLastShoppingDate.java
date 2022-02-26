
package com.mycompany.adminpanel.RepositoryOperations.customerInformationRepositoryOperations;

import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationWithoutParameters;
import com.mycompany.adminpanel.repository.DataRepository;
import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;


public class RetrieveCustomersDetailsOrderedByLastShoppingDate implements RepositoryOperationWithoutParameters{
        private Statement st;
    private ResultSet rs ;
    private  Connection con;
    
    public  RetrieveCustomersDetailsOrderedByLastShoppingDate(){
        DataRepository dataRepository = new MySQLDatabaseConnection();
        con = dataRepository.getDatabaseConnection();
    
    }

    @Override
    public ResultSet OperationActivator() {
            try {


            st = con.createStatement();
            rs = st.executeQuery("SELECT u.* FROM users u WHERE EXISTS(SELECT DISTINCT email FROM sales s WHERE u.email = s.email)");


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }
    
}
