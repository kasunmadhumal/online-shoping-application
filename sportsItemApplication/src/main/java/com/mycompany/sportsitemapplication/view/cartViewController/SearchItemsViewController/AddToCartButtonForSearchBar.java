
package com.mycompany.sportsitemapplication.view.cartViewController.SearchItemsViewController;

import com.mycompany.sportsitemapplication.operations.cartItemOperations.AddToCart;
import com.mycompany.sportsitemapplication.product.ProductImplementation;
import com.mycompany.sportsitemapplication.users.Customer;
import com.mycompany.sportsitemapplication.users.User;
import com.mycompany.sportsitemapplication.view.cartViewController.CreateCartItemDetailList;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class AddToCartButtonForSearchBar extends DefaultCellEditor {
    
        private final String buttonName = "<html><h4 style='color:blue';><b><br>A<br>D<br>D<br><br>T<br>O<br><br> C<br>A<br>R<br>T</b></h4></html>";
        public JButton button ;
        private final String UserID;
        private String ItemID;
        private int rowNumber;
        private JTable table;
        private final ArrayList<ProductImplementation> list;
        private final CreateCartItemDetailList cartItemLoadToView = new CreateCartItemDetailList();
        private final ArrayList<ProductImplementation> cartItemlist = cartItemLoadToView.getCartItemList();
        
        public AddToCartButtonForSearchBar(JCheckBox checkBox, ArrayList<ProductImplementation> list){
           super(checkBox);
            this.list = list;
           User user = new Customer();
           UserID = user.GetUsername();
           initComponents();
           button.setBackground(Color.green);
        
        
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
    
        ItemID = list.get(rowNumber).getId();
        
        if(isItemInTheCartList()==1){
              JOptionPane.showMessageDialog(null,"Item is already added !!");
        
        }
        else{
            
              int updateItemTableCount = list.get(rowNumber).getCountOfItem() - 1;
              if(updateItemTableCount >= 0){
                    new AddToCart(UserID,ItemID,1,updateItemTableCount);
                 
                }else{
                    JOptionPane.showMessageDialog(null,"Item Is Out Of Stock !!");
              }
        
        }

    }  
    
    
     public int isItemInTheCartList(){
        int isItInCart = 0;
        for(int i=0;i<cartItemlist.size();i++){
            
              if(ItemID.equals(cartItemlist.get(i).getId())){
                    isItInCart = 1;
                    
              }
              
        
        }
        
        return isItInCart;
    
    }
    
    
    
    
    
        @Override
    public Object getCellEditorValue() 
    {
      
      return buttonName;
    }
    
    
}
