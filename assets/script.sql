CREATE DATABASE ParqueDaCidade;
USE ParqueDaCidade; 


CREATE TABLE Occurrences(
	id int auto_increment primary key,
	title varchar(80) not null,
	description varchar(200),
	localization varchar(200),
	occurenceDate date not null, 
	status boolean default true
);

SELECT * FROM Occurrences;