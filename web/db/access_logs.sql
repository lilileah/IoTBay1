    CREATE TABLE ACCESS_LOGS (
    log_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    user_id int NOT NULL,
    action varchar(254),
    time Timestamp,
    CONSTRAINT log_PK PRIMARY KEY (log_id),
    CONSTRAINT useridFK FOREIGN KEY (user_id) REFERENCES users(user_id)
);