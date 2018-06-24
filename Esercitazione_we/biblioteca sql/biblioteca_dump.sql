use biblioteca;

INSERT INTO Tessera (idTessera, nome, cognome, indirizzo) VALUES
					(1, 'Gabriella','Conte','Via alfredo Amatucci'),
					(2, 'Marco','Ienna','Contrada Valle San Andrea'),
                    (3, 'Mario','Rossi','Via Garibaldi'),
                    (4, 'Anna','Verdi','Via alfredo Amatucci');
                    
INSERT INTO Autore (idAutore, nome, cognome) VALUES
				(100, 'Italo', 'Calvino'),
                (101, 'Charles', 'Dickens'),
                (102, 'Miguel', 'de Cervantes'),
                (103,'Joanne Kathleen','Rowling'),
                (104,'Tiziano','Terzani'),
                (105,'Folco','Terzani');

INSERT INTO Libro (idLibro, titolo, numCopie) VALUES
				(200, 'Il barone rampante', 5),
				(201, 'David Copperfield', 3),
                (202, 'Don Chisciotte della Mancia', 1),
                (203, 'Harry Potter e la pietra filosofale', 4),
                (204, 'Harry Potter e la camera dei segreti', 2),
                (205, 'Harry Potter e il prigioniero di Azkaban', 3),
                (206, 'Harry Potter e il calice di fuoco', 1),
                (207, 'La fine è il mio inizio',6);

INSERT INTO Prestito (idT, idL) VALUES
						(1,203),
                        (2,200);

INSERT INTO Scrittura (idA,idLib) VALUES 
						(100,200),
                        (101,201),
                        (102,202),
                        (103,203),
                        (103,204),
                        (103,205),
                        (103,206),
                        (104,207),
                        (105,207);