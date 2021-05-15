    CREATE TABLE USERS (
    user_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    username_email varchar(254),
    user_name varchar(254),
    password varchar(254),
    phone varchar(15),
    dob varchar(254),
    gender varchar(254),
    user_type varchar(1),
    CONSTRAINT userspk PRIMARY KEY (user_id)
);

--     CREATE TABLE account (
--     account_id int NOT NULL,
--     username varchar(64),
--     password varchar(254),
--     email varchar(128),
--     user_id int NOT NULL,
--     CONSTRAINT account_id_pk PRIMARY KEY (account_id),
--     CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES USERS(user_id)
-- );

    CREATE TABLE ACCESS_LOGS (
    log_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    login_datetime varchar(254),
    logout_datetime varchar(254),
    user_id int NOT NULL,
    CONSTRAINT login_PK PRIMARY KEY (log_id),
    CONSTRAINT useridFK FOREIGN KEY (user_id) REFERENCES users(user_id)
);

    CREATE TABLE PRODUCTS (
    product_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    product_name varchar(254),
    price decimal(10),
    discount int,
    CONSTRAINT productpk PRIMARY KEY (product_id)
);

--     CREATE TABLE collection_management (
--     edit_date timestamp,
--     account_id int NOT NULL,
--     product_id int NOT NULL,
--     change_description varchar(1000),
--     -->staff acount ID?
--     CONSTRAINT account_id_cm_fk FOREIGN KEY (account_id) REFERENCES account(account_id),
--     CONSTRAINT prodiuct_id_fk FOREIGN KEY (product_id) REFERENCES products(product_id)
    
-- );

    CREATE TABLE CUSTOMERS (
    customer_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    date_signedup date,
    user_id int,
    CONSTRAINT customer_pk PRIMARY KEY (customer_id),
    CONSTRAINT user_fk FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

    CREATE TABLE INVOICE (
    invoice_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    paid_date date,
    CONSTRAINT invoicepk PRIMARY KEY (invoice_id)
);


CREATE TABLE ORDER_CART (
    order_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    total_price decimal,
    CONSTRAINT order_id_cart_pk PRIMARY KEY (order_id)
);

    CREATE TABLE ORDER_LINE_ITEM (
    order_line_item_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    quantity int,
    order_id int,
    product_id int,
    CONSTRAINT order_line_itemPK PRIMARY KEY (order_line_item_id),
    CONSTRAINT order_idFK FOREIGN KEY (order_id) REFERENCES order_cart(order_id),
    CONSTRAINT product_idFK FOREIGN KEY (product_id) REFERENCES products(product_id)
);

CREATE TABLE ORDERS (
    Order_date timestamp,
    user_id int,
    order_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    invoice_id int,
    CONSTRAINT user_id_orders_fk FOREIGN KEY (user_id) REFERENCES Users(user_id),
    CONSTRAINT order_id_fk FOREIGN KEY (order_id) REFERENCES order_cart(order_id),
    CONSTRAINT invoice_id_fk FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id)
);

       CREATE TABLE PAYMENT_DETAILS (
    payment_details_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    card_type varchar(30),
    card_number BIGINT NOT NULL,
    owner_name varchar(50),
    exp_date varchar(20),
    CCV int NOT NULL,
    user_id int,
    CONSTRAINT payment_details_id_pk PRIMARY KEY (payment_details_id),
    CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES users(user_id)
);

    CREATE TABLE shipment_details (
    shipment_details_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    country varchar(2),
    address varchar(128),
    postcode int,
    is_billing_address boolean,
    user_id int NOT NULL,
    CONSTRAINT shipment_details_pk PRIMARY KEY (shipment_details_id),
    CONSTRAINT user_id_shipment_fk FOREIGN KEY (user_id) REFERENCES users(user_id)
);

    CREATE TABLE staff (
    user_id int NOT NULL,
    date_of_employment TIMESTAMP,
    access_level varchar(20),
    CONSTRAINT user_id_staff_fk FOREIGN KEY (user_id) REFERENCES users(user_id)
);

--     CREATE TABLE user_management (
--     edit_date timestamp,
--     change_description varchar(1000),
--     account_id int NOT NULL,
--     CONSTRAINT account_id_um_fk FOREIGN KEY (account_id) REFERENCES account(account_id)
-- );