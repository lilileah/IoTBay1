    CREATE TABLE collection_management (
    edit_date timestamp,
    account_id int NOT NULL,
    product_id int NOT NULL,
    change_description varchar(1000),
    -->staff acount ID?
    CONSTRAINT account_id_cm_fk FOREIGN KEY (account_id) REFERENCES account(account_id),
    CONSTRAINT prodiuct_id_fk FOREIGN KEY (product_id) REFERENCES products(product_id)
    
);