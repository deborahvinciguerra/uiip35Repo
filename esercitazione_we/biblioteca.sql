drop database if exists biblioteca;

create database biblioteca;
use biblioteca;

create table if not exists  libro (
titolo varchar(32) not null,
disponibilità varchar(2) not null,
numcopia int(3) not null,
idBook int(16) not null,
primary key(idBook)
);

create table if not exists autore(
nome varchar(16) not null,
cognome varchar(16) not null,
idAuthor int(16) not null,
primary key(idAuthor)
);

create table if  not  exists lettore(
nome varchar(16) not null,
cognome varchar(16) not null,
idTessera int(16) not null,
primary key(idTessera)
);

create table if not exists prestito(
idTessera int(16) not null,
idBook int(16) not null,
foreign key (idTessera) references  lettore(idTessera),
 foreign key(idBook) references libro(idBook)
);
create table if not exists redattoDa(
idBook int(16) not null,
idAuthor int(16) not null,
 foreign key (idAuthor) references autore(idAuthor),
 foreign key(idBook) references libro(idBook)
);





 