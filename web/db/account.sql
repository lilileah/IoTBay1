    CREATE TABLE account (
    account_id int NOT NULL,
    username varchar(64),
    password varchar(254),
    email varchar(128),
    user_id int NOT NULL,
    CONSTRAINT account_id_pk PRIMARY KEY (account_id),
    CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES USERS(user_id)
);