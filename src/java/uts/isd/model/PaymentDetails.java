/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;


import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author timfi
 */
public class PaymentDetails implements Serializable {
    private int payment_details_id;
    private String card_type;
    private int card_number;
    private String owner_name;
    private Date exp_date;
    private int CCV;
    private int userID;
    
    public PaymentDetails(int method_id, String card_type, int card_number, String owner_name, Date exp_date, int CCV, int userID) {
        this.payment_details_id = method_id;
        this.card_type = card_type;
        this.card_number = card_number;
        this.owner_name = owner_name;
        this.exp_date = exp_date;
        this.CCV = CCV;
        this.userID = userID;
    }
    
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }
    
    public void setPayment_details_id(int payment_details_id) {
        this.payment_details_id = payment_details_id;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

    public void setCCV(int CCV) {
        this.CCV = CCV;
    }

    public int getPayment_details_id() {
        return payment_details_id;
    }

    public String getCard_type() {
        return card_type;
    }

    public int getCard_number() {
        return card_number;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public Date getExp_date() {
        return exp_date;
    }

    public int getCCV() {
        return CCV;
    }
}
