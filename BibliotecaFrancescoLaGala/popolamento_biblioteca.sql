INSERT INTO Libro (titolo, numeroCopie) VALUES
					('Il mattino',2 ),
					('La sera', 3 ),
					('Tramonti', 4),
					('La strada', 5 ),
					('Australia', 9 ),
					('Polpette', 1),
					('Il deserto', 2),
                    ('Il mare', 0);
                    
INSERT INTO Autore (nome, cognome) VALUES
					('Lara', 'Bianchi'),
					('Maria', 'Rossi'),
					('Piero', 'Verdi'),
					('Paolo', 'Scotti'),
					('Luca', 'Coda'),
					('Francesco', 'Parma'),
					('Antonio', 'Roma'),
                    ('Paola', 'Conti');
                    
INSERT INTO Tessera (nome, cognome) VALUES
					('Sara', 'Rossi'),
					('Michele', 'Bianchi'),
					('Vittorio', 'Verdi'),
					('Rossella', 'Scotti'),
					('Francesco', 'Coda'),
					('Giacomo', 'Parma'),
					('Domenico', 'Roma'),
                    ('Saverio', 'Conti');
                    
INSERT INTO LibroAutore (idLibro,idAutore) VALUES
                        (8,1),  
                        (7,2),
                        (6,2),
                        (5,5),
                        (4,5),
                        (3,6),
                        (2,7),
                        (1,8),
                        (1,3),
                        (3,4),
                        (5,4);
                        
INSERT INTO LibroTessera (idLibro,idTessera) VALUES
                        (3,4); 