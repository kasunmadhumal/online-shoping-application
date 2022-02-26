
package com.mycompany.adminpanel.ViewControllers.salesByCategoryViewController;

import com.mycompany.adminpanel.RepositoryOperations.DataRepositoryOperationFactory;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationForSelectDataRange;
import com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers.CreateItemDetailListForHomePageTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EachSportItemSalesComparison extends javax.swing.JFrame {

        private Date startDate;
        private Date endDate;
        
    public EachSportItemSalesComparison(){

        }

        public void creatChart(String appTitle , String chartTitle, Date startDate, Date endDate){
            this.startDate = startDate;
            this.endDate = endDate;
            DefaultCategoryDataset dataset = creatDataset();

            JFreeChart chart = ChartFactory.createBarChart("Each Sport Item Sales", "Sport", "Sales Items Count", dataset, PlotOrientation.HORIZONTAL, false, true, false);
            CategoryPlot plot = chart.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.BLACK);
            ChartFrame  frame = new ChartFrame("Bar Chart For Sport Comparison",chart);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);



        }

        public DefaultCategoryDataset creatDataset(){

            RepositoryOperationForSelectDataRange categoryDetails = new DataRepositoryOperationFactory("sportsComparison").getOperationActivatorForSelectDateRangeDetails();
            ResultSet categoryComparison = categoryDetails.OperationActivator(startDate,endDate);

            DefaultCategoryDataset result = new DefaultCategoryDataset();
            try{
                while (categoryComparison.next()) {

                    result.setValue(categoryComparison.getInt("no"),"Total Sales Count",categoryComparison.getString("sportName"));
                }

            } catch (
                    SQLException ex) {
                Logger.getLogger(CreateItemDetailListForHomePageTable.class.getName()).log(Level.SEVERE, null, ex);
            }

            return result;


        }



        public static void main(String[] args){
           // new EachSportItemSalesComparison().setVisible(true);
        }


    }
