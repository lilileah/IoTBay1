create table SHIPMENT
(
	ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 10000, INCREMENT BY 1),
	ORDERID INTEGER not null,
        USERID INTEGER not null,
        NAME VARCHAR(200) not null,
	MOBILE VARCHAR(200) not null,
        ADDRESS1 VARCHAR(200),
	ADDRESS2 VARCHAR(200),
	SUBURB VARCHAR(100),
	CITY VARCHAR(100),
	STATE VARCHAR(50),
	POSTCODE VARCHAR(10),
	STATUS VARCHAR(200) default 'Not Shipped' not null,
	METHOD VARCHAR(200) default 'Australia Post',
	SHIPMENT_TIME TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO SHIPMENT(ORDERID, USERID, NAME, MOBILE, ADDRESS1, ADDRESS2, SUBURB, CITY, STATE, POSTCODE, METHOD)
VALUES (1000, 1, 'John Doe', '0411111222', '239 Kavin St', null, 'Burwood', 'Sydney', 'NSW', '2066', 'Startrack');

