use viaggi;

#inizio script Gabriella Conte
insert into aeroporto (città, nazione, nPiste) values
						('Parigi','Francia',3),
                        ('Nizza','Francia',2);
                        
insert into aereo (tipoAereo, nPass, quantitaMerci) values
						('B747',500,10000);

insert into volo (idVolo,giornoSett,cittaPart,cittaArr,tipoAereo,oraPartenza,oraArrivo) values
					('027','mercoledì','Nizza','Parigi','B747',8,10);
#fine script Gabriella Conte

#Domenico Guida

INSERT INTO aeroporto (citta, nazione, nPiste) VALUES
					  ('Rio de Janeiro', 'Brasile',  4),
                      ('Tokyo', 'Brasile',  4);
                       
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) Values
                  ( 'B737', 100, 2000);
   
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) Values
				 ( 1, 'Martedì', 'Rio de Janeiro', 'Tokyo', 'B737', 15, 23 );
#Domenico Guida

#Francesco La Gala
INSERT INTO aeroporto (citta, nazione, nPiste) VALUES
					('bologna', 'italia',4),
                    ('bergamo', 'italia',3);
					
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
				('787', 50, 2341);
				
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) VALUES

				(143, 'venerdi', 'bologna', 'bergamo', '787', 9, 11);
#Francesco La Gala
					
# Inserimento Giacomo Ferraiuolo
INSERT INTO aeroporto (citta, nazione, nPiste) VALUES
					('Napoli', 'Italia',2),
                    ('Milano', 'Italia',4);
                    
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
					('A320', 200, 4000);
                    
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) VALUES
				(1, 'Lunedì', 'Napoli', 'Milano', 'A320', 9, 11);

# Inserimento Giacomo Ferraiuolo


