/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportsitemapplication;

import com.mycompany.sportsitemapplication.view.Cart;

/**
 *
 * @author Kasun Madhumal
 */
public class App {
    
public Cart cartObj;    

public App(){

}

    public Cart getCartObj() {
      
        return this.cartObj;
    }

    public void setCartObj(Cart cartObj) {
        this.cartObj = cartObj;
//        this.cartObj.setVisible(true);
       
    }
    
    
    public void setCartVisibleFalse(){
        this.cartObj.dispose();
    }




}

