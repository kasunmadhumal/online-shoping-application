
package com.mycompany.adminpanel.RepositoryOperations.DailySalesRepositoryOpeations;

import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationDetailsOfSelectedDay;
import com.mycompany.adminpanel.repository.DataRepository;
import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;




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
    public ResultSet OperationActivator() {
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
