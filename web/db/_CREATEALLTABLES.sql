    CREATE TABLE USERS (
    user_id int,
    user_name varchar(254),
    dob date,
    gender varchar(254),
    user_type varchar(1),
    CONSTRAINT userspk PRIMARY KEY (user_id)
);

    CREATE TABLE account (
    account_id int NOT NULL,
    username varchar(64),
    password varchar(254),
    email varchar(128),
    user_id int NOT NULL,
    CONSTRAINT account_id_pk PRIMARY KEY (account_id),
    CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES USERS(user_id)
);

    CREATE TABLE ACCESS_LOGS (
    log_id int,
    login_datetime timestamp,
    logout_datetime timestamp,
    user_id int,
    account_id int,
    CONSTRAINT login_PK PRIMARY KEY (log_id),
    CONSTRAINT accountFK FOREIGN KEY (account_id) REFERENCES account(account_id),
    CONSTRAINT useridFK FOREIGN KEY (user_id) REFERENCES users(user_id)
);

    CREATE TABLE PRODUCTS (
    product_id int NOT NULL,
    product_name varchar(254),
    price decimal(10),
    discount int,
    image_path varchar(500),
    CONSTRAINT productpk PRIMARY KEY (product_id)
);

    CREATE TABLE collection_management (
    edit_date timestamp,
    account_id int NOT NULL,
    product_id int NOT NULL,
    change_description varchar(1000),
    -->staff acount ID?
    CONSTRAINT account_id_cm_fk FOREIGN KEY (account_id) REFERENCES account(account_id),
    CONSTRAINT prodiuct_id_fk FOREIGN KEY (product_id) REFERENCES products(product_id)
    
);

    CREATE TABLE CUSTOMERS (
    customer_id int,
    date_signedup date,
    user_id int,
    CONSTRAINT customerPK PRIMARY KEY (customer_id),
    CONSTRAINT userFK FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

    CREATE TABLE INVOICE (
    invoice_id int,
    paid_date date,
    CONSTRAINT invoicepk PRIMARY KEY (invoice_id)
);

CREATE TABLE ORDER_CART (
    order_id int NOT NULL,
    total_price decimal,
    CONSTRAINT order_id_cart_pk PRIMARY KEY (order_id)
);

    CREATE TABLE ORDER_LINE_ITEM (
    order_line_item_id int,
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
    order_id int,
    invoice_id int,
    CONSTRAINT user_id_orders_fk FOREIGN KEY (user_id) REFERENCES Users(user_id),
    CONSTRAINT order_id_fk FOREIGN KEY (order_id) REFERENCES order_cart(order_id),
    CONSTRAINT invoice_id_fk FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id)
);

    CREATE TABLE PAYMENT_DETAILS (
    payment_details_id int,
    card_name varchar(254),
    card_no int,
    invoice_id int,
    CONSTRAINT payment_details_id_pk PRIMARY KEY (payment_details_id),
    CONSTRAINT invoice_paymentdetails_pk FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id)
);

    CREATE TABLE shipment_details (
    shipment_details_id int,
    country varchar(2),
    address varchar(128),
    postcode int,
    is_billing_address boolean,
    account_id int NOT NULL,
    CONSTRAINT shipment_details_pk PRIMARY KEY (shipment_details_id),
    CONSTRAINT account_id_fk FOREIGN KEY (account_id) REFERENCES account(account_id)
);

    CREATE TABLE staff (
    account_id int NOT NULL,
    user_id int NOT NULL,
    date_of_employment TIMESTAMP,
    access_level varchar(20),
    CONSTRAINT staff_account_pk PRIMARY KEY (account_id,user_id),
    CONSTRAINT user_id_staff_fk FOREIGN KEY (user_id) REFERENCES users(user_id),
    CONSTRAINT account_id_staff_fk FOREIGN KEY (account_id) REFERENCES ACCOUNT(ACCOUNT_ID)
--     staff account pk is made up of user_id and account_id
);

    CREATE TABLE user_management (
    edit_date timestamp,
    change_description varchar(1000),
    account_id int NOT NULL,
    CONSTRAINT account_id_um_fk FOREIGN KEY (account_id) REFERENCES account(account_id)
);