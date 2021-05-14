/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;

public class Shipment {
    private int id;
    private int orderId;
    private int userId;
    private String name;
    private String mobile;
    private String address1;
    private String address2;
    private String suburb;
    private String city;
    private String state;
    private String postcode;
    private String status;
    private String method;
    private String time;

    public Shipment(int id, int orderId, int userId, String name, String mobile, String address1, String address2, String suburb, String city, String state, String postcode, String status, String method, String time) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.name = name;
        this.mobile = mobile;
        this.address1 = address1;
        this.address2 = address2;
        this.suburb = suburb;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.status = status;
        this.method = method;
        this.time = time;
    }

    public Shipment(int orderId, int userId, String name, String mobile, String address1, String address2, String suburb, String city, String state, String postcode, String method) {
        this.orderId = orderId;
        this.userId = userId;
        this.name = name;
        this.mobile = mobile;
        this.address1 = address1;
        this.address2 = address2;
        this.suburb = suburb;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.method = method;
    }

    public Shipment() {
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}
