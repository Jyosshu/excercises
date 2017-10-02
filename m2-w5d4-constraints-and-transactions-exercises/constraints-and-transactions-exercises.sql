-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor 
BEGIN TRANSACTION;

INSERT INTO actor (first_name, last_name) VALUES ('HAMPTON', 'AVENUE')
INSERT INTO actor (first_name, last_name) VALUES ('LISA', 'BYWAY')

COMMIT;

ROLLBACK;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

SELECT * FROM film WHERE title = 'Euclidean PI'

BEGIN TRANSACTION;

INSERT INTO film (title, description, release_year, language_id, length) VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece', 2008, 1, 198);

COMMIT;

ROLLBACK;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

SELECT * FROM film_actor fa
JOIN film f ON f.film_id = fa.film_id
WHERE f.title = 'Euclidean PI'

BEGIN TRANSACTION;

INSERT INTO film_actor (actor_id, film_id) 
VALUES ((SELECT actor_id FROM actor WHERE first_name ='HAMPTON' AND last_name = 'AVENUE'), (SELECT film_id FROM film WHERE title ='Euclidean PI'));
INSERT INTO film_actor (actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name ='LISA' AND last_name = 'BYWAY'), (SELECT film_id FROM film WHERE title ='Euclidean PI'));

ROLLBACK;
COMMIT;

-- 4. Add Mathmagical to the category table.
SELECT * FROM category;

BEGIN TRANSACTION;

INSERT INTO category (name) VALUES ('Mathmagical');

ROLLBACK;
COMMIT;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

SELECT f.title, c.name, COUNT(fc.category_id)
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE title ='Euclidean PI' OR title = 'EGG IGBY' OR title = 'KARATE MOON' OR title ='RANDOM GO' OR title = 'YOUNG LANGUAGE'
GROUP BY f.title, c.name

SELECT c.name, COUNT(fc.category_id)
FROM category c
JOIN film_category fc ON fc.category_id = c.category_id
GROUP BY c.name


BEGIN TRANSACTION;

INSERT INTO film_category (film_id, category_id) VALUES 
((SELECT film_id FROM film WHERE title = 'Euclidean PI'), (SELECT category_id FROM category WHERE name = 'Mathmagical'))

UPDATE film_category fc SET category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical')
FROM film f
WHERE fc.film_id = (SELECT film_id FROM film WHERE title LIKE 'EGG IGBY') OR fc.film_id = (SELECT film_id FROM film WHERE title = 'KARATE MOON') 
OR fc.film_id = (SELECT film_id FROM film WHERE title ='RANDOM GO') OR fc.film_id = (SELECT film_id FROM film WHERE title = 'YOUNG LANGUAGE')

ROLLBACK;
COMMIT;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

SELECT f.title, c.name, f.rating, f.film_id
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE c.name = 'Mathmagical'
GROUP BY f.title, c.name, f.rating, f.film_id

BEGIN TRANSACTION;

UPDATE film SET rating = 'G' 
FROM category c
WHERE c.name = 'Mathmagical'

ROLLBACK;

COMMIT;
-- 7. Add a copy of "Euclidean PI" to all the stores.

BEGIN TRANSACTION;

INSERT INTO inventory (film_id, store_id) VALUES (1002, 1);
INSERT INTO inventory (film_id, store_id) VALUES (1002, 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;

DELETE FROM film WHERE title ='Euclidean PI'

--The delete  could not be completed due to foreign key constraints.


-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category WHERE name = 'Mathmagical';
-- Unable to delete due to foreign key constraints

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;

DELETE FROM film_category WHERE category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical')
-- Deleting the foreign keys that the category Mathmagical was connected to allowed it to be deleted.

ROLLBACK;
COMMIT;
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

-- I was able to delete Mathmagical, because it no longer had foreign keys linked to it.  Euclidean PI still has foreign keys in the film_actor table that keep it
-- from being able to be removed.

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

--To remove Euclidean PI, you would need to remove the foreign keys in film_actor and inventory before you could remove it from the film table.