#Inserimento di un volo da torino, Fabio Irno

INSERT INTO aeroporto(citta,nazione,npiste) VALUES
						('Torino','Italia',10),
                        ('Palermo','Italia',2);
                        
INSERT INTO aereo(tipoAereo,nPass,quantitaMerci) VALUES
						('747',250,300);
                        
INSERT INTO volo(idVolo,giornoSett,cittaPart,cittaArr,tipoAereo,oraPartenza,oraArrivo) VALUES
						(10,'Mercoledì','Torino','Palermo','747',10,14);
                        

## fine Fabio Irno
	
                        
