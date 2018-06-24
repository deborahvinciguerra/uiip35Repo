#riempimento biblioteca

INSERT INTO Libro (isbn,titolo, numeroCopie) VALUES
					('123', 'Harry Potter','3'),
                    ('456', 'Codice Da Vinci','2'),
                    ('789', 'La teoria del tutto','5'),
                    ('748', 'La coscienza di zeno','1'),
                    ('999', 'Tools of titans','3'),
                    ('111', 'Cappuccetto rosso','3'),
                    ('222', 'Gomorra','1'),
                     ('333', 'Zero zero zero','3'),
                     ('444','Architetture dei calcolatori','3');
                    
                    
INSERT INTO Autore (id,nome, cognome) VALUES
					('1', 'Roberto','Saviano'),
                    ('2', 'Tim','Ferris'),
                    ('3', 'Dan','Brown'),
                    ('4', 'J.K.','Rowling'),
                    ('5', 'Stephen','Hawking'),
                    ('6', 'Italo','Svevo'),
					('7', 'John','Hennessy'),
					('8', 'David','Patterson');
                    
INSERT INTO Tessera (id,nome, cognome,indirizzo) VALUES
					('1', 'Maria','Rossi','via dante'),
                    ('2', 'Aldo','Baglio','via boccaccio'),
                    ('3', 'Paolo','Verdi','via manzoni'),
                    ('4', 'Mario','Gomez','via leopardi'),
                    ('5', 'Carmen','Cocca','via pascoli'),
					('6', 'Angelo','De Laurentis','via san pietro');
                    
INSERT INTO Scrittura (isbnLibro,idAutore) VALUES
					('123', '4'),
                    ('456', '3'),
                    ('789', '5'),
                    ('748', '6'),
                    ('999', '2'),
                    ('222', '1'),
                    ('333', '1'),
					('444', '7'),
					('444', '8');
                    
INSERT INTO Prestito (isbnLibro,idTessera) VALUES
					('748', '2'),
                    ('999', '3'),
                    ('222', '4');
                    
