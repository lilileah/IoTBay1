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
public class order implements Serializable{
    
    private int date;
    private int userID; 
    private int orderID; 
    private int Invoice_ID; 
    private float totalPrice;
    
    
    public order(int date, int userID, int orderID, int Invoice_ID, float totalPrice) {
        this.date = date;
        this.userID = userID;
        this.orderID = orderID;
        this.Invoice_ID = Invoice_ID;
        this.totalPrice = totalPrice;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setInvoice_ID(int Invoice_ID) {
        this.Invoice_ID = Invoice_ID;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getDate() {
        return date;
    }

    public int getUserID() {
        return userID;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getInvoice_ID() {
        return Invoice_ID;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
    
}

