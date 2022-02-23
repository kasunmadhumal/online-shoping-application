/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel;

import com.mycompany.adminpanel.repository.MySQLDatabaseConnection;
import com.mycompany.adminpanel.view.DasboardHomePage;

/**
 *
 * @author Kasun Madhumal
 */
public class Main {
    public static void main(String[] args){
          new DasboardHomePage().setVisible(true);
    
    }
    
}
