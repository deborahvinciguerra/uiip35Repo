# query per vedere i libri disponibili
select libro.titolo, autore.nomeAutore, autore.cognomeAutore, libro.numCopie as autore from libroautore as la
	inner join autore on la.autore = autore.idAutore
    inner join libro on la.libro = libro.idLibro
    group by libro.titolo, autore.cognomeAutore;

# query per la ricerca per titolo
select libro.titolo, autore.nomeAutore, autore.cognomeAutore from libroautore as la
	inner join autore on la.autore = autore.idAutore
    inner join libro on la.libro = libro.idLibro
    where libro.titolo like '%Hunger%';
    
# query per la ricerca per autore
select libro.titolo, autore.nomeAutore, autore.cognomeAutore from libroautore as la
	inner join autore on la.autore = autore.idAutore
    inner join libro on la.libro = libro.idLibro
    where autore.cognomeAutore like '%conan doyle%' or autore.nomeAutore like '%conan doyle%';
    
# query per aggiornare il numero di copie disponibili di un libro
update libro
	set numCopie = numCopie - 1
    where idLibro = 1;
    
# query per visualizzare i prestiti effettuati
select p.idPrenotazione, t.nome, t.cognome, l.titolo from Prenotazione as p
	inner join tessera as t on p.tessera = t.idTessera
    inner join libro as l on p.libro = l.idLibro
    