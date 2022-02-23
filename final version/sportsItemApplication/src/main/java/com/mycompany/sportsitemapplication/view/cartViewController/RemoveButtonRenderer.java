
package com.mycompany.sportsitemapplication.view.cartViewController;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class RemoveButtonRenderer extends JButton implements TableCellRenderer  {

    
     public RemoveButtonRenderer() {
      setOpaque(true);
    }
     
     @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
    boolean isSelected, boolean hasFocus, int row, int column) {
      setText("Remove");
      return this;
    }
    
}
