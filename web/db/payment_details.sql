    CREATE TABLE PAYMENT_DETAILS (
    payment_details_id int,
    card_name varchar(254),
    card_no int,
    user_id int,
    CONSTRAINT payment_details_id_pk PRIMARY KEY (payment_details_id),
    CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES users(user_id)
);