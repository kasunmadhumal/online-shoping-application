/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.RepositoryOperations;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Kasun Madhumal
 */
public interface RepositoryOperationDetailsOfSelectedDay {
    
    ResultSet OperationActivater();
   void setSelectedDate(Date selectedDate);
    
}
