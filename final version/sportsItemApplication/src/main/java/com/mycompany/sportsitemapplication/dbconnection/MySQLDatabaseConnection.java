
package com.mycompany.sportsitemapplication.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class MySQLDatabaseConnection implements DataRepository{
    

    private Connection conn; 
    private final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/team 08";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "";
    
    public MySQLDatabaseConnection(){
       setDatabaseConnection();
    
    }
    
    
    @Override
    public void setDatabaseConnection(){
        try{
	    Class.forName(this.DB_DRIVER);
	    conn = DriverManager.getConnection(this.DB_URL, this.DB_USERNAME, this.DB_PASSWORD);
	}catch(ClassNotFoundException | SQLException e){
		}
    
    }
    
    @Override
    public Connection getDatabaseConnection(){
    
        return conn;
    }
    

 
        
    
}
