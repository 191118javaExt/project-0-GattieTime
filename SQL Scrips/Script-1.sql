CREATE TABLE employee (
	id SERIAL PRIMARY KEY, 
	first_name VARCHAR (50) NOT NULL, 
	last_name VARCHAR (50) NOT NULL,
	login VARCHAR (50) NOT NULL,
	password VARCHAR (50) NOT NULL,
	approved BOOLEAN
);

CREATE TABLE administrator (
	id SERIAL PRIMARY KEY, 
	first_name VARCHAR (50) NOT NULL, 
	last_name VARCHAR (50) NOT NULL,
	login VARCHAR (50) NOT NULL,
	password VARCHAR (50) NOT NULL,
	approved BOOLEAN
);

CREATE TABLE client (
	id SERIAL PRIMARY KEY, 
	first_name VARCHAR (50) NOT NULL, 
	last_name VARCHAR (50) NOT NULL,
	login VARCHAR (50) NOT NULL,
	password VARCHAR (50) NOT NULL
);

INSERT INTO administrator (first_name, last_name, login, password, approved)
	VALUES ('Tim', 'Gattie', 'tgat', 'password', true);
	
CREATE TABLE accounts (
	id SERIAL PRIMARY KEY,
	acc_name VARCHAR (50), 
	acc_type INTEGER NOT NULL FOREIGN KEY,
	acc_owner INTEGER NOT NULL FOREIGN KEY,
	balance NUMERIC (50, 2) DEFAULT 0,
	approved BOOLEAN DEFAULT FALSE
);

