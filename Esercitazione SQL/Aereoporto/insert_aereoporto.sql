
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

