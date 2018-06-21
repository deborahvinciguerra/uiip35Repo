# inserimento aereoporto Fabio Spagnuolo #

insert into aeroporto(citta,nazione,npiste) values
                             ('J.F.K.','USA', 40),
                             ('Gatwick', 'UK',30);
                             
  insert into aereo(tipoAereo,nPass,quantitaMerci) values
                                 ('B737', 200, 1000);
                                 
                                 
insert into volo(idVolo,giornoSett,cittaPart,cittaArr, tipoAereo,oraPartenza,oraArrivo )values
                                          (123452,'domenica','New York','Londra','B737', 7, 15);
                             
                             
                             
                             
                             
# fine inserimento Fabio Spagnuolo #


#Inserimento di un volo da torino, Fabio Irno

INSERT INTO aeroporto(citta,nazione,npiste) VALUES
						('Torino','Italia',10),
                        ('Palermo','Italia',2);
                        
INSERT INTO aereo(tipoAereo,nPass,quantitaMerci) VALUES
						('747',250,300);
                        
INSERT INTO volo(idVolo,giornoSett,cittaPart,cittaArr,tipoAereo,oraPartenza,oraArrivo) VALUES
						(10,'Mercoledì','Torino','Palermo','747',10,14);
                        

## fine Fabio Irno
	


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


#inizio inserimento aeroporto Pagliaro
INSERT INTO aeroporto (citta,nazione,npiste) VALUES
					('Londra', 'Inghilterra',10);
                    
 INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) Values
                  ( 'B737', 100, 1000);
   
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) Values
				 ( 33, 'Lunedì', 'Londra', 'Parigi', 'B737', 10, 11 );                   
                    
#fine inserimento aereoporto Pagliaro





#Francesco La Gala
INSERT INTO aeroporto (citta, nazione, nPiste) VALUES
					('bologna', 'italia',4),
                    ('bergamo', 'italia',3);
					
					
                    
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
				('787', 50, 2341);
				
INSERT INTO volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) VALUES


				(143, 'venerdi', 'bologna', 'bergamo', '787', 930, 1130);
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

# Angelo Clemente

insert into aeroporto (citta, nazione, npiste) values
                       ('Parigi', 'Francia', 6),
                       ('Napoli', 'Italia' , 4);
                       
                       
                       
insert into aereo (tipoAereo, nPass, quantitaMerci) values
                   ('DC-3', 50, 20);
                   
                   
insert into volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) values
				(1, 'lunedi' , 'Parigi' , 'Napoli', 'DC-3', 06, 06);
                
                
# Angelo Clemente
