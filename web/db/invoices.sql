/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  samuelpolgar
 * Created: 19/04/2021
 */

    CREATE TABLE INVOICE (
    invoice_id int,
    paid_date date
    CONSTRAINT invoicepk PRIMARY KEY (invoice_id)
);
