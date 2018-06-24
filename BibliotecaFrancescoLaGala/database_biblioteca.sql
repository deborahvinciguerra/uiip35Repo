
drop database if exists Biblioteca;
create database Biblioteca;
use Biblioteca;

create table if not exists Libro(
idLibro int (11) not null auto_increment,
titolo varchar (32) not null,
numeroCopie int (11) not null,
primary key (idLibro));


create table if not exists Autore(
idAutore int (11) not null auto_increment,
nome varchar(32) not null,
cognome varchar (32) not null,
primary key (idAutore));

create table if not exists Tessera(
idTessera int (11) not null auto_increment,
nome varchar(32) not null,
cognome varchar (32) not null,
primary key (idTessera));


create table if not exists LibroAutore(
idLibro int (11) not null,
idAutore int (11) not null,
primary key (idLibro,idAutore),
constraint fk_idLibro foreign key (idLibro) references Libro (idLibro),
constraint fk_idAutore foreign key (idAutore) references Autore (idAutore));

create table if not exists LibroTessera(
idLibro int (11) not null,
idTessera int (11) not null,
primary key (idLibro,idTessera),
constraint fk_idLibro2 foreign key (idLibro) references Libro (idLibro),
constraint fk_idTessera foreign key (idTessera) references Tessera (idTessera));
