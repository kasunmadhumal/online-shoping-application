
package com.mycompany.sportsitemapplication.operations.HomePageViewOperations;



import com.mycompany.sportsitemapplication.dbconnection.DataRepository;
import com.mycompany.sportsitemapplication.dbconnection.MySQLDatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class RetrieveItemsOfSelectedCategory implements MenuPagesItemsViewOperations{
            private Statement st ;
            private ResultSet rs = null;
            private final DataRepository dataRepository ;
            private final Connection con ;
            private final String selectedCategory;
            
            public RetrieveItemsOfSelectedCategory(String selectedCategory){
                dataRepository = new MySQLDatabaseConnection();
                con = dataRepository.getDatabaseConnection();
                this.selectedCategory = selectedCategory;
            
            }
    
    
            @Override
        public ResultSet getResultData(){

        try{

           if("Shoes".equals(selectedCategory) ||"Jersey".equals(selectedCategory) || "Shorts".equals(selectedCategory)){
            st = con.createStatement();
            rs = st.executeQuery("SELECT id,sportName,productType,brand,size,prize,countOfItems,category,imagePath,description FROM items WHERE productType = '"+selectedCategory+"'");
            
               
        }else if("Puma".equals(selectedCategory) ||"nike".equals(selectedCategory) || "adidas".equals(selectedCategory) ||"kappa".equals(selectedCategory) || "vilson".equals(selectedCategory)){
            st = con.createStatement();
            rs = st.executeQuery("SELECT id,sportName,productType,brand,size,prize,countOfItems,category,imagePath,description FROM items WHERE brand = '"+selectedCategory+"'");
            
            
        }else{
      
            st = con.createStatement();
            rs = st.executeQuery("SELECT id,sportName,productType,brand,size,prize,countOfItems,category,imagePath,description FROM items WHERE sportName LIKE '%"+selectedCategory+"%'");
            
        }
          



        }catch(SQLException e){

            System.out.print(Arrays.toString(e.getStackTrace()));

        }

        return rs;

    }
        


    
}
