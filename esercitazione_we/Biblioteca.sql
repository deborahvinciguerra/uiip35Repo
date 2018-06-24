Drop database if exists BIBLIOTECA;

CREATE DATABASE IF NOT EXISTS BIBLIOTECA
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_cs;
    
USE BIBLIOTECA;

Drop table if exists LETTORI;

CREATE TABLE IF NOT EXISTS LETTORI(
	IDLettore INT(11),
    Tessera VARCHAR(20),
	Nome VARCHAR(20),
    Indirizzo VARCHAR(20),
    PRIMARY KEY(IDLettore)
);

Drop table if exists AUTORI;

CREATE TABLE IF NOT EXISTS AUTORI(
	IDAutore INT(11),
    Cognome VARCHAR(30),
    Nome VARCHAR(20),
    PRIMARY KEY (IDAutore)
);

Drop table if exists LIBRI;

CREATE TABLE IF NOT EXISTS LIBRI(
	IDLibro INT(11),
    IDAutore INT(11),
    Titolo VARCHAR(50),
    NumCopie INT(10),
    PRIMARY KEY (IDLibro),
    FOREIGN KEY (IDAutore) REFERENCES AUTORI(IDAutore)
    #ON DELETE CASCADE    #la cancellazione o la modifica dell'autore avrà come
    #ON UPDATE CASCADE    # come conseguenza la cancellazione o la modifica dei relativi libri.		
);

CREATE TABLE PRESTITI(
	IDPrestito INT(11),
    IDLibro INT(11),
    IDLettore INT(11),
    Riportato ENUM ('S','N') DEFAULT'N',
    PRIMARY KEY(IDPrestito),
    FOREIGN KEY (IDLibro) REFERENCES LIBRI(IDLibro),
		#ON DELETE CASCADE
        #ON UPDATE CASCADE,
	FOREIGN KEY (IDLettore) REFERENCES LETTORI(IDLettore)
		#ON DELETE CASCADE
        #ON UPDATE CASCADE
);

    




    

