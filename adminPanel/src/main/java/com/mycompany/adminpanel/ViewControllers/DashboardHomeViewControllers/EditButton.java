
package com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers;



import com.mycompany.adminpanel.product.ProductImplementation;
import com.mycompany.adminpanel.view.UpdateItemDetails;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class EditButton extends DefaultCellEditor {
    private final String buttonName = "Edit";
    public JButton button;
    private ArrayList<ProductImplementation> list;
    private int rowNumber;
    private JTable table;

   


    public EditButton(JCheckBox checkBox, ArrayList<ProductImplementation> list) {

        super(checkBox);
        this.list = list;
     
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
                                                 boolean isSelected, int row, int column) {
        rowNumber = row;
        button.setText(buttonName);
        this.table = table;
        return button;

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        //remove the selected row in cart list
 
        UpdateItemDetails updateItemDetails =  new UpdateItemDetails();
        updateItemDetails.setVisible(true);
        updateItemDetails.ItemDetails(rowNumber, list);
       
        
     


    }

    @Override
    public Object getCellEditorValue() {
        return buttonName;
    }


}
    

