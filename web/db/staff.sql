    CREATE TABLE staff (
    staff_number int,
    date_of_Employment DATE,

    CONSTRAINT staff_num_pk PRIMARY KEY (staff_number),
    --> what? CONSTRAINT account_id_fk FOREIGN KEY (manager_id) REFERENCES account(account_id)
    CONSTRAINT User_id_fk FOREIGN KEY (user_id) REFERENCES account(user_id)
);