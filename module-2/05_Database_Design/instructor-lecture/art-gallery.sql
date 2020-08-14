
-- WE HAD TO CHANGE THE ORDER OF DROP ONCE WE ADDED CONSTRAINTS. YOU CAN DROP A TABLE IF SOMEONE ELSE IS REFERENCING IT
drop table if exists customer_purchase;
drop table if exists art;
drop table if exists artist;
drop table if exists customer;

CREATE TABLE customer 
(
   customerID serial,
   first_name varchar(64) not null,
   last_name varchar(64) not null,
   address varchar(128) not null,
   
   constraint pk_customer primary key (customerID)
  
);

CREATE TABLE artist
(
   artistID serial,
   first_name varchar(64) not null,
   last_name varchar(64) not null,
   
   constraint pk_artist primary key (artistID)
);

CREATE TABLE art
(
   artID serial,
   title varchar(128) not null,
   artistID int not null,
   
     constraint pk_art primary key (artID),
     constraint fk_art_artist foreign key (artistID) references artist(artistID)
);

CREATE TABLE customer_purchase
(
   customerID int not null,
   artID int not null,
   purchaseDate timestamp not null,
   price money not null,
   
   constraint pk_customer_purchase primary key (customerID, artID, purchaseDate),
   constraint fk_customer_purchase_customer foreign key (customerID) references customer (customerID),
   constraint fk_customer_purchase_art foreign key (artID) references art(artID)
);




-- INSERT STATEMENTS
INSERT INTO customer (first_name, last_name, address)  VALUES ('Matt', 'Eland', '123 Tech Elevator Parking Lot, no key to building');

INSERT INTO artist (first_name, last_name)  VALUES ('Brian', 'Lauvray');

INSERT INTO art (title, artistID) VALUES ('Scream', 1); 
