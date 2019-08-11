/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author stoff
 */
public class User {

    private int id;
    private String email;
    private String password;
    private  String userName;
//Constructor (does not connect to github)
    public User(int id, String email, String password, String userName)
    {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }
    
    

     public User( String email, String password, String userName)
    {
        
        this.email = email;
        this.password = password;
        this.userName = userName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
