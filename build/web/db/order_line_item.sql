    CREATE TABLE ORDER_LINE_ITEM (
    order_line_item_id int,
    quantity int,
    order_id int,
    product_id int,
    CONSTRAINT order_line_itemPK PRIMARY KEY (order_line_item_id),
    CONSTRAINT order_idFK FOREIGN KEY (order_id) REFERENCES order_cart(order_id),
    CONSTRAINT product_idFK FOREIGN KEY (product_id) REFERENCES products(product_id)
);