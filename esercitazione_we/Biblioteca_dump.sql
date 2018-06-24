# inserimento di autori nel Db_Biblioteca
INSERT INTO AUTORI (IDAutore,Cognome,Nome) VALUES
			(1,'Rossi','Pino'),
		    (2,'Giallo','Luigi');

# inserimento libri

INSERT INTO LIBRI (IDLibro,IDAutore, Titolo,NumCopie) VALUES
				(1,1,'Il destino',8),
                (2,1,'Non aprire quella porta',5),
                (3,2,'Le porte del cuore',4),
                (4,2,'Nostalgia',2);

# inserimento lettori  

INSERT INTO LETTORI (IDLettore,Tessera,Nome,Indirizzo) VALUES
				(1,'100','Fabio','Corso Caracciolo'),
                (2,'80','Roberta','Via Ernesto');
                
# Inserimento noleggi
INSERT INTO PRESTITI(IDPrestito,IDLibro,IDLettore) VALUES
				(1,1,1),
                (2,2,2);    #In questo modo i due lettori prendono 2 libri in prestito

          

				
            

	