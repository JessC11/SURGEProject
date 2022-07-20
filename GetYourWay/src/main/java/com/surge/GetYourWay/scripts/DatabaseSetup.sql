CREATE DATABASE SurgeSchema;
USE SurgeSchema;

CREATE TABLE customer (
 customer_id INT AUTO_INCREMENT,
 email VARCHAR(50) NOT NULL,
    password_hash VARCHAR(64) NOT NULL,
    first_name VARCHAR(25) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    PRIMARY KEY (customer_id)
);

create table image(
image_id int primary key auto_increment,
image VARCHAR(256));

create table programme(
programme_id int primary key auto_increment,
image_id int,
programme varchar (30) not null,
foreign key (image_id) references image(image_id));

create table destination(
destination_id int primary key auto_increment,
destination varchar(30) not null,
programme_id int,
info varchar(8000),
foreign key (programme_id) references programme(programme_id) );


CREATE TABLE flight (
 flight_id INT AUTO_INCREMENT,
 origin VARCHAR(30) NOT NULL,
 destination_id INT NOT NULL,
    depart_time DATETIME NOT NULL,
    arrive_time DATETIME NOT NULL,
    PRIMARY KEY(flight_id),
    FOREIGN KEY (destination_id) REFERENCES destination (destination_id)
);

create table trip(
trip_id int not null primary key auto_increment,
customer_id int not null,
foreign key (customer_id) references customer(customer_id)
);

create table journey(
journey_id int not null primary key auto_increment,
flight_id int not null,
trip_id int not null,
foreign key (flight_id) references flight(flight_id),
foreign key (trip_id) references trip (trip_id)
);

