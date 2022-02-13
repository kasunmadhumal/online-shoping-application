/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportsitemapplication.view.cartViewController;

import com.mycompany.sportsitemapplication.operations.cartItemOperations.RemoveFromCart;
import com.mycompany.sportsitemapplication.product.Product;
import com.mycompany.sportsitemapplication.view.Cart;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Kasun Madhumal
 */
public class RemoveButtonEditor extends DefaultCellEditor{
        private final String buttonName = "Remove";
        public JButton button ;
        private String UserID;
        private int rowNumber;
        private JTable table;
        ArrayList<Product> list;

        
        
       

    
    public RemoveButtonEditor(JCheckBox checkBox, ArrayList<Product> list, String UserID)
    { 
     
      super(checkBox);
      this.list = list;
      this.UserID = UserID;
      initComponents();

     
    }
    
    private void initComponents() {
        button = new javax.swing.JButton();
        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
    
    
    }
    

        @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
    boolean isSelected, int row, int column) 
    {
      rowNumber = row;
      button.setText(buttonName);
      this.table = table;
      return button;
      
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
            
            //remove the selected row in cart list
            new RemoveFromCart(UserID,rowNumber,list);
            new CartItemShowingInCartTable(table);
            
            
//            //close the all open windows in program
//            java.awt.Window win[] = java.awt.Window.getWindows();
//            for(int i=0;i<win.length;i++){
//               win[i].dispose();
//             }
//            
//            //open new cart window with updated data
//            Cart cart = new Cart();
//            cart.show();
           
          
  
    }   
        @Override
    public Object getCellEditorValue() 
    {
      return buttonName;
    }
    

  }
    

