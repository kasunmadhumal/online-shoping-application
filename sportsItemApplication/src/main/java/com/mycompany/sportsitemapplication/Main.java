/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportsitemapplication;

import com.mycompany.sportsitemapplication.view.Cart;
import com.mycompany.sportsitemapplication.view.HomePage;

/**
 *
 * @author Kasun Madhumal
 */
public class Main extends App {

    private static Cart cartObj;

    public static void main(String[] args){
//        cartObj = new Cart();
//        cartObj.mainCaller();
//        new App().setCartObj(cartObj);
          HomePage home = new HomePage();
          home.setVisible(true);


    }
    
}
