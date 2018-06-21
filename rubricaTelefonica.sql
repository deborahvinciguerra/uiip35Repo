drop database if exists rubricaTelefonica;

create database rubricaTelefonica;

USE rubricaTelefonica;

create table if not exists Country(
code varchar(2) not null primary key,
name varchar(32) not null
);

create table if not exists Brand(
id int(11) not null auto_increment primary key,
name varchar(32) not null,
country varchar(2) not null,
constraint fk_country foreign key (country) references Country(code)
);

create table if not exists OpSys(
id int(11) not null auto_increment primary key,
description varchar(64) not null,
company varchar(64) not null,
openSource tinyint(1) not null
);

create table if not exists Smartphone(
id int(11) not null auto_increment primary key,
name varchar(64) not null,
ram varchar(5) not null,
cpu varchar(64) not null,
displayPpi int(11) not null,
displaySize varchar(12) not null,
displayResolution varchar(64) not null,
size varchar(64) not null,
weight int(4) not null,
notes varchar(1024) not null,
brand int (11) not null,
opSys int(11) not null,
constraint fk_brand foreign key (Brand) references Brand(id),
constraint fk_opSys foreign key (OpSys) references OpSys(id)
);

create table if not exists Utente(
numero varchar(32) not null primary key,
name varchar(64) not null,
cognome varchar(64) not null,
smartphone int(11) not null,
constraint fk_smartphone foreign key (smartphone) references smartphone(id)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;