
drop database if exists rubricaTelefonica;
create database rubricaTelefonica
default character set latin1
default collate latin1_general_ci;

Use Phone;

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


create table if not exists Opsys(
id int(11) not null auto_increment primary key,
description varchar(64) not null,
company varchar(62) not null,
openSource tinyint(1) not null
);

Create table if not exists Smartphone(
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
brand int(11) not null,
opSys int(11) not null,
constraint fk_brand  foreign key (brand) references Brand(id),
constraint fk_opSys  foreign key (opSys) references Opsys(id)
);



create table if not exists contatto(
numeroCellulare int(11) not null primary key,
nome varchar(64) not null,
cognome varchar(64) not null,
smartphone int(11) not null,
constraint fk_brand foreign key (smartphone) references Smartphone(id)
);








