/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.ViewControllers.customerInformationViewControllers;

import com.mycompany.adminpanel.AdminUsers.Customers;
import com.mycompany.adminpanel.RepositoryOperations.DataRepositoryOperationFactory;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationDetailsOfSelectedDay;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationWithoutParameters;
import com.mycompany.adminpanel.ViewControllers.DailySalesViewControllers.DailySalesItemsShowing;
import com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers.CreateItemDetailListForHomePageTable;
import com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers.EditButton;
import com.mycompany.adminpanel.product.ProductImplementation;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kasun Madhumal
 */
public class CustomerInformationShowingInTable extends DefaultTableModel {
    
       private  JTable jTable1;
       private  String CategoryOfShowingItems; 
       private String userDetails = "";
  
       
       public CustomerInformationShowingInTable(JTable jTable1,String CategoryOfShowingItems){
                  this.jTable1 = jTable1;
                  this.CategoryOfShowingItems = CategoryOfShowingItems;

       
       
       }
       
       public void setUserDetails(String userDetails){
         this.userDetails = userDetails;
         populateJTable();
         JTableWidth();
         centerTableCellValue();
       
       }
       
  
      
  

  
       
         private void JTableWidth() {

        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(350);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(350);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(400);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(300);



    }

    private void centerTableCellValue() {

        //center table cell values
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
    }

    public final void populateJTable() {

        CustomerInformationDetailList customerInformationDetailList = new CustomerInformationDetailList(CategoryOfShowingItems);
        customerInformationDetailList.setUserDetails(userDetails);
        ArrayList<Customers> list = customerInformationDetailList.getCustomerInformationDetailList();
        String[] columnName = {"user name", "Email", "Register Date", "Total shoping amount"};

        Object[][] rows = new Object[list.size()][5];
        for (int i = 0; i < list.size(); i++) {

      
            rows[i][0] = "<html><h2><b>"+list.get(i).getFisrtName()+" "+list.get(i).getLasttName()+"</b></h2></html>";

            rows[i][1] = "<html><h2><b>"+list.get(i).getEmail()+"</b></h2></html>";
            
            rows[i][2] = "<html><h2><b>"+list.get(i).getRegisterDate()+"</b></h2></html>";
            rows[i][3] = "<html><h1><b>"+list.get(i).getTotalShopingAmount()+"</b></html></h1>";
         
            
        }

        // TheModel model = new TheModel(rows, columnName);
        DefaultTableModel model = new DefaultTableModel(rows, columnName) {

            @Override
            public Class getColumnClass(int column) {
            
                    return getValueAt(0, column).getClass();
                
            }
        };


        jTable1.setModel(model);



        jTable1.setRowHeight(90);
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(false);


    }

}