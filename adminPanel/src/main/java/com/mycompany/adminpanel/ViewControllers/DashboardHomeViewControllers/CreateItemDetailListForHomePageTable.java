
package com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers;

import com.mycompany.adminpanel.RepositoryOperations.DataRepositoryOperationFactory;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationWithoutParameters;
import com.mycompany.adminpanel.product.ProductImplementation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateItemDetailListForHomePageTable {
    
    private String CategoryOfShowingItems;
    
    
    public CreateItemDetailListForHomePageTable(String CategoryOfShowingItems){
            this.CategoryOfShowingItems = CategoryOfShowingItems;   
    }
    
        public ArrayList<ProductImplementation> getHomaPageTableItemList() {
            
        RepositoryOperationWithoutParameters ItemDetails =  new DataRepositoryOperationFactory(CategoryOfShowingItems).getOperationActivator();
       
        ResultSet cartItemData = ItemDetails.OperationActivator();

        ArrayList<ProductImplementation> list = new ArrayList<>();

        ProductImplementation product;

        try {
            while (cartItemData.next()) {
               

                product = new ProductImplementation(
                        cartItemData.getString("id"),
                        cartItemData.getString("sportName"),
                        cartItemData.getString("productType"),
                        cartItemData.getString("brand"),
                        cartItemData.getString("size"),
                        cartItemData.getDouble("prize"),
                        cartItemData.getInt("countOfItems"),
                        cartItemData.getString("imagePath"),
                        cartItemData.getString("description"),
                        cartItemData.getString("category"),
                         cartItemData.getInt("no")
                        
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateItemDetailListForHomePageTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    
}
