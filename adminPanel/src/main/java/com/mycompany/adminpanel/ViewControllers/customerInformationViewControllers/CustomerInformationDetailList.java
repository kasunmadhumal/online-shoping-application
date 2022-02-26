
package com.mycompany.adminpanel.ViewControllers.customerInformationViewControllers;

import com.mycompany.adminpanel.AdminUsers.Customers;
import com.mycompany.adminpanel.RepositoryOperations.DataRepositoryOperationFactory;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationWithoutParameters;
import com.mycompany.adminpanel.RepositoryOperations.SearchCustomersDetails;
import com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers.CreateItemDetailListForHomePageTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CustomerInformationDetailList {
    
    private String CategoryOfShowingItems;
    private String userDetails;
    
    
    public CustomerInformationDetailList(String CategoryOfShowingItems){
            this.CategoryOfShowingItems = CategoryOfShowingItems;   
    }
    
    
    public void setUserDetails(String userDetails){
         this.userDetails = userDetails;
       
       }
    
    
        public ArrayList<Customers> getCustomerInformationDetailList() {
            
        ResultSet customerInformations;
        if("searchUserDetails".equals(CategoryOfShowingItems)){
        SearchCustomersDetails searchCustomersDetails = new DataRepositoryOperationFactory(CategoryOfShowingItems).getOperationActivatorForSearchUserDetails();
        searchCustomersDetails.setUserDetails(userDetails);
        customerInformations = searchCustomersDetails.OperationActivator();
        System.out.println(userDetails);
        
        }else{    
        RepositoryOperationWithoutParameters CustomerDetails =  new DataRepositoryOperationFactory(CategoryOfShowingItems).getOperationActivator();
        customerInformations = CustomerDetails.OperationActivator();
        }
        

        ArrayList<Customers> list = new ArrayList<>();

        Customers customer;

        try {
            while (customerInformations.next()) {
                
                double totalShopingAmount;
                if("topCustomer".equals(CategoryOfShowingItems)){totalShopingAmount =customerInformations.getDouble("no"); }
                else{totalShopingAmount = 0;}
               

                customer = new Customers(
                        customerInformations.getString("first_name"),
                        customerInformations.getString("last_name"),
                        customerInformations.getString("email"),
                       customerInformations.getString("username"),
                        totalShopingAmount,
                        customerInformations.getString("registerDate")
                  
                );
                list.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateItemDetailListForHomePageTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

        }
        
}
