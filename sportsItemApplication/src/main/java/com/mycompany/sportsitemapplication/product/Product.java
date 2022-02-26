
package com.mycompany.sportsitemapplication.product;


public class Product {
    String id;
    String sportName;
    String productType;
    String brand;
    String size;
    double prize;
    int countOfItem;
    String category;
    String imagePath;
    String description;
    
    public Product(){}


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


    public int getCountOfItem() {
        return countOfItem;
    }

    public void setCountOfItem(int countOfItem) {
        this.countOfItem = countOfItem;
    }
}
