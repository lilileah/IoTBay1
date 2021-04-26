    CREATE TABLE CUSTOMERS (
    customer_id int,
    date_signedup date,
    user_id int,
    CONSTRAINT customerPK PRIMARY KEY (customer_id),
    CONSTRAINT userFK FOREIGN KEY (user_id) REFERENCES Users(user_id)
);