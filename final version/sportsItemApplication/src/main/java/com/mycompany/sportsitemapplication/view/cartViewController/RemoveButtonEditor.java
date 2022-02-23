
package com.mycompany.sportsitemapplication.view.cartViewController;

import com.mycompany.sportsitemapplication.operations.cartItemOperations.RemoveFromCart;
import com.mycompany.sportsitemapplication.product.ProductImplementation;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class RemoveButtonEditor extends DefaultCellEditor{
        private final String buttonName = "Remove";
        public JButton button ;
        private String UserID;
        private int rowNumber;
        private JTable table;
        ArrayList<ProductImplementation> list;

        
        
       

    
    public RemoveButtonEditor(JCheckBox checkBox, ArrayList<ProductImplementation> list, String UserID)
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
            
            

           
          
  
    }   
        @Override
    public Object getCellEditorValue() 
    {
      return buttonName;
    }
    

  }
    

