CREATE TABLE ORDERS (
    Order_date timestamp,
    user_id int,
    order_id int,
    invoice_id int,
    CONSTRAINT user_id_orders_fk FOREIGN KEY (user_id) REFERENCES Users(user_id),
    CONSTRAINT order_id_fk FOREIGN KEY (order_id) REFERENCES order_cart(order_id),
    CONSTRAINT invoice_id_fk FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id)
);