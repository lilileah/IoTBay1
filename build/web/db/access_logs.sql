    CREATE TABLE ACCESS_LOGS (
    log_id int,
    login_datetime timestamp,
    logout_datetime timestamp,
    user_id int NOT NULL,
    account_id int NOT NULL,
    CONSTRAINT login_PK PRIMARY KEY (log_id),
    CONSTRAINT accountFK FOREIGN KEY (account_id) REFERENCES account(account_id),
    CONSTRAINT useridFK FOREIGN KEY (user_id) REFERENCES users(user_id)
);