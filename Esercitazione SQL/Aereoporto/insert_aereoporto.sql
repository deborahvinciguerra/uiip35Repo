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