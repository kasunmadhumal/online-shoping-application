/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations;

import java.sql.ResultSet;

/**
 *
 * @author Kasun Madhumal
 */
public class AddNewItemData implements RepositoryOperationWithoutParameters {
    private String itemID;
    private String sportName;
    private String productType;
    private String brand;
    private String size;
    private double prize;
    private int countOfItems;
    private String category;
    private String description;

    @Override
    public ResultSet OperationActivater() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
