    CREATE TABLE CUSTOMERS (
    customer_id int,
    date_signedup date,
    user_id int,
    CONSTRAINT customer_pk PRIMARY KEY (customer_id),
    CONSTRAINT user_fk FOREIGN KEY (user_id) REFERENCES Users(user_id)
);