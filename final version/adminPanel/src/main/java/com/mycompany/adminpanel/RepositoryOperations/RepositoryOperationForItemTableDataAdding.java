/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations;

/**
 *
 * @author Kasun Madhumal
 */
public interface RepositoryOperationForItemTableDataAdding {
    void OperationActivater();
    void setItemDetails(String itemID,String sportName,String productType,String brand,String size,
                        double prize,int countOfItems,String category,String description);
    
}
