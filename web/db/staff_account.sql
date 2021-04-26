    CREATE TABLE STAFF_ACCOUNT (
    account_id int,
    user_id int,
    access_level varchar(20)
    CONSTRAINT staff_accountPK PRIMARY KEY (account_id,user_id) 
--     staff account pk is made up of user_id and account_id
);