/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportsitemapplication.view.cartViewController;

import com.mycompany.sportsitemapplication.operations.cartItemOperations.RetrieveCartItemData;
import com.mycompany.sportsitemapplication.product.Product;
import com.mycompany.sportsitemapplication.users.Customer;
import com.mycompany.sportsitemapplication.users.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class TotalPaymentCalculation {
    ArrayList<Product> cartItemDetails; 
    private double subTotal=0.00;
    private double discount=0.00;
    private double totalToPay=0.00;
    private final String userID;

    public TotalPaymentCalculation(){
        cartItemDetails = new CreateCartItemDetailList().getCartItemList();
        User user = new Customer();
        userID = user.GetUsername();
        setSubTotal();
        setDiscount();
        setTotalToPay();



    }


    public void setSubTotal() {

        //calculate sub total value
        for(int i=0;i<cartItemDetails.size();i++){
            double amountForOneItem=0;
            amountForOneItem = cartItemDetails.get(i).getPrize() * cartItemDetails.get(i).getCountOfCartItem();
            subTotal += amountForOneItem;

        }


    }

    public void setDiscount() {

         ResultSet discountItemListInCart = new RetrieveCartItemData(userID).discountItemsInCartList();
        try {
            while(discountItemListInCart.next()){
                int i = 0;
                double discountValue = 0;
                double discountForOneItem = 0;
                double discountForNumberOfItem = 0;
                while(i<cartItemDetails.size()){
                    if(discountItemListInCart.getString("id").equals(cartItemDetails.get(i).getId())){
                          discountValue = discountItemListInCart.getDouble("discount");
                          discountForOneItem = discountValue * cartItemDetails.get(i).getPrize();
                          discountForNumberOfItem = discountForOneItem * cartItemDetails.get(i).getCountOfCartItem();
                          discount += discountForNumberOfItem;
                    }
                    i++;
                }



            }
        } catch (SQLException ex) {
            Logger.getLogger(TotalPaymentCalculation.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public void setTotalToPay() {
        totalToPay = subTotal - discount;

    }

    public void setTotalCountBarValues(JLabel subTotalLabel, JLabel discountLabel, JLabel totalLabel){
         subTotalLabel.setText(String.valueOf(subTotal));
         discountLabel.setText(String.valueOf(discount));
         totalLabel.setText(String.valueOf(totalToPay));
    
    
    }
}
