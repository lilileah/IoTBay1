    CREATE TABLE PRODUCTS (
    product_id int NOT NULL,
    product_name varchar(254),
    price decimal(10),
    discount int,
    image_path varchar(500),
    CONSTRAINT productpk PRIMARY KEY (product_id)
);