
package com.mycompany.sportsitemapplication.operations.HomePageViewOperations;

import com.mycompany.sportsitemapplication.dbconnection.DataRepository;
import com.mycompany.sportsitemapplication.dbconnection.MySQLDatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;


public class RetrieveDiscountItemsData implements MenuPagesItemsViewOperations{

    private Statement st ;
    private ResultSet rs = null;
    DataRepository dataRepository = new MySQLDatabaseConnection();
    Connection con = dataRepository.getDatabaseConnection();



    @Override
    public ResultSet getResultData(){

        try{


            st = con.createStatement();
            rs = st.executeQuery("SELECT discounteditems.discount,discounteditems.id,items.sportName,items.productType,items.brand,items.size,items.prize,items.countOfItems,items.category,items.imagePath,items.description FROM discounteditems INNER JOIN items ON discounteditems.id = items.id");



        }catch(SQLException e){

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }



    
}
