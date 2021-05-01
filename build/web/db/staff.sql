    CREATE TABLE staff (
    user_id int NOT NULL,
    date_of_employment TIMESTAMP,
    access_level varchar(20),
    CONSTRAINT user_id_staff_fk FOREIGN KEY (user_id) REFERENCES users(user_id)
);