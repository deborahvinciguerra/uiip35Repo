drop database if exists Biblioteca;

create database Biblioteca;

USE Biblioteca;

create table if not exists Tessera(
id int(11) not null auto_increment primary key,
nome varchar(32) not null,
cognome varchar(32) not null,
indirizzo varchar(64) not null
);

create table if not exists Libro(
id int(11) not null auto_increment primary key,
titolo varchar(32) not null,
disponibilità boolean not null,
nCopie int(11) not null
);

create table if not exists Autore(
id int(11) not null auto_increment primary key,
nome varchar(32) not null,
cognome varchar(32) not null
);

create table if not exists Prestito(
Tessera int(11) not null,
Libro int(11) not null,
constraint fk_Tessera foreign key (Tessera) references Tessera(id),
constraint fk_Libro foreign key (Libro) references Libro(id)
);

create table if not exists Scritto(
idAutore int(11) not null,
idLibro int(11) not null,
constraint fk_idAutore foreign key (idAutore) references Autore(id),
constraint fk_idLibro foreign key (idLibro) references Libro(id)
);