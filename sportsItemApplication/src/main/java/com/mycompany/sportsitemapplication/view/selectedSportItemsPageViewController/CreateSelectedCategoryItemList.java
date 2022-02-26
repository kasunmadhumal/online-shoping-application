
package com.mycompany.sportsitemapplication.view.selectedSportItemsPageViewController;

import com.mycompany.sportsitemapplication.operations.HomePageViewOperations.MenuPagesItemsViewOperations;
import com.mycompany.sportsitemapplication.operations.HomePageViewOperations.RetrieveItemsOfSelectedCategory;
import com.mycompany.sportsitemapplication.product.ProductImplementation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateSelectedCategoryItemList {
    private String category;
  
    
    public CreateSelectedCategoryItemList(String category){
         this.category = category;
       
    }
    
     public ArrayList<ProductImplementation> getItemDetailsAboutSelectedCategory(){

      MenuPagesItemsViewOperations retrieveItemsOfSelectedCategory = new RetrieveItemsOfSelectedCategory(category);
      ResultSet ItemDataFromSelectedItem = (ResultSet) retrieveItemsOfSelectedCategory.getResultData();
      
      ArrayList<ProductImplementation> list = new ArrayList<>();
      
       ProductImplementation product;

        try {
            while(ItemDataFromSelectedItem.next()){
                
                product = new ProductImplementation(
                        ItemDataFromSelectedItem.getString("id"),
                        ItemDataFromSelectedItem.getString("sportName"),
                        ItemDataFromSelectedItem.getString("productType"),
                        ItemDataFromSelectedItem.getString("brand"),
                        ItemDataFromSelectedItem.getString("size"),
                        ItemDataFromSelectedItem.getDouble("prize"),
                        ItemDataFromSelectedItem.getInt("countOfItems"),
                        0,
                        ItemDataFromSelectedItem.getString("category"),
                        ItemDataFromSelectedItem.getString("imagePath"),
                        ItemDataFromSelectedItem.getString("description")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateSelectedCategoryItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
        
}
    
}
