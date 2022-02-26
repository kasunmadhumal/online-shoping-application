package com.mycompany.adminpanel.RepositoryOperations;


import java.sql.ResultSet;
import java.util.Date;

public interface RepositoryOperationForSelectDataRange {

    ResultSet OperationActivator(Date startDate, Date endDate);

}
