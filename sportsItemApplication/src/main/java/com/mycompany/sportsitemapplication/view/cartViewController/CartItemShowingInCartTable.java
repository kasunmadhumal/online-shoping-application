
package com.mycompany.sportsitemapplication.view.cartViewController;

import com.mycompany.sportsitemapplication.product.ProductImplementation;
import com.mycompany.sportsitemapplication.users.Customer;
import com.mycompany.sportsitemapplication.users.User;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public final class CartItemShowingInCartTable {
    
        private JTable jTable1 ;
        private String UserName;
        
        public CartItemShowingInCartTable(JTable jTable1){
            this.jTable1 = jTable1;
            User user = new Customer();
            UserName = user.GetUsername();
        
            populateJTable();
            JTableWidth();
            centerTableCellValue();
    
    }
    
        private void JTableWidth(){

        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(230);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(230);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);

      
             
    }
    
    private void centerTableCellValue(){
        
        //center table cell values
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
    
    }
            
    public void populateJTable(){
    
        CreateCartItemDetailList cartItemLoadToView = new CreateCartItemDetailList();
        ArrayList<ProductImplementation> list = cartItemLoadToView.getCartItemList();
        String[] columnName = {"image","ItemDetails","Quantity","Price","Total",
                                                                      "Remove"};
        
        Object[][] rows = new Object[list.size()][6];
        for(int i = 0; i < list.size(); i++){
            
          if(list.get(i).getImagePath() != null){
            ImageIcon image = null;


            image = new ImageIcon(new ImageIcon(list.get(i).getImagePath()).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

            rows[i][0] = image;
            
            }
            else{
                rows[i][0] = null;
            }
          
            //create Item details to show in cart
            String Details = "<html><h2 style='color:green;'> Product name: "+list.get(i).getSportName()+" "+
                                   list.get(i).getProductType()+"<br> Brand: "+
                                   list.get(i).getBrand()+"<br> Size:"+
                                                       list.get(i).getSize()+"</h2></html>";

            rows[i][1] = Details;
            rows[i][2] = list.get(i).getCountOfCartItem();
            rows[i][3] = "<html><h1><b>"+list.get(i).getPrize()+"</b></h1></html>";
            
            //calculate total value of each item
            double totalPrice = (list.get(i).getPrize()) *  (list.get(i).getCountOfCartItem());
            rows[i][4] ="<html><h1><b>"+totalPrice +"</b></h1></html>";


            rows[i][5] = "<html><h1 style='color:red;'><b>REMOVE</b></h1></html>";
        }
        
       // TheModel model = new TheModel(rows, columnName);
        DefaultTableModel model = new DefaultTableModel(rows, columnName) {
            
            @Override
            public Class getColumnClass(int column)
            {
                          if(column == 0){
                                 return Icon.class;
                            }

                          else{
                                  return getValueAt(0,column).getClass();
                            }
            }
        };
        

        
        jTable1.setModel(model);

  
        jTable1.getColumn("Remove").setCellEditor(new RemoveButtonEditor(new JCheckBox(),list,UserName));
        

        jTable1.getColumn("Quantity").setCellEditor(new ItemCountButtonEditor(new JCheckBox(),list,UserName));
                     

        jTable1.setRowHeight(150);
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(false);

        
    }
    
}
