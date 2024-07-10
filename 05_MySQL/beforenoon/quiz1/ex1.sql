-- 1page
SHOW DATABASES;

USE employees;

SHOW TABLES;

DESCRIBE employees;
DESC employees; -- good
SHOW COLUMNS FROM employees;

-- 2page
SELECT * FROM employees.titles;
SELECT * FROM titles; 

SELECT first_name FROM employees;

SELECT first_name, last_name, gender FROM employees;


-- 3page
USE employees;
SELECT first_name AS 이름, gender AS 성별 , hire_date AS '회사 입사일' FROM employees;


-- 4page
USE sqldb;
SELECT * 
FROM usertbl 
WHERE name = '김경호';

SELECT * FROM usertbl WHERE birthyear >= 1970 AND height >= 182;  


-- 5page
SELECT * FROM usertbl WHERE height >= 180 AND height <= 183;

SELECT * FROM usertbl WHERE addr = '경남' OR addr = '전북';

SELECT * FROM usertbl WHERE name LIKE '김%';


-- 6page (서브쿼리)
SELECT name, height FROM usertbl 
WHERE height > (SELECT height FROM usertbl WHERE name = '김경호');


-- 7page 
SELECT * FROM usertbl ORDER BY mDate ASC; -- default ASC

SELECT * FROM usertbl ORDER BY mDate DESC;

SELECT * FROM usertbl ORDER BY height DESC, name DESC;


-- 8page
SELECT DISTINCT addr FROM usertbl ORDER BY addr ASC; -- usertbl의 주소지를 중복없이 오름 차순으로 출력



