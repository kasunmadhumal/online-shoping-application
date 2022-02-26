
package com.mycompany.sportsitemapplication.view.cartViewController;

import com.mycompany.sportsitemapplication.operations.cartItemOperations.UpdateAddedItemsCount;
import com.mycompany.sportsitemapplication.product.ProductImplementation;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;


public class ItemCountButtonEditor extends DefaultCellEditor{
    
     
 
        private String UserID;
        private int rowNumber;
        private JTable table;
        private DefaultEditor defaultEditor;
        private String ItemID;
        private int updateItemCount;
        private int presentCartItemCount;
        private int presentDatabaseItemCount;
        private final ArrayList<ProductImplementation> list;
        private JSpinner spinner;
 
        JTextField text;
       
        

  
    
    public ItemCountButtonEditor(JCheckBox checkBox,ArrayList<ProductImplementation> list,String userName) {
        super(checkBox);
        this.list = list;
        this.UserID = userName; 

        
    }
        
        private void updateCartItemCountChanges() {
             spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                catchValueFromSpinner(evt);
            }
        });
        }
        
    private void catchValueFromSpinner(javax.swing.event.ChangeEvent evt) {
        updateItemCount = (int) spinner.getValue();
        
        new UpdateAddedItemsCount(ItemID,UserID,updateItemCount,presentCartItemCount,presentDatabaseItemCount);
        new CartItemShowingInCartTable(table);
        new TotalPaymentCalculation();
        
    } 
    
    
            @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
    boolean isSelected, int row, int column) 
    {
      this.table = table;
      rowNumber = row;
      presentCartItemCount = list.get(rowNumber).getCountOfCartItem();
      presentDatabaseItemCount = list.get(rowNumber).getCountOfItem();
      ItemID = list.get(rowNumber).getId();
      int max = list.get(rowNumber).getCountOfItem() + list.get(rowNumber).getCountOfCartItem();
      SpinnerNumberModel model1 = new SpinnerNumberModel(list.get(rowNumber).getCountOfCartItem(),1 ,max, 1);
      spinner = new JSpinner(model1);
      updateCartItemCountChanges();
      spinner.setValue(value);
 
      return spinner;
      
    }
    
    
        @Override
            public Object getCellEditorValue() {
            return spinner.getValue();
        }
            

      
}
