
package com.mycompany.sportsitemapplication.product;


public class ProductImplementation extends Product {
    
       private int countOfCartItem;
    
    public ProductImplementation(String id, String sportName, String productType,String brand,
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

    
    public int getCountOfCartItem() {
        return countOfCartItem;
    }

    public void setCountOfCartItem(int countOfCartItem) {
        this.countOfCartItem = countOfCartItem;
    }
   

    
}
