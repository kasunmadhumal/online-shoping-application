package com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;


public class EditButtonRenderer extends JButton implements TableCellRenderer {


    public EditButtonRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        setText("Edit");
        return this;
    }

}
