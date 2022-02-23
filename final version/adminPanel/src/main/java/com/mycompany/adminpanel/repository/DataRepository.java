/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.repository;

import java.sql.Connection;

/**
 *
 * @author Kasun Madhumal
 */
public interface DataRepository {
    
        void setDatabaseConnection();
        Connection getDatabaseConnection();
    
}
