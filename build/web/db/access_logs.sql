    CREATE TABLE ACCESS_LOGS (
    log_id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    login_datetime timestamp,
    logout_datetime timestamp,
    user_id int NOT NULL,
    CONSTRAINT login_PK PRIMARY KEY (log_id),
    CONSTRAINT useridFK FOREIGN KEY (user_id) REFERENCES users(user_id)
);