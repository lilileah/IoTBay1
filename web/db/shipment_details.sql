    CREATE TABLE shipment_details (
    shipment_details_id int,
    country varchar(2),
    address varchar(128),
    postcode int,
    is_billing_address boolean,
    user_id int NOT NULL,
    CONSTRAINT shipment_details_pk PRIMARY KEY (shipment_details_id),
    CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES users(user_id)
);
--vew