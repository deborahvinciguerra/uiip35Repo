drop database if exists Rubrica_Telefonica;

create database if not exists Rubrica_Telefonica
	default character set latin1
    default collate latin1_general_ci;
    
use Rubrica_Telefonica;

create table if not exists Country (
	code varchar(2) not null,
    name varchar(32) not null,
    primary key (code)
);

create table if not exists Brand (
	id int(11) not null,
    name varchar(32) not null,
    country varchar(2) not null,
    primary key (id),
    constraint fk_country foreign key (country) references Country(code)
);

create table if not exists Opsys (
	id int(11) not null,
    description varchar(64) not null,
    company varchar(64) not null,
    opensource tinyint(1) not null,
    primary key (id)
);

create table if not exists Smartphone (
	id int(11) not null,
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
    opsys int(11) not null,
    primary key (id),
    constraint fk_brand foreign key (brand) references Brand(id),
    constraint fk_opSys foreign key (opsys) references Opsys(id)
);


create table if not exists Contatto (
	numCell varchar(11) not null primary key,
    nome varchar(32) not null,
    cognome varchar(32) not null,
    modelloTel int(20) not null,
    constraint fk_model foreign key (modelloTel) references Smartphone(id)    
);
