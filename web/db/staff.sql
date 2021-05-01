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