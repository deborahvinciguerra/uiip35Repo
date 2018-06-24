insert into libro (titolo,disponibilità,numcopia,idBook) values
                                ('analisi 2','si',2,1),
                                ('fisica1','si',3,2),
                                ('geometria 3','si',5,3),
                                ('fisica2','no',1,4),
                                 ('fisica2','si',2,5);
					
insert into autore (nome,cognome,idAuthor) values
                               ('Carlo','Pagani',1),
						       ('Assunta','Russo',2),
                               ('Hallyday','Resnick',3);
                               
                               
insert into lettore(nome,cognome,idTessera) values 
                               ('Fabio','Spagnuolo',56),
                               ('Angelo','Clemente',65),
                               ('Domenico','Guida',23);
                               
insert into prestito(idTessera,idBook) values 
                              ( 56,1),
                              (23,3),
                              (65,2);
                              
                              
                              
insert into redattoDa(idBook,idAuthor) values 
                             (1,1),
                             (2,3),
                             (3,2),
                             (4,3),
                             (5,3);