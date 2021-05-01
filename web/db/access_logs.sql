    CREATE TABLE ACCESS_LOGS (
    log_id int,
    user_id int,
    login_datetime timestamp,
    logout_datetime timestamp,   
    account_id int,
    CONSTRAINT log_pk PRIMARY KEY (log_id),
    CONSTRAINT userid_fk FOREIGN KEY (user_id) REFERENCES Users(user_id)
);