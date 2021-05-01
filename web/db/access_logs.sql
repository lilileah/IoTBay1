    CREATE TABLE ACCESS_LOGS (
    log_id int,
    date_accessed timestamp,
    account_id int,
    CONSTRAINT logPK PRIMARY KEY (log_id),
    CONSTRAINT accountFK FOREIGN KEY (account_id) REFERENCES Account(account_id)
);