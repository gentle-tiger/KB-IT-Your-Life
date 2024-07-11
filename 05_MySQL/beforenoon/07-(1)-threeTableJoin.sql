USER sqldb; 

CREATE TABLE stdtbl (
stdName VARCHAR(10) NOT NULL PRIMARY KEY,
addr CHAR(4) NOT NULL 
);

CREATE TABLE clubtbl (
clubName VARCHAR(10) NOT NULL PRIMARY KEY, 
roomNo CHAR(4) NOT NULL
);

CREATE TABLE stdclubtbl (
num int AUTO_INCREMENT NOT NULL PRIMARY KEY, 
stbName VARCHAR(10) NOT NULL, 
clubName VARCHAR(10) NOT NULL,
FOREIGN KEY(stbName) REFERENCES stdtbl(stbName),
FOREIGN KEY(clubName) REFERENCES clubName(clubName)
);