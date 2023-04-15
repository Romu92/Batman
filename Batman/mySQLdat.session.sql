-- CREATE TABLE prodotti(
--     id BIGINT auto_increment primary key,
--     -- auto_increment serve per dire al database di auto incrementare il numero dell'id ogni volta che aggiungo un nuovo oggetto
--     nome varchar(100),
--     -- non utilizzare mai char ma varchar mettendo tra parentesi il numero massimo di caratteri che l'oggetto può avere
--     descrizione varchar(1024),
--     -- di solito si usano le potenze di  2 per i 
--     -- numeri dentro la parentesi di un varchar
--     prezzo int check(prezzo >0)
--     -- con check inserisco una condizione che l'oggetto deve avere in questo caso sul prezzo che deve essere maggiore di 0
-- );
DROP TABLE prodotti;