
package com.mycompany.sportsitemapplication.dbconnection;

import java.sql.Connection;


public interface DataRepository {

 
  public void setDatabaseConnection();
  public Connection getDatabaseConnection();
    
}
