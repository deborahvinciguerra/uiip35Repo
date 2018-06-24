insert into Lettori (tessera, nome, cognome) values
                     (1111, 'Angelo', 'Clemente'),
                     (2222, 'Domenico', 'Giuda'),
                     (3333, 'Fabio', 'Spagnuolo');
                     
                     
insert into Autori (idAutore, nomeAutore) values
                    (1 , 'J. K. Rowling'),
                    (2 , 'Jonathan Swift');
                    
                
                    
                    
insert into Libri (idLibro, titolo, autori, numeroCopie, lettori) values
				(3, 'Harry Potter e la pietra filosofale', 1, 30, 1111),
                (4, 'Harry Potter e il calice di fuoco', 1, 30, 1111),
                (5, 'I viaggi di Gulliver', 2, 15, 3333),
                (6, 'Harry Potter e i doni della morte', 1, 30, 1111);
                
insert into LibroAutore(idAutore, idLibro) values
                        (1,3),
						(1,4),
                        (2,5);
