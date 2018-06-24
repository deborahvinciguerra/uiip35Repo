drop database if exists biblioteca;

create database if not exists biblioteca;

use biblioteca;

create table if not exists Tessera (
	idTessera int(10) not null primary key,
    nome varchar(32) not null, 
    cognome varchar(32) not null,
    indirizzo varchar(32) not null
);

create table if not exists Autore (
	idAutore int(10) not null primary key,
    nome varchar(32) not null,
    cognome varchar(32) not null
);

create table if not exists Libro (
	idLibro int(10) not null primary key,
    titolo varchar(64) not null,
    numCopie int(10) not null
);

create table if not exists Prestito (
	idT int(10) not null,
    idL int(10) not null,
    constraint fk_tessera foreign key (idT) references Tessera(idTessera),
    constraint fk_libro foreign key (idL) references Libro(idLibro)
);

create table if not exists Scrittura (
	idA int(10) not null,
    idLib int(10) not null,
    constraint fk_autore foreign key (idA) references Autore(idAutore),
    constraint fk_lib foreign key (idLib) references Libro(idLibro) 
);