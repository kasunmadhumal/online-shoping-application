
package com.mycompany.sportsitemapplication.users;


public class Customer implements User{
    String userName = "skasunmk98@gmail.com";

    @Override
    public void SetName(String val) {
       
    }

    @Override
    public void SetPassword(String val) {
       
    }

    @Override
    public void SetUsername(String val) {
       
    }

    @Override
    public String GetName() {
        return "wait";
    }

    @Override
    public String GetPassword() {
        return "wait";
    }

    @Override
    public String GetUsername() {
       return userName;
    }
        @Override
    public String getEmail() {
        return userName;
    }
    
    
}
