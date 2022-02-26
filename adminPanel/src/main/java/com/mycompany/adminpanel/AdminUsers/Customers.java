package com.mycompany.adminpanel.AdminUsers;


public class Customers implements User {
    private String firstName;
    private String lastName;
    private String Email;
    private String userName;
    private double totalShoppingAmount;
    private String registerDate;
    public Customers(String firstName,String lastName,String email,String userName,double totalShoppingAmount,String registerDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = email;
        this.userName = userName;
        this.totalShoppingAmount = totalShoppingAmount;
        this.registerDate = registerDate;
    
    }
    
    public String getRegisterDate(){
       return this.registerDate;
    }
 
    
    public double getTotalShopingAmount(){
    
    return this.totalShoppingAmount;
    }

    @Override
    public String getFisrtName() {
        return this.firstName;
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return this.userName;
    }
    
     @Override
    public String getLasttName() {
        return this.lastName;
    }
    
     @Override
    public String getEmail() {
        return this.Email;
    }

}
