/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;
import java.io.Serializable;

/**
 *
 * @author lilil
 */
public class User implements Serializable {
    private String email; 
    private String name; 
    private String password;
    private String username;
    private Iterable<User> users;
    
   public User(String email, String name,String password, String username)
{
    this.email = email;
    this.name = name; 
    this.password = password;
    this.username = username; 
}    
   
   public User(){}
   
   public User getUser(String email) {
        for (User u : this.users) {
            if (u.getEmail() == email) {
                return u;
            }
        }
        return null;
    }
  
    public String getEmail() {
        return email;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }   
}