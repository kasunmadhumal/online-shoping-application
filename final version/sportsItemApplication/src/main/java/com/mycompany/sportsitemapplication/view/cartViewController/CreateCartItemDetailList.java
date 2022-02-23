
package com.mycompany.sportsitemapplication.view.cartViewController;

import com.mycompany.sportsitemapplication.operations.cartItemOperations.RetrieveCartItemData;
import com.mycompany.sportsitemapplication.product.ProductImplementation;
import com.mycompany.sportsitemapplication.users.Customer;
import com.mycompany.sportsitemapplication.users.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateCartItemDetailList {
    
    User user ;
    String UserName ;
    
    public CreateCartItemDetailList(){
             user = new Customer();
             UserName = user.GetUsername();
             getCartItemList();
    }
    
    public ArrayList<ProductImplementation> getCartItemList(){
      
      RetrieveCartItemData retrieveCartItemData = new RetrieveCartItemData(UserName);
      ResultSet cartItemData = (ResultSet) retrieveCartItemData.cartItemDataRetriver();
      
      ArrayList<ProductImplementation> list = new ArrayList<>();
      
      ProductImplementation product;

        try {
            while(cartItemData.next()){
                
                product = new ProductImplementation(
                        cartItemData.getString("id"),
                        cartItemData.getString("sportName"),
                        cartItemData.getString("productType"),
                        cartItemData.getString("brand"),
                        cartItemData.getString("size"),
                        cartItemData.getDouble("prize"),
                        cartItemData.getInt("countOfItems"),
                        cartItemData.getInt("count"),
                        cartItemData.getString("category"),
                        cartItemData.getString("imagePath"),
                        cartItemData.getString("description")
                );
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateCartItemDetailList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
        
}
    
}   
      
      
    

