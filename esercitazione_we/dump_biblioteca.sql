# #####################
# DUMPING DATA PHONE 
# #####################

INSERT INTO Tessera (nome, cognome, indirizzo) VALUES
					('Mario', 'Rossi','Via.....');
   
INSERT INTO Libro (titolo, disponibilità,nCopie) VALUES
				  ('Titolo', false, 1);
                  
INSERT INTO Autore (nome, cognome) VALUES
				  ('Filippo', 'Bianchi');
                  
INSERT INTO prestito (tessera, libro) VALUES
				     (1,1);
       
INSERT INTO scritto (idAutore, idLibro) VALUES
				     (1, 1);
                     