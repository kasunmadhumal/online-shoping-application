/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportsitemapplication.product;

/**
 *
 * @author Kasun Madhumal
 */
public class Product {
    private String id;
    private String sportName;
    private String productType;
    private String brand;
    private String size;
    private double prize;
    private int countOfItem;
    private int countOfCartItem;
    private String category;
    private String imagePath;
    private String description;
    
    public Product(){}
    public Product(String id, String sportName, String productType,String brand,
                   String size,double prize,int countOfItem,int countOfCartItem,String category,String imagePath,String description){
        this.id = id;
        this.sportName = sportName;
        this.productType = productType;
        this.brand = brand;
        this.size = size;
        this.prize = prize;
        this.countOfItem = countOfItem;
        this.countOfCartItem = countOfCartItem;
        this.category = category;
        this.description = description;
        this.imagePath = imagePath;
       
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfCartItem() {
        return countOfCartItem;
    }

    public void setCountOfCartItem(int countOfCartItem) {
        this.countOfCartItem = countOfCartItem;
    }

    public int getCountOfItem() {
        return countOfItem;
    }

    public void setCountOfItem(int countOfItem) {
        this.countOfItem = countOfItem;
    }
}
