CREATE SCHEMA `mydb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

use  mydb;

CREATE TABLE user (
	`id_pk`  INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 
    `name`   VARCHAR(10) NOT NULL, 
    `user_id` VARCHAR(10) NOT NULL UNIQUE,
    `password` VARCHAR(10) NOT NULL,
    `age` TINYINT UNSIGNED,
    `membership` TINYINT DEFAULT 0 ,
    `register_date` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `update_date` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP -- 많이 사용함 
    );