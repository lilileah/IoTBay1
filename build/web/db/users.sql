    CREATE TABLE USERS (
    user_id int,
    username_email varchar(254),
    user_name varchar(254),
    password varchar(254),
    phone varchar(15),
    dob date,
    gender varchar(254),
    user_type varchar(1),
    CONSTRAINT userspk PRIMARY KEY (user_id)
);