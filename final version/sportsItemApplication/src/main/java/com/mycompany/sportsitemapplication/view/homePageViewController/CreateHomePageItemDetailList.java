
package com.mycompany.sportsitemapplication.view.homePageViewController;

import com.mycompany.sportsitemapplication.operations.HomePageViewOperations.MenuPagesItemsViewOperations;
import com.mycompany.sportsitemapplication.operations.HomePageViewOperations.RetrieveDiscountItemsData;
import com.mycompany.sportsitemapplication.product.DiscountProductImplementation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateHomePageItemDetailList {
 
    
    public CreateHomePageItemDetailList(){
            // getDiscountItemList();
    }
    
    public ArrayList<DiscountProductImplementation> getDiscountItemList(){

      MenuPagesItemsViewOperations retrieveDiscountItemsData = new RetrieveDiscountItemsData();
      ResultSet discountItemData = (ResultSet) retrieveDiscountItemsData.getResultData();
      
      ArrayList<DiscountProductImplementation> list = new ArrayList<>();
      
      DiscountProductImplementation product;

        try {
            while(discountItemData.next()){
                
                product = new DiscountProductImplementation(
                        discountItemData.getString("id"),
                        discountItemData.getString("sportName"),
                        discountItemData.getString("productType"),
                        discountItemData.getString("brand"),
                        discountItemData.getString("size"),
                        discountItemData.getDouble("prize"),
                        discountItemData.getInt("countOfItems"),
                        discountItemData.getDouble("discount"),
                        discountItemData.getString("category"),
                        discountItemData.getString("imagePath"),
                        discountItemData.getString("description")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateHomePageItemDetailList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
        
}
    
}
