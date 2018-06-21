#inizio script Gabriella Conte
insert into aeroporto (citta, nazione, nPiste) values
						('Parigi','Francia',3),
                        ('Nizza','Francia',2);
                        
insert into aereo (tipoAereo, nPass, quantitaMerci) values
						('B747',500,10000);

insert into volo (idVolo,giornoSett,cittaPart,cittaArr,tipoAereo,oraPartenza,oraArrivo) values
					(27,'mercoledì','Nizza','Parigi','B747',8,10);
#fine script Gabriella Conte

#Inserimento di un volo da torino, Fabio Irno

INSERT INTO aeroporto(citta,nazione,npiste) VALUES
						('Torino','Italia',10),
                        ('Palermo','Italia',2);
                        
INSERT INTO aereo(tipoAereo,nPass,quantitaMerci) VALUES
						('B727',250,300);
                        
INSERT INTO volo(idVolo,giornoSett,cittaPart,cittaArr,tipoAereo,oraPartenza,oraArrivo) VALUES
						(10,'Mercoledì','Torino','Palermo','B727',10,14);
                        

## fine Fabio Irno
	
#Domenico Guida

INSERT INTO aeroporto (citta, nazione, nPiste) VALUES
					  ('Rio de Janeiro', 'Brasile',  4),
                      ('Tokyo', 'Giappone',  4);
                       
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) Values
                  ( 'A319', 100, 2000);
   
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) Values
				 ( 3, 'Martedì', 'Rio de Janeiro', 'Tokyo', 'A319', 15, 23 );
#Domenico Guida


#inizio inserimento aeroporto Pagliaro
INSERT INTO aeroporto (citta,nazione,npiste) VALUES
					('Londra', 'Inghilterra',10);
                    
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) Values
                  ( 'B777', 100, 400);
   
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) Values
				 ( 33, 'Lunedì', 'Londra', 'Parigi', 'B777', 10, 11 );                   
                    
#fine inserimento aereoporto Pagliaro

# inserimento aereoporto Fabio Spagnuolo #

insert into aeroporto(citta,nazione,npiste) values
                             ('New York','USA', 40);
                             
insert into aereo(tipoAereo,nPass,quantitaMerci) values
                                 ('B737', 200, 1000);
                                 
                                 
insert into volo(idVolo,giornoSett,cittaPart,cittaArr, tipoAereo,oraPartenza,oraArrivo )values
                                          (123,'domenica','New York','Londra','B737', 7, 15);              
                             
# fine inserimento Fabio Spagnuolo #

#Francesco La Gala
INSERT INTO aeroporto (citta, nazione, nPiste) VALUES
					('Bologna', 'italia',4),
                    ('Bergamo', 'italia',3);
					
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
				('B787', 500, 2341);
				
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) VALUES
				(143, 'venerdi', 'bologna', 'bergamo', 'B787', 930, 1130);
#Francesco La Gala

# Inserimento Giacomo Ferraiuolo
INSERT INTO aeroporto (citta, nazione, nPiste) VALUES
					('Napoli', 'Italia',6),
                    ('Milano', 'Italia',4);
                    
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
					('A320', 200, 4000);
                    
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) VALUES
				(1, 'Lunedì', 'Napoli', 'Milano', 'A320', 9, 11);

# Inserimento Giacomo Ferraiuolo

# Angelo Clemente

insert into aeroporto (citta, nazione, npiste) values
                       ('Amsterdam', 'Olanda', 6),
                       ('Sanpietroburgo', 'Russia' , 4);
                       
                       
                       
insert into aereo (tipoAereo, nPass, quantitaMerci) values
                   ('A380', 800, 10000);
                   
                   
insert into volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) values
				(2, 'lunedi' , 'Parigi' , 'Napoli', 'A380', 04, 06);
                
                
# Angelo Clemente
