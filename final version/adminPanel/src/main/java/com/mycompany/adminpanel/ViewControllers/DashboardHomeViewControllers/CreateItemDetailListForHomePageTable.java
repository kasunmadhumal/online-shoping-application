/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers;

import com.mycompany.adminpanel.RepositoryOperations.DataRepositoryOperationFactory;
import com.mycompany.adminpanel.RepositoryOperations.DashboardHomePageRepositoryOperations.RetrieveMinimumSalesItemsData;
import com.mycompany.adminpanel.RepositoryOperations.DashboardHomePageRepositoryOperations.RetrieveTopSalesItemsData;
import com.mycompany.adminpanel.product.ProductImplementation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationWithoutParameters;

/**
 *
 * @author Kasun Madhumal
 */
public class CreateItemDetailListForHomePageTable {
    
    private String CategoryOfShowingItems;
    public CreateItemDetailListForHomePageTable(String CategoryOfShowingItems){
            this.CategoryOfShowingItems = CategoryOfShowingItems;   
    }
    
        public ArrayList<ProductImplementation> getHomaPageTableItemList() {
            
        RepositoryOperationWithoutParameters ItemDetails =  new DataRepositoryOperationFactory(CategoryOfShowingItems).getOperationActivator();
       
        ResultSet cartItemData = ItemDetails.OperationActivater();

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
