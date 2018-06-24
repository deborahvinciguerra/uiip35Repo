insert into Autore (idAutore, nomeAutore, cognomeAutore) values
					(1, 'Suzanne','Collins'),
                    (2, 'J.K.','Rowling'),
                    (3, 'Conan','Doyle'),
                    (4, 'Agatha','Christie'),
                    (5, 'J.R.R','Tolkien');
                    
insert into Libro (idLibro, titolo, numCopie) values
				(1, 'Harry Potter e la pietra filosofale', 3),
                (2, 'Harry Potter e la camera dei segreti', 4),
                (3, 'Harry Potter e il prigioniero di Azkaban', 3),
                (4, 'Harry Potter e il calice di fuoco', 2),
                (5, 'Harry Potter e l ordine della fenice', 4),
                (6, 'Harry Potter e il principe mezzosangue', 3),
                (7, 'Harry Potter e i doni della morte', 5),
                (8, 'Hunger Games', 7),
                (9, 'Hunger Games - la ragazza di fuoco', 4),
                (10, 'Hunger Games - il canto della rivolta', 6),
                (11, 'Sherlock Holems - uno studio in rosso', 8),
                (12, 'Sherlock Holmes - il mastino dei Baskerville', 4),
                (13, 'Assassinio sull Orient Express', 3),
                (14, 'Il Signore degli Anelli - trilogia', 2),
                (15, 'Harry Potter e Frodo', 2),
                (16, 'Miss Marpol e Sherlock Holmes', 1);
                
insert into LibroAutore (libro, autore) values
						(1, 2),
                        (2, 2),
                        (3, 2),
                        (4, 2),
                        (5, 2),
                        (6, 2),
                        (7, 2),
                        (8, 1),
                        (9, 1),
                        (10, 1),
                        (11, 3),
                        (12, 3),
                        (13, 4),
                        (14, 5),
                        (15, 2),
                        (15, 5),
                        (16, 3),
                        (16, 4);
                        
insert into Tessera (idTessera, nome, cognome) values
					(1, 'Giacomo','Ferraiuolo'),
                    (2, 'Antonio','Del Prete'),
                    (3, 'Rossella','Capasso'),
                    (4, 'Federica','Esposito');
                    
insert into Prenotazione (tessera, libro) values
						(1, 1);
					
                        
                