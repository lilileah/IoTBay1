CREATE TABLE ORDER_CART (
    order_id int NOT NULL,
    total_price decimal,
    CONSTRAINT order_id_cart_pk PRIMARY KEY (order_id)
);