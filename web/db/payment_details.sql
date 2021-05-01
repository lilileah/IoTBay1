    CREATE TABLE PAYMENT_DETAILS (
    payment_details_id int,
    card_name varchar(254),
    card_no int,
    invoice_id int,
    CONSTRAINT payment_details_id_pk PRIMARY KEY (payment_details_id),
    CONSTRAINT invoice_paymentdetails_pk FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id)
);