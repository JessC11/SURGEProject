CREATE DATABASE SurgeSchema;
USE SurgeSchema;

CREATE TABLE customer (
 customerId INT AUTO_INCREMENT,
    email VARCHAR(50) NOT NULL,
    passwordHash VARCHAR(64) NOT NULL,
    firstName VARCHAR(25) NOT NULL,
    lastName VARCHAR(30) NOT NULL,
    PRIMARY KEY (customerId)
);

create table image(
imageId int primary key auto_increment,
image VARCHAR(256));

create table programme(
programmeId int primary key auto_increment,
programme varchar (30) not null);

create table destination(
destinationId int primary key auto_increment,
destination varchar(30) not null,
programmeId int,
info varchar(8000),
imageId int,
foreign key (imageId) references image(imageId),
foreign key (programmeId) references programme(programmeId) );

CREATE TABLE flight (
 flightId INT AUTO_INCREMENT,
 origin VARCHAR(30) NOT NULL,
    destinationId INT NOT NULL,
    departTime DATETIME NOT NULL,
    arriveTime DATETIME NOT NULL,
    PRIMARY KEY(flightId),
    FOREIGN KEY (destinationId) REFERENCES destination (destinationId)
);

create table trip(
tripId int not null primary key auto_increment,
customerId int not null,
foreign key (customerId) references customer(customerId)
);

create table journey(
journeyId int not null primary key auto_increment,
flightId int not null,
tripId int not null,
foreign key (flightId) references flight(flightId),
foreign key (tripId) references trip (tripId)
);