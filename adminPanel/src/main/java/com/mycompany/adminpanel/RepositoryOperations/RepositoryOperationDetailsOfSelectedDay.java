
package com.mycompany.adminpanel.RepositoryOperations;

import java.sql.ResultSet;
import java.util.Date;


public interface RepositoryOperationDetailsOfSelectedDay {
    
    ResultSet OperationActivator();
   void setSelectedDate(Date selectedDate);
    
}
