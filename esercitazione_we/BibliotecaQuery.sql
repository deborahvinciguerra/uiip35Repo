#UPDATE PRESTITI SET Riportato = 'S' WHERE IDLettore = 1 AND IDLibro = 1;
#DELETE FROM PRESTITI WHERE IDLettore = 2;

#Per visualizzare tutti i libri registrati all'interno della nostra banca dati:
#SELECT * FROM LIBRI;

# Visualizzare il titolo dei libri presenti:

SELECT TITOLO, NumCopie FROM LIBRI;  

SELECT l.Tessera, l.Nome,l.Indirizzo, COUNT(p.IDLibro) AS LIBRI
FROM Prestiti p INNER JOIN Lettori l ON (p.IDLettore=l.IDLettore) 
GROUP BY l.Tessera, l.Nome,l.Indirizzo;


#Visualizzare gli autori presenti all'interno della bancadati
SELECT CONCAT (Cognome,' ',Nome) AS AUTORI FROM AUTORI;

SELECT Cognome, Nome FROM Autori ;

SELECT Titolo, COUNT(TITOLO) FROM LIBRI GROUP BY TITOLO; 
#SELECT Autore, COUNT(Autore) FROM LIBRI GROUP BY AUTORE;

SELECT a.IDAutore, a.Cognome, a.Nome, l.IDAutore, l.Titolo FROM autori a, libri l WHERE a.IDAutore = l.IDAutore;
SELECT a.Cognome, a.Nome,l.Titolo FROM autori a, libri l WHERE a.IDAutore = l.IDAutore;

# Estrarre elenco di lettori con il numero di libri che hanno noleggiato  alter              
SELECT l.Tessera, l.Nome,l.Indirizzo, COUNT(p.IDLibro) AS LIBRI
FROM lettori l, Prestiti p
WHERE l.IDLettore = p.IDLettore GROUP BY l.Tessera, l.Nome,l.Indirizzo;

INSERT INTO LETTORI (Tessera,Nome,Indirizzo) VALUES
					('14','Marco','Via Garibaldi');
                
#Per vedere quali lettori hanno preso libro in prestito e chi no
SELECT l.Tessera, l.Nome,l.Indirizzo, COUNT(p.IDLibro) AS LIBRI
FROM lettori l LEFT JOIN Prestiti p ON (l.IDLettore = p.IDLettore)
GROUP BY l.Tessera, l.Nome,l.Indirizzo;

# Vedere solo quelli che hanno preso libri in prestito
 SELECT l.Tessera, l.Nome,l.Indirizzo, COUNT(p.IDLibro) AS LIBRI
 FROM Prestiti p INNER JOIN Lettori l ON (p.IDLettore=l.IDLettore) 
 GROUP BY l.Tessera, l.Nome,l.Indirizzo;