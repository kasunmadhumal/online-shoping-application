package com.mycompany.adminpanel.product;


public class ProductImplementation extends Product {


    private final int no;

    public ProductImplementation(String id, String sportName, String productType, String brand,
                                 String size, double prize, int countOfItem, String imagePath, String description,String category,int no) {

        this.id = id;
        this.sportName = sportName;
        this.productType = productType;
        this.brand = brand;
        this.size = size;
        this.prize = prize;
        this.countOfItem = countOfItem;
        this.description = description;
        this.imagePath = imagePath;
        this.description = description;
        this.no = no;
    }



    
    public int getno() {
        return no;
    }


}
