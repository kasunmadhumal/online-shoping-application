/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sportsitemapplication.dbconnection;

import java.sql.Connection;

/**
 *
 * @author Kasun Madhumal
 */
public interface DataRepository {

 
  public void setDatabaseConnection();
  public Connection getDatabaseConnection();
    
}
