
package com.mycompany.adminpanel.RepositoryOperations;


public interface RepositoryOperationForItemTableDataAdding {
    void OperationActivator();
    void setItemDetails(String itemID,String sportName,String productType,String brand,String size,
                        double prize,int countOfItems,String category,String description);
    
}
