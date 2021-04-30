    CREATE TABLE user_management (
    edit_date timestamp,
    change_description varchar(1000),
    -->staff acount ID?
    CONSTRAINT account_id_fk FOREIGN KEY (account_id) REFERENCES account(account_id)
);