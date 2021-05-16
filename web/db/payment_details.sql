       CREATE TABLE PAYMENT_DETAILS (
    payment_details_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    card_type varchar(30),
    card_number BIGINT NOT NULL,
    owner_name varchar(50),
    exp_date varchar(20),
    CCV int NOT NULL,
    user_id int,
    amount varchar(20),
    CONSTRAINT payment_details_id_pk PRIMARY KEY (payment_details_id),
    CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES users(user_id)
);