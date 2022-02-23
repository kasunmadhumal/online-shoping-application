/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminpanel.ViewControllers.DailySalesViewControllers;

import com.mycompany.adminpanel.RepositoryOperations.DataRepositoryOperationFactory;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationDetailsOfSelectedDay;
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
public class DailySalesItemsShowing extends DefaultTableModel{
    
       private final  JTable jTable1;
       private final  String CategoryOfShowingItems; 
       private Date selectedDate;
       private double totalProfit=0;
  
       
       public DailySalesItemsShowing(JTable jTable1,String CategoryOfShowingItems,Date selectedDate){
                  this.selectedDate = selectedDate;
                  this.jTable1 = jTable1;
                  this.CategoryOfShowingItems = CategoryOfShowingItems;
                  populateJTable();
                  JTableWidth();
                  centerTableCellValue();
       
       
       }
       
       
                private void JTableWidth() {

        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(300);


    }

    private void centerTableCellValue() {

        //center table cell values
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
    }

    public final void populateJTable() {

        RepositoryOperationDetailsOfSelectedDay createItemDetailListForDailySalesTable = new DataRepositoryOperationFactory(CategoryOfShowingItems).getOperationActivaterForSelectedDateDetails();
        createItemDetailListForDailySalesTable.setSelectedDate(selectedDate);
        ResultSet detailsOfDailySalesItems = createItemDetailListForDailySalesTable.OperationActivater();
      
        
        String[] columnName = {"image", "Item Details", "sold Count", "Price","User Email","sold Date"};

        Object[][] rows = new Object[40][6];
        int i = 0;
           try {
               while (detailsOfDailySalesItems.next()) {
                   
                   try {
                       if (detailsOfDailySalesItems.getString("imagePath") != null) {
                           ImageIcon image = null;
                           
                           
                           image = new ImageIcon(new ImageIcon(detailsOfDailySalesItems.getString("imagePath")).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                           
                           rows[i][0] = image;
                           
                       } else {
                           rows[i][0] = null;
                       }
                   } catch (SQLException ex) {
                       Logger.getLogger(DailySalesItemsShowing.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
                   //create Item details to show in cart
                   String Details;
                   try {
                       Details = "<html><h2><b> Item name: " + detailsOfDailySalesItems.getString("sportName")+ " " +
                               detailsOfDailySalesItems.getString("productType") + "<br> Brand: " +
                               detailsOfDailySalesItems.getString("brand") + "<br> Size:" +
                               detailsOfDailySalesItems.getString("size") + "</b></h2></html>";
                       
                       rows[i][1] = Details;
                       
                       String sales = "<html><h1 style='color:blue;'><b> Sales Count: " + detailsOfDailySalesItems.getInt("count") +"</b></h1></html>";
                       rows[i][2] = sales;
                       rows[i][3] = "<html><h1><b>"+detailsOfDailySalesItems.getDouble("price")+"</b></html></h1>";
                       totalProfit += detailsOfDailySalesItems.getDouble("price");
                       rows[i][4] = "<html><h1><b>"+detailsOfDailySalesItems.getString("email")+"</b></h1></html>";
                       rows[i][5] = "<html><h1><b>"+detailsOfDailySalesItems.getString("soldDate")+"</b></h1></html>";
                       
                   } catch (SQLException ex) {
                       Logger.getLogger(DailySalesItemsShowing.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
                  
                    i++;
               }  } catch (SQLException ex) {
               Logger.getLogger(DailySalesItemsShowing.class.getName()).log(Level.SEVERE, null, ex);
           }
        
     

        // TheModel model = new TheModel(rows, columnName);
        DefaultTableModel model = new DefaultTableModel(rows, columnName) {

            @Override
            public Class getColumnClass(int column) {
                if (column == 0) {
                    return Icon.class;
                } else {
                    return getValueAt(0, column).getClass();
                }
            }
        };


        jTable1.setModel(model);


        jTable1.setRowHeight(150);
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(false);


    }
    
    
       public double getTotalProfit(){
        
            return totalProfit;
        }

    
    
}
