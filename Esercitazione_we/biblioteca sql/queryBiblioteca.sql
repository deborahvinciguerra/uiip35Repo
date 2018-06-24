#Prova per visualizzare l'elenco dei libri disponibili (titoli, autori e numero di copie)
select l.titolo, a.nome, a.cognome, l.numCopie from Libro as l
	inner join Scrittura as s on s.idLib = l.idLibro
    inner join Autore as a on a.idAutore = s.idA
    where numCopie > 0;

#Prova per Effettuare la ricerca di libri per titolo
select l.*, a.nome, a.cognome from Libro as l 
	inner join Scrittura as s on s.idLib = l.idLibro
    inner join Autore as a on a.idAutore = s.idA
    where l.titolo like '%harry%';
   
#Prova per Effettuare la ricerca di libri per autore
select l.*, a.nome, a.cognome from Libro as l 
	inner join Scrittura as s on s.idLib = l.idLibro
    inner join Autore as a on a.idAutore = s.idA
    where a.cognome like '%rowling%';