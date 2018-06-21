

#inizio inserimento aeroporto Pagliaro
INSERT INTO aeroporto (citta,nazione,npiste) VALUES
					('Londra', 'Inghilterra',10);
                    
 INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) Values
                  ( 'B737', 100, 1000);
   
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) Values
				 ( 33, 'Lunedì', 'Londra', 'Parigi', 'B737', 10, 11 );                   
                    
#fine inserimento aereoporto Pagliaro
					

# #####################
# DUMPING DATA VOLO 
# #####################
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

				(143, 'venerdi', 'bologna', 'bergamo', '787', 930, 1130);

INSERT INTO aeroporto (citta, nazione, nPiste) VALUES
					('bologna', 'italia',4),
                    ('bergamo', 'italia',3);
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


>>>>>>> be42a7c864e6468e6646614381d068e1191b0155
