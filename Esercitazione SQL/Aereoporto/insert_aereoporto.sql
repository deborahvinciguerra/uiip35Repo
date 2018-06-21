# inserimento Giacomo Ferraiuolo
insert into aeroporto (citta, nazione, npiste) values
						('Napoli','Italia',2),
						('Milano','Italia',4);
        
insert into aereo (tipoAereo, nPass, quantitaMerci) values
					('A320', 200, 4000);

insert into volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo) values
				(1,'Lunedì','Napoli','Milano','A320',9,11);