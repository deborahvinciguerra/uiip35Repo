
drop database if exists RubricaTelefonica;
create database RubricaTelefonica;
use RubricaTelefonica;



 
create table if not exists Country(
code varchar(2) not null,
name varchar(32) not null,
primary key (code));

create table if not exists Opsys(
id int (11) not null auto_increment,
description varchar (64) not null,
company varchar (64) not null,
openSource tinyint(1) not null,
primary key (id));

create table if not exists Brand(
id int (11) not null auto_increment,
name varchar(32) not null,
country varchar(2) not null,
primary key (id),
constraint fk_country foreign key (country) references Country(code));

create table if not exists Smartphone(
id int (11) not null auto_increment,
name varchar(64) not null,
ram varchar(5) not null,
cpu varchar(64) not null,
displayPpi int(11) not null,
displaySize varchar(12) not null,
displayResolution varchar(64) not null,
size varchar (64) not null,
weight int(4) not null,
notes varchar (1024) not null,
brand int (11) not null,
opSys int (11) not null,
primary key (id),
constraint fk_brand foreign key (brand) references Brand (id),
constraint fk_opsys foreign key (opsys) references Opsys (id));

create table if not exists Contact(
id int (11) not null auto_increment,
number varchar(16) not null,
name varchar(32) not null,
surname varchar(32) not null,
smartphone int (11) not null,
constraint fk_smartphone foreign key (smartphone) references Smartphone (id),
primary key (id));