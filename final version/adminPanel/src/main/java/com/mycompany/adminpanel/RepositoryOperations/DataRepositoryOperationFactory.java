/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations;

import com.mycompany.adminpanel.RepositoryOperations.AddNewItemsRepositoryOperation.AddnewItemToItemTable;
import com.mycompany.adminpanel.RepositoryOperations.DailySalesRepositoryOpeations.RetrieveSalesItemsInSelectedDay;
import com.mycompany.adminpanel.RepositoryOperations.DashboardHomePageRepositoryOperations.RetrieveMinimumSalesItemsData;
import com.mycompany.adminpanel.RepositoryOperations.updateItemDetailsPageRepositoyOperation.UpdateItemDataToItemTable;
import com.mycompany.adminpanel.RepositoryOperations.DashboardHomePageRepositoryOperations.RetrieveTopSalesItemsData;
import com.mycompany.adminpanel.RepositoryOperations.customerInformationRepositoryOperations.RetrieveCustomersDetailsOrderedByLastShoppingDate;
import com.mycompany.adminpanel.RepositoryOperations.customerInformationRepositoryOperations.RetrieveCustomersDetailsOrderedByRegisterDate;
import com.mycompany.adminpanel.RepositoryOperations.customerInformationRepositoryOperations.RetrieveSearchCutomerDetails;
import com.mycompany.adminpanel.RepositoryOperations.customerInformationRepositoryOperations.RetrieveTopCustomersDetails;

/**
 *
 * @author Kasun Madhumal
 */
public class DataRepositoryOperationFactory {
    
       String operation;
       public DataRepositoryOperationFactory(String operation){
         this.operation = operation;
       
       }
    
    
    public RepositoryOperationWithoutParameters getOperationActivator(){

        RepositoryOperationWithoutParameters repositoryOperation = null;

        if (operation.equals("TopSales")) {
            repositoryOperation = (RepositoryOperationWithoutParameters) new RetrieveTopSalesItemsData();

        } else if (operation.equals("MinimumSales")) {
            repositoryOperation = (RepositoryOperationWithoutParameters) new RetrieveMinimumSalesItemsData();

        } else if (operation.equals("lastShopingDate")) {
            repositoryOperation = (RepositoryOperationWithoutParameters) new RetrieveCustomersDetailsOrderedByLastShoppingDate();

        } else if (operation.equals("registerDate")) {
            repositoryOperation = (RepositoryOperationWithoutParameters) new RetrieveCustomersDetailsOrderedByRegisterDate();

        } else if (operation.equals("topCustomer")) {
            repositoryOperation = (RepositoryOperationWithoutParameters) new RetrieveTopCustomersDetails();

        } 
        
        

        return repositoryOperation;
    }
    
    public RepositoryOperationForItemTableDataAdding getOperationActivaterForTableUpdating(){
         RepositoryOperationForItemTableDataAdding repositoryOperationForItemTableDataAdding = null;
         
         if(operation.equals("itemDetailsUpdate")){
            repositoryOperationForItemTableDataAdding = (RepositoryOperationForItemTableDataAdding) new UpdateItemDataToItemTable();
         }else if(operation.equals("addNew")){
             repositoryOperationForItemTableDataAdding = (RepositoryOperationForItemTableDataAdding)new AddnewItemToItemTable();
         }
         
         return repositoryOperationForItemTableDataAdding;
    
    
    }
    
        public RepositoryOperationDetailsOfSelectedDay getOperationActivaterForSelectedDateDetails(){
         RepositoryOperationDetailsOfSelectedDay repositoryOperationDetailsOfSelectedDay = null;
         
         if(operation.equals("DailySalesDetails")){
            repositoryOperationDetailsOfSelectedDay = (RepositoryOperationDetailsOfSelectedDay) new RetrieveSalesItemsInSelectedDay();
         }
         
         return repositoryOperationDetailsOfSelectedDay;
    
    
    }
        
        public SearchCustomersDetails getOperationActivaterForSearchUserDetails(){
           SearchCustomersDetails searchCustomersDetails  = null;
           if(operation.equals("searchUserDetails")){
             searchCustomersDetails = (SearchCustomersDetails) new RetrieveSearchCutomerDetails();
           }
           
           return searchCustomersDetails;
        }
    
}
