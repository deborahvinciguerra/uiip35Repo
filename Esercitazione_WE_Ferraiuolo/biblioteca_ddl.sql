drop database if exists Biblioteca;

create database if not exists Biblioteca
	default character set latin1
    default collate latin1_general_ci;
    
use Biblioteca;
    
create table if not exists Autore (
	idAutore int(3) not null primary key,
    nomeAutore varchar(16) not null,
    cognomeAutore varchar(16) not null
);

create table if not exists Libro (
	idLibro int(8) not null primary key,
    titolo varchar(64) not null,
    numCopie int(2) ,
    disponibilita bool
);

create table if not exists LibroAutore (
	libro int(8) not null,
    autore int(3) not null,
    constraint pk_Libro foreign key (libro) references Libro(idLibro),
    constraint pk_Autore foreign key (autore) references Autore(idAutore)
);

create table if not exists Tessera (
	idTessera int(5) not null primary key,
    nome varchar(16) not null,
    cognome varchar(16) not null
);

create table if not exists Prenotazione(
	idPrenotazione int(5) not null primary key,
    tessera int(5) not null,
    libro int(8) not null,
    constraint fk_Tessera foreign key (tessera) references Tessera(idTessera),
    constraint fk_Libro foreign key (libro) references Libro(idLibro)
);