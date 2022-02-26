
package com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers;

import com.mycompany.adminpanel.product.ProductImplementation;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class ItemsDetailsShowingInDashboardHomePage extends DefaultTableModel {
       private final  JTable jTable1;
       private final  String CategoryOfShowingItems; 
  
       
       public ItemsDetailsShowingInDashboardHomePage(JTable jTable1,String CategoryOfShowingItems){
                  this.jTable1 = jTable1;
                  this.CategoryOfShowingItems = CategoryOfShowingItems;
                  populateJTable();
                  JTableWidth();
                  centerTableCellValue();
       
       
       }
       
  
      
  

  
       
         private void JTableWidth() {

        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(370);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(370);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(160);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);


    }

    private void centerTableCellValue() {

        //center table cell values
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
    }

    public final void populateJTable() {

        CreateItemDetailListForHomePageTable createItemDetailListForHomePageTable = new CreateItemDetailListForHomePageTable(CategoryOfShowingItems);
        ArrayList<ProductImplementation> list = createItemDetailListForHomePageTable.getHomaPageTableItemList();
        String[] columnName = {"image", "ItemDetails", "Store And Sales", "Price","Edit"};

        Object[][] rows = new Object[list.size()][5];
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getImagePath() != null) {
                ImageIcon image = null;


                image = new ImageIcon(new ImageIcon(list.get(i).getImagePath()).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

                rows[i][0] = image;

            } else {
                rows[i][0] = null;
            }

            //create Item details to show in cart
            String Details = "<html><h2><b> Product name: " + list.get(i).getSportName() + " " +
                    list.get(i).getProductType() + "<br> Brand: " +
                    list.get(i).getBrand() + "<br> Size:" +
                    list.get(i).getSize() + "</b></h2></html>";

            rows[i][1] = Details;
            
            String sales = "<html><h1 style='color:blue;'><b> Sales Count: " + list.get(i).getno() +"</h1><h2 style='color:red;'><br> In Store Count: " +
                    list.get(i).getCountOfItem() +"</b></h2></html>";
            rows[i][2] = sales;
            rows[i][3] = "<html><h1><b>"+list.get(i).getPrize()+"</b></html></h1>";
            rows[i][4] = "<html><h1 style='color:green;'><b>Edit</b></h1></html>";
            
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


        jTable1.getColumn("Edit").setCellEditor(new EditButton(new JCheckBox(), list));


        jTable1.setRowHeight(150);
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(false);


    }

    
}
