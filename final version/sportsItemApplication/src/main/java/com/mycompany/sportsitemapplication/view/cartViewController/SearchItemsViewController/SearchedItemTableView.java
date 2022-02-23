
package com.mycompany.sportsitemapplication.view.cartViewController.SearchItemsViewController;

import com.mycompany.sportsitemapplication.product.ProductImplementation;
import com.mycompany.sportsitemapplication.view.selectedSportItemsPageViewController.CreateSelectedCategoryItemList;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public final class SearchedItemTableView {
    
    private  String selectedCategory;
    private  JTable jTable1 ;
    public SearchedItemTableView(JTable jTable1,String selectedCategory){
         this.jTable1 = jTable1;
         this.selectedCategory = selectedCategory;
         populateJTable();
         JTableWidth();
         centerTableCellValue();
    }
    
        private void JTableWidth(){

        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
 

      
             
    }
    
    private void centerTableCellValue(){
        
        //center table cell values
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

    
    }
            
    public void populateJTable(){
    
        CreateSelectedCategoryItemList createSelectedCategoryItemList = new CreateSelectedCategoryItemList(selectedCategory);
        ArrayList<ProductImplementation> list = createSelectedCategoryItemList.getItemDetailsAboutSelectedCategory();
        String[] columnName = {"image","Item Details","Discription","Price","AddToCart"};
        
        Object[][] rows = new Object[list.size()][5];
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
            String Details = "<html> Product name: "+list.get(i).getSportName()+" "+
                                   list.get(i).getProductType()+"<br> Brand: "+
                                   list.get(i).getBrand()+"<br> Size:"+
                                                       list.get(i).getSize()+"</html>";

            rows[i][1] = Details;
            rows[i][2] = list.get(i).getDescription();
            rows[i][3] = list.get(i).getPrize();

            rows[i][4] = "<html><h4 style='color:blue';><b><br>A<br>D<br>D<br><br>T<br>O<br><br> C<br>A<br>R<br>T</b></h4></html>";
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

  
        jTable1.getColumn("AddToCart").setCellEditor(new AddToCartButtonForSearchBar(new JCheckBox(), list));
        

       

        jTable1.setRowHeight(250);
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(false);

        
    }
    
    
}
