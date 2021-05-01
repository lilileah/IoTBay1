    CREATE TABLE shipment_details (
    shipment_details_id int,
    country varchar(2),
    address varchar(128),
    postcode int,
    is_billing_address boolean,
    account_id int NOT NULL,
    CONSTRAINT shipment_details_pk PRIMARY KEY (shipment_details_id),
    CONSTRAINT account_id_fk FOREIGN KEY (account_id) REFERENCES account(account_id)
);
--vew