-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
START TRANSACTION

INSERT INTO actor VALUES(201, 'HAMPTON', 'AVENUE')

INSERT INTO actor VALUES(202, 'LISA', 'BYWAY')

SELECT * FROM actor

COMMIT;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
START TRANSACTION

INSERT INTO film (film_id, title, description, release_year, language_id, length)
VALUES(1001, 'Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198)

SELECT * FROM film
WHERE film_id = 1001

COMMIT;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
START TRANSACTION

INSERT INTO film_actor VALUES (201, 1001)

INSERT INTO film_actor VALUES (202, 1001)

SELECT * FROM film_actor
WHERE film_id = 1001

COMMIT;
-- 4. Add Mathmagical to the category table.
START TRANSACTION

INSERT INTO category VALUES (17, 'Mathmagical')

SELECT * FROM category

COMMIT;
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
START TRANSACTION

INSERT INTO film_category VALUES (1001, 17)

UPDATE film_category
SET category_id = 17
WHERE film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996

SELECT * FROM film_category
WHERE film_category.category_id = 17

COMMIT;
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
START TRANSACTION

UPDATE film
SET rating = 'G'
WHERE film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996 OR film_id = 1001

SELECT * FROM film
WHERE film.rating = 'G'

COMMIT;
-- 7. Add a copy of "Euclidean PI" to all the stores.
START TRANSACTION

INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1)

INSERT INTO inventory (film_id, store_id)
VALUES (1001, 2)

SELECT * FROM inventory
WHERE inventory.film_id = 1001 OR inventory.film_id = 1002

COMMIT;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
START TRANSACTION

DELETE FROM film WHERE film_id = 1001

DELETE FROM film WHERE film_id = 1002

ROLLBACK;
-- ANSWER: Deleting the film from the "film" database failed because it violated 
-- a foreign key constraint (which was put in place to maintain Referential Integrity).
-- Otherwise deleting the film would have created an orphaned a record in the "film_actor"
-- database.

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
START TRANSACTION

DELETE FROM category WHERE category_id = 17

ROLLBACK;
-- ANSWER: Deleting "category_id" also failed due to the same reason. It was referenced
-- from the database "film_category" so it's deletion was prevented to avoid creating
-- orphans.

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)

START TRANSACTION

DELETE FROM film_category WHERE category_id = 17

SELECT * FROM film_category
WHERE film_category.film_id = 1001

COMMIT;
-- ANSWER: This deletion succeeded! This is because no databases relied on this connection
-- for a forign key!

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
START TRANSACTION

DELETE FROM category WHERE category_id = 17

SELECT * FROM category
WHERE category.category_id = 17

COMMIT;
-- ANSWER: Deleting the category "Mathmagical" from category work because there
-- were no longer any databases connected to it.
START TRANSACTION

DELETE FROM film WHERE film_id = 1001

ROLLBACK;
-- ANSWER: Deleting the category "Euclidean PI" from "film" failed because
-- there is still a relationship between "film.film_id" and film_actor.film_id.

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
START TRANSACTION

DELETE FROM film_actor WHERE film_id = 1001

DELETE FROM inventory WHERE film_id = 1001

DELETE FROM film WHERE film_id = 1001

ROLLBACK;
-- ANSWER: This series of deletions would be required to remove "Euclidean PI" from the
-- film list. I did not commit the deletions, but basically you would have to sever ties
-- with the "actor" database and the "inventory" database before deleting the movie because
-- otherwise those corresponding records would have been orphaned!