select libro.titolo, autore.nome,autore.cognome,libro.numcopia from libro
inner join redattoDa on libro.idBook=redattoDa.idBook
inner join autore on autore.idAuthor=redattoDa.idAuthor
where disponibilità ='si';


select * from libro 
where titolo ='Fisica';


select libro.titolo,libro.disponibilità  from libro
inner join redattoDa on libro.idBook=redattoDa.idBook
inner join autore on autore.idAuthor=redattoDa.idAuthor
where (autore.nome like '%Hallyday%' and autore.cognome like'%Resnick%');