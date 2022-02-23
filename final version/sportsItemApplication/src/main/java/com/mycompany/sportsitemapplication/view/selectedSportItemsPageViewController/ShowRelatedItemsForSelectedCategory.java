
package com.mycompany.sportsitemapplication.view.selectedSportItemsPageViewController;



import com.mycompany.sportsitemapplication.product.ProductImplementation;
import com.mycompany.sportsitemapplication.view.Cart;
import com.mycompany.sportsitemapplication.view.Home;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class ShowRelatedItemsForSelectedCategory  extends javax.swing.JFrame {
    

        private JTable table ;
        private int rowCount = 0;
        private JLabel Title ;
        private JButton cart ;
        private JButton Home ;
        private String selectedCategory;
        private String TitleLableTextName;
        
    
    public ShowRelatedItemsForSelectedCategory(){
         
         
         initButtons();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
         
     
            
    }
    
    public final void initButtons(){
            cart = new javax.swing.JButton();
            cart.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
            
                       Home = new javax.swing.JButton();
            Home.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
    
    
    }
    
    
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
           
           new Cart().setVisible(true);
           this.setVisible(false);
           
          
  
    } 
        
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
            
           new Home().setVisible(true);
           this.setVisible(false);
           
          
  
    } 
    

    
    


  public  void populateJTable(String selectedCategory){
        this.selectedCategory = selectedCategory;
        CreateSelectedCategoryItemList createSelectedCategoryItemList = new CreateSelectedCategoryItemList(selectedCategory);
        ArrayList<ProductImplementation> list = createSelectedCategoryItemList.getItemDetailsAboutSelectedCategory();
        String[] columnName = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
        
        Object[][] rows = new Object[list.size()][13];
        for(int i = 0; i < list.size(); i+=3){
            
            
             if(list.get(i).getImagePath() != null){
                    
                    if(i<list.size()){
                     rows[rowCount][0]= null;
                     ImageIcon image1 = null;
                     image1 = new ImageIcon(new ImageIcon(list.get(i).getImagePath()).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                     rows[rowCount][1] = image1;
                    
                    
                     String Details = "<html> <h3><b>Product name: "+list.get(i).getSportName()+" "+
                                   list.get(i).getProductType()+"<br> Brand: "+
                                   list.get(i).getBrand()+"<br> Size:"+
                        list.get(i).getSize()+"<br>Prize: "+list.get(i).getPrize()+"<br></h3></html>";
                     rows[rowCount][2] = Details;
                     
                     rows[rowCount][3] = "<html><h4 style='color:blue';><br>A<br>D<br>D<br><br>T<br>O<br><br> C<br>A<br>R<br>T</h4></html>";
                     rows[i][4] = "";
                  
                     }
                    
                    
                     
                    if((i+1)<list.size()){
                     ImageIcon image2 = null;
                     image2 = new ImageIcon(new ImageIcon(list.get(i+1).getImagePath()).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                     rows[rowCount][5] = image2;
                                
                    
                     String Details2 = "<html> <h3><b>Product name: "+list.get(i+1).getSportName()+" "+
                        list.get(i+1).getProductType()+"<br> Brand: "+
                        list.get(i+1).getBrand()+"<br> Size:"+
                        list.get(i+1).getSize()+"<br>Prize: "+list.get(i+1).getPrize()+"</h3></html>";
                     
                    rows[rowCount][6] = Details2;
                    rows[rowCount][7] = "<html><h4 style='color:blue';><br>A<br>D<br>D<br><br>T<br>O<br><br> C<br>A<br>R<br>T</h4></html>";
                    rows[rowCount][8]="";}
                    
                                        
                    
                    if((i+2)<list.size()){
                     ImageIcon image3 = null;
                     image3 = new ImageIcon(new ImageIcon(list.get(i+2).getImagePath()).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                     rows[rowCount][9] = image3;
                                
                     
                     String Details3 = "<html> <h3><b>Product name: "+list.get(i+2).getSportName()+" "+
                                   list.get(i+2).getProductType()+"<br> Brand: "+
                                   list.get(i+2).getBrand()+"<br> Size:"+
                        list.get(i+2).getSize()+"<br>Prize: "+list.get(i+2).getPrize()+"</h3></html>";
                     
                     
                    rows[rowCount][10] = Details3;
                    rows[rowCount][11] = "<html><h4 style='color:blue';><br>A<br>D<br>D<br><br>T<br>O<br><br> C<br>A<br>R<br>T</h4></html>";
                    rows[rowCount][12]="";
                    
                    
                    }
                    
                   
                 
             
             }
            else{
                     rows[i][1]=null;rows[i][5]=null;rows[i][9]=null;
            }
             
             rowCount++;
             
        }
             
                      
                  
  DefaultTableModel model = new DefaultTableModel(rows, columnName){
            
            @Override
            public Class getColumnClass(int column)
            {
                          if(column == 1 || column == 5 || column == 9){
                                 return Icon.class;
                            }

                          else{
                                  return getValueAt(0,column).getClass();
                            }
            }
        };


       table = new javax.swing.JTable(model)
        {
            @Override
            public TableCellRenderer getCellRenderer(int row, int column)
            {
                int modelColumn = convertColumnIndexToModel(column);

                if (modelColumn == 1 || modelColumn == 5 || modelColumn == 9)
                {
                    return getDefaultRenderer( Icon.class );
                }
                else
                    return super.getCellRenderer(row, column);
            }
        };



    
        table.getColumn("4").setCellEditor(new AddToCartButton(new JCheckBox(),list));
        table.getColumn("8").setCellEditor(new AddToCartButton(new JCheckBox(),list));
        table.getColumn("12").setCellEditor(new AddToCartButton(new JCheckBox(),list));
        

        for(int i =0;i<= list.size()/3;i++){
           table.setRowHeight(i,200);
       
        }
        

        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
      
        JTableWidth();
        centerTableCellValue();
        JLabel Title = new JLabel();
        
        
        if(selectedCategory == "Shoes" ||selectedCategory =="Jersey" || selectedCategory == "Shorts" ){
             TitleLableTextName = "Sport " + selectedCategory;
        }else if(selectedCategory == "Puma" ||selectedCategory =="nike" || selectedCategory == "adidas" ||selectedCategory =="kappa" || selectedCategory == "vilson"){
             TitleLableTextName = "Sport Items of " + selectedCategory+" brand";
        }else{
        TitleLableTextName = selectedCategory + " Sport Items";
        }
        
        
        
        Title.setText(TitleLableTextName);
        Title.setBounds(400,50,800,100);
        Title.setBackground(Color.green);
        Title.setForeground(Color.blue);
        Title.setFont(new Font("Serif",Font.BOLD,50));
        
        Icon icon = new ImageIcon("src\\main\\java\\com\\mycompany\\sportsitemapplication\\Images\\Sportsman1.png");
        Home.setIcon(icon);
        Icon icon2 = new ImageIcon("src\\main\\java\\com\\mycompany\\sportsitemapplication\\Images\\cart2-removebg-preview.png");
        cart.setIcon(icon2);
        
        JPanel panel = new JPanel();// creating instance of JPanel
        this.setContentPane(panel);// add panel in ContentPane
        panel.setLayout(null);// Set null layout
      
        panel.add(Title);
        panel.add(Home);
        panel.add(cart);
        cart.setBounds(1700,30,90,90);
        Home.setBounds(100,30,380,100);
        Title.setBounds(750,50, 600, 50);
    //    table.setBounds(100, 150, 1700, 800);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.getViewport().setViewPosition(new Point(0,0));
        scrollPane.setBounds(100, 150, 1700, 800);
        panel.add(scrollPane);
        panel.setBackground(Color.cyan);
     
   //     panel.add(table);// add table in panel using add() method
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         setVisible(true);
         setSize(1900,1200);



        
  
        
        }
  
       private void JTableWidth(){

        table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
        for(int i=0;i<12;i+=4){
        table.getColumnModel().getColumn(i).setPreferredWidth(100);
        table.getColumnModel().getColumn(i+1).setPreferredWidth(250);
        table.getColumnModel().getColumn(i+2).setPreferredWidth(220);
        table.getColumnModel().getColumn(i+3).setPreferredWidth(30);
        }
       table.getColumnModel().getColumn(12).setPreferredWidth(100);
    }
     
      private void centerTableCellValue(){
        
        //center table cell values
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
         rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for(int i=0;i<13;i++){
            table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
        }
    
    }
      
  
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              new ShowRelatedItemsForSelectedCategory();
            }
        });
    }    
}
