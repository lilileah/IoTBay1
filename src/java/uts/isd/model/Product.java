/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;
import java.io.Serializable;

/**
 *
 * @author Dean
 */
public class Product implements Serializable{
    
    private int id;
    private String name; 
    private float price; 
    private float discount;
    //private Iterable<Product> products;

    public Product() {
    }

    public Product(int id, String name, float price, float discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
    
    
}
