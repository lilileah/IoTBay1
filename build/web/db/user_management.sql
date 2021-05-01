    CREATE TABLE user_management (
    edit_date timestamp,
    change_description varchar(1000),
    account_id int NOT NULL,
    CONSTRAINT account_id_um_fk FOREIGN KEY (account_id) REFERENCES account(account_id)
);