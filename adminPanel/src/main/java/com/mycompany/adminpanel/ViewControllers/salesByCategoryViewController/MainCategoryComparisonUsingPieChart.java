
package com.mycompany.adminpanel.ViewControllers.salesByCategoryViewController;

import com.mycompany.adminpanel.RepositoryOperations.DataRepositoryOperationFactory;
import com.mycompany.adminpanel.RepositoryOperations.RepositoryOperationForSelectDataRange;
import com.mycompany.adminpanel.ViewControllers.DashboardHomeViewControllers.CreateItemDetailListForHomePageTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MainCategoryComparisonUsingPieChart extends javax.swing.JFrame {

    private Date startDate;
    private Date endDate;
    public MainCategoryComparisonUsingPieChart(){

      }

    public void creatChart(String appTitle , String chartTitle, Date startDate, Date endDate){
        this.startDate = startDate;
        this.endDate = endDate;
        PieDataset dataset = creatDataset();
        JFreeChart chart = createChart(dataset,chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
      //  chartPanel.setPreferredSize(new java.awt.Dimension(1000,700));
        chartPanel.setBounds(500,300,1000,700);
        setContentPane(chartPanel);



    }

    public PieDataset creatDataset(){

        RepositoryOperationForSelectDataRange categoryDetails = new DataRepositoryOperationFactory("categoryComparison").getOperationActivatorForSelectDateRangeDetails();
        ResultSet categoryComparison = categoryDetails.OperationActivator(startDate,endDate);

        DefaultPieDataset result = new DefaultPieDataset();
     try{
        while (categoryComparison.next()) {

            result.setValue(categoryComparison.getString("category"),categoryComparison.getDouble("no"));
        }

    } catch (
    SQLException ex) {
        Logger.getLogger(CreateItemDetailListForHomePageTable.class.getName()).log(Level.SEVERE, null, ex);
    }

     return result;


    }

    private JFreeChart createChart(PieDataset dataset,String Title){

               JFreeChart chart = ChartFactory.createPieChart3D(Title,dataset,true,true,false);
               PiePlot3D plot = (PiePlot3D) chart.getPlot();
               plot.setStartAngle(0);
              // plot.setDirection(Rotation.CLOCKWISE);
               plot.setForegroundAlpha(0.5f);
               return chart;



    }

    public static void main(String[] args){
           new MainCategoryComparisonUsingPieChart().setVisible(true);
    }


}
