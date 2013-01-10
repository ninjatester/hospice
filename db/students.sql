CREATE TABLE students ( 
idNumber bigint  PRIMARY KEY auto_increment, 
name varchar(256) NOT NULL,
EGN int(10) NOT NULL,
course int(10) NOT NULL,
specialty varchar(128) NOT NULL,
address varchar(256) NOT NULL,
isOrphan int(2) NOT NULL,
isMarried int(2) NOT NULL,
isLonelyParent int(2) NOT NULL,
hasRelatives int(2) NOT NULL,
achievement DECIMAL(10,2) NOT NULL,
status int(2) NOT NULL
 );