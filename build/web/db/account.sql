    CREATE TABLE account (
    account_id int,
    username varchar(64),
    password varchar(254),
    email varchar(128),
    CONSTRAINT account_id_pk PRIMARY KEY (account_id),
    CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES Users(user_id)
);