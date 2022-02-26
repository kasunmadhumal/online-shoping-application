package com.mycompany.adminpanel.RepositoryOperations.soldCategoryComparison;

import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationForSelectDataRange;
import com.mycompany.adminpanel.repository.DataRepository;
import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;

public class EachSportSalesDetails implements RepositoryOperationForSelectDataRange{
    private Statement st;
    private ResultSet rs ;
    private Connection con;
    private Date startDate;
    private Date endDate;

    public  EachSportSalesDetails(){
        DataRepository dataRepository = new MySQLDatabaseConnection();
        con = dataRepository.getDatabaseConnection();

    }

    @Override
    public ResultSet OperationActivator(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        try {


            st = con.createStatement();
            rs = st.executeQuery("SELECT items.sportName, SUM(sales.count) as no  FROM sales INNER JOIN items ON sales.id = items.id WHERE   DATE(soldDate) BETWEEN '"+startDate+"' AND '"+endDate+"' group by items.sportName");


        } catch (SQLException e) {

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }
}
