drop database if exists Biblioteca;
create database Biblioteca;
use Biblioteca;




create table Lettori(
tessera int(11) not null  primary key,
nome varchar(64) not null,
cognome varchar(64) not null

);

create table Autori(
idAutore int(11) not null auto_increment primary key,
nomeAutore varchar(64) not null
);


create table Libri(
idLibro int(11) not null  primary key,
titolo varchar(64) not null,
autori int(11) not null,
numeroCopie int(11) not null,
lettori int(11) not null,
constraint fk_Lettori foreign key (lettori) references Lettori(tessera),
constraint fk_Autori foreign key (autori) references Autori(idAutore)

);


create table LibroAutore(
idAutore int(11) not null ,
idLibro int(11) not null ,
primary key(idAutore,idLibro),
constraint fk_autore foreign key (idAutore) references Autori(idAutore),
constraint fk_Libro foreign key (idLibro) references Libri(idLibro)
);