
package com.mycompany.adminpanel.repository;

import java.sql.Connection;


public interface DataRepository {
    
        void setDatabaseConnection();
        Connection getDatabaseConnection();
    
}
