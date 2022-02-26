
package com.mycompany.sportsitemapplication.product;


public class DiscountProductImplementation extends Product{
    double discount;
    
    public DiscountProductImplementation(String id, String sportName, String productType,String brand,
                   String size,double prize,int countOfItem,double discount,String category,String imagePath,String description){
    
        this.id = id;
        this.sportName = sportName;
        this.productType = productType;
        this.brand = brand;
        this.size = size;
        this.prize = prize;
        this.countOfItem = countOfItem;
        this.discount = discount;
        this.category = category;
        this.description = description;
        this.imagePath = imagePath;
    
    }
    
    public double getDiscount(){
    return this.discount;
    }
    
    public void setDiscount(){
    
    }
    
}
