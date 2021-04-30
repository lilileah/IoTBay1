CREATE TABLE ORDERS (
    Order_date timestamp,
    CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES User(user_id),
    CONSTRAINT order_id_fk FOREIGN KEY (order_id) REFERENCES orders(account_id),
    CONSTRAINT invoice_id_fk FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id)
);