
package com.mycompany.sportsitemapplication.view.cartViewController;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;




public class TheModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;

    public TheModel(){}

    public TheModel(Object[][] data, String[] columnName){

        this.rows = data;
        this.columns = columnName;
    }


    @Override
    public Class getColumnClass(int column){

        if(column == 0){
            return Icon.class;
        }
        if(column == 5){
            return JCheckBox.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }


    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        return this.rows[rowIndex][columnIndex];
    }
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }


}
