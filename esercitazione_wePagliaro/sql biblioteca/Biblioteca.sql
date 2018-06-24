drop database if exists Biblioteca;

create database  Biblioteca
	default character set latin1
    default collate latin1_general_ci;
    

use Biblioteca;

drop table if exists Libro;
create table Libro(
	isbn varchar(32)not null,
	titolo varchar(32) not null ,
    numeroCopie int(11) not null,
   constraint pk_isbn primary key(isbn)
    );   
    
    drop table if exists Autore;
create table Autore(
	id int(11) not null,
	nome varchar(32)not null,
	cognome varchar(32) not null ,
   constraint pk_id primary key(id)
    );   
    
  drop table if exists Tessera;
create table Tessera(
	id int(11) not null,
	nome varchar(32)not null,
	cognome varchar(32) not null ,
    indirizzo varchar(64) not null ,
   constraint pk_id primary key(id)
    );      
    
     drop table if exists Scrittura;
	create table Scrittura(
	isbnLibro varchar(32) not null,
	idAutore int(11) not null,
	
		foreign key(isbnLibro) references Libro(isbn),
		foreign key(idAutore) references Autore(id)

    );  
    
    
     drop table if exists Prestito;
	create table Prestito(
	isbnLibro varchar(32) not null,
	idTessera int(11) not null,
	
		foreign key(idTessera) references Tessera(id),
		foreign key(isbnLibro) references Libro(isbn)

    );      
    
    
    
    
    
    
    
    