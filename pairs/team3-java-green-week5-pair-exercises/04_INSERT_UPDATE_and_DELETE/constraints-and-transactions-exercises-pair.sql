-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The 
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on 
-- Wikipedia.)
START TRANSACTION

INSERT INTO city (name, countrycode, district, population)
VALUES('Smallville', 'USA', 'Kansas', 45001)

SELECT * FROM city WHERE name = 'Smallville'

COMMIT;
-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
START TRANSACTION

INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES('USA', 'Kryptonese', false, 0.0001)

SELECT * FROM countrylanguage WHERE language = 'Kryptonese'

COMMIT;
-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change 
-- the appropriate record accordingly.
START TRANSACTION

UPDATE countrylanguage
SET language = 'Krypto-babble'
WHERE language = 'Kryptonese'

SELECT * FROM countrylanguage WHERE language = 'Krypto-babble'

COMMIT;
-- 4. Set the US captial to Smallville, Kansas in the country table.
START TRANSACTION

UPDATE country
SET capital = 4081
WHERE code = 'USA'

SELECT * FROM country WHERE capital = 4081

COMMIT;
-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
START TRANSACTION

DELETE FROM city WHERE name = 'Smallville'

ROLLBACK;
-- ANSWER: Deleting Smallville from the "city" database FAILED because it violated 
-- a foreign key constraint (which was put in place to maintain Referential Integrity).
-- Otherwise deleting the city would have created an orphaned record in the "country"
-- database because "USA" would no longer have a capital.

-- 6. Return the US captial to Washington.
START TRANSACTION

UPDATE country
SET capital = 3813
WHERE code = 'USA'

SELECT * FROM country WHERE capital = 3813

COMMIT;
-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
START TRANSACTION

DELETE FROM city WHERE name = 'Smallville'

SELECT * FROM country WHERE capital = 4081

COMMIT;
-- ANSWER: Deleting Smallville from the "city" database SUCCEEDED because it was no longer
-- linked to the "country" database and did not create orphans.

-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972 
-- (exclusive). 
-- (590 rows affected)
START TRANSACTION

UPDATE countrylanguage
SET isofficial = 'false'
FROM country
WHERE country.code = countrylanguage.countrycode AND isofficial = 'true' AND indepyear BETWEEN 1800 AND 1972 

UPDATE countrylanguage
SET isofficial = 'true'
FROM country
WHERE country.code = countrylanguage.countrycode AND isofficial = 'false' AND indepyear BETWEEN 1800 AND 1972 

SELECT countrycode, isofficial FROM countrylanguage

COMMIT;
-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)
START TRANSACTION

UPDATE city
SET population =  CEIL((CAST(population AS FLOAT)) / 1000)

SELECT * FROM city

COMMIT;
-- 10. Assuming a country's surfacearea is expressed in square miles, convert it to 
-- square meters for all countries where French is spoken by more than 20% of the 
-- population.
-- (7 rows affected)
START TRANSACTION

UPDATE country
SET surfacearea = surfacearea * 2589988.1103
FROM countrylanguage
WHERE countrylanguage.countrycode = country.code AND language = 'French' AND percentage > 20

COMMIT;