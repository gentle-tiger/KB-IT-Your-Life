use jdbc_ex;

DROP TABLE IF EXISTS USERS; -- USERS 테이블이 존재할 경우 삭제

CREATE TABLE USERS (
                       ID VARCHAR(12) NOT NULL PRIMARY KEY,
                       PASSWORD VARCHAR(12) NOT NULL,
                       NAME VARCHAR(30) NOT NULL,
                       ROLE VARCHAR(6) NOT NULL
);

INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES('guest', 'guest123', '방문자', 'USER');
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES('admin', 'admin123', '관리자', 'ADMIN');
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES('member', 'member123', '일반회원', 'USER');

SELECT * FROM USERS;