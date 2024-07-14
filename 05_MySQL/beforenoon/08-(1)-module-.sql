CREATE DATABASE testtt;

USE testtt;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50),
    name VARCHAR(100),
    email VARCHAR(100),
    age INT,
    signup_date DATE
);

INSERT INTO users (username, password, name, email, age, signup_date) VALUES
('user1', 'pass1', 'Alice', 'alice@example.com', 25, '2022-01-01'),
('user2', 'pass2', 'Bob', 'bob@example.com', 30, '2022-01-15'),
('user3', 'pass3', 'Charlie', 'charlie@example.com', 35, '2022-02-01'),
('user4', 'pass4', 'Diana', 'diana@example.com', 28, '2022-02-15');


SELECT * FROM users;
-- select , from 데이터 선택  
SELECT username, email FROM users;	

-- WHERE 조건을 통해 데이터 필터링 
SELECT *FROM users WHERE age > 25;

-- ORDER BY 정렬 
SELECT * FROM users ORDER BY age DESC;
SELECT id , name, email, age FROM users ORDER BY age DESC; 
SELECT id, name, email, age FROM users WHERE age > 25;
SELECT * FROM users;
-- signup_date 기준으로 정렬
SELECT username , id, password, email , signup_date FROM users ORDER BY signup_date ASC;

-- GROUP BY 데이터 그룹화 
SELECT age, COUNT(*) as count FROM users GROUP By age;


-- 스칼라 서브쿼리 연습 
SELECT username, (
	SELECT COUNT(*) 
    FROM users 
    WHERE age > 30) as users_over_30 FROM users;

-- JOIN ( INNER JOIN ,OUTER JOIN) 

CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    product_name VARCHAR(100),
    order_date DATE,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

select * from orders;

INSERT INTO orders (user_id, product_name, order_date) VALUES
(1, 'Laptop', '2022-03-01'),
(2, 'Smartphone', '2022-03-05'),
(1, 'Tablet', '2022-03-10'), 
(3, 'Monitor', '2022-03-15');	


-- INNER JOIN : 두 테이블 간의 공통된 데이터 선택 
SELECT users.username , orders.product_name
FROM users
INNER JOIN orderes ON users.id = orders.user_id;

-- LEFT JOIN : 왼쪽 테이블의 모든 데이터와 오른쪽 테이블의 일치하는 데이터 선택 
SELECT users.username, orders.product_name
FROM users
LEFT JOIN orders ON users.id = orders.user_id;




























