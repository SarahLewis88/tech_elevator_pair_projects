SELECT NAME AS COUNTRY_NAME, continent AS ABC, gnp AS GROSS_PRODUCT 
FROM COUNTRY;

SELECT * FROM COUNTRY;

SELECT lifeexpectancy from country;


SELECT DISTINCT NAME FROM CITY ORDER BY NAME;

SELECT name, continent, indepyear 
FROM country
WHERE indepyear > 1980
AND continent = 'Asia'
AND name like '%zak%'

SELECT name, continent, indepyear 
FROM country
WHERE continent like '%si%'


SELECT name, continent, indepyear 
FROM country
WHERE indepyear > 1980 
AND (continent = 'Asia'
OR continent = 'North America')
