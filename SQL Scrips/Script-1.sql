CREATE TABLE employee (
	id SERIAL PRIMARY KEY, 
	first_name VARCHAR (50) NOT NULL, 
	last_name VARCHAR (50) NOT NULL,
	login VARCHAR (50) NOT NULL UNIQUE,
	password INTEGER NOT NULL,
	approved BOOLEAN
);



CREATE TABLE administrator (
	id SERIAL PRIMARY KEY, 
	first_name VARCHAR (50) NOT NULL, 
	last_name VARCHAR (50) NOT NULL,
	login VARCHAR (50) NOT NULL UNIQUE,
	password INTEGER NOT NULL,
	approved BOOLEAN
);

CREATE TABLE client (
	id SERIAL PRIMARY KEY, 
	first_name VARCHAR (50) NOT NULL, 
	last_name VARCHAR (50) NOT NULL,
	login VARCHAR (50) NOT NULL UNIQUE,
	password INTEGER NOT NULL
);

INSERT INTO administrator (first_name, last_name, login, password, approved)
	VALUES ('Tim', 'Gattie', 'tgat', '1216985755', true);
	
CREATE TABLE account (
	id SERIAL PRIMARY KEY,
	acc_name VARCHAR (50), 
	acc_type INTEGER NOT NULL REFERENCES account_type (id),
	acc_owner INTEGER NOT NULL REFERENCES client (id),
	balance NUMERIC (50, 2) DEFAULT 0,
	approved BOOLEAN DEFAULT FALSE
);

CREATE TABLE account_type (
	id SERIAL PRIMARY KEY,
	name VARCHAR (50) NOT NULL,
	interest NUMERIC (6, 3)
);


SELECT * FROM administrator;
SELECT * FROM employee;
SELECT * FROM client;
SELECT * FROM account;
SELECT * FROM account_type;

DROP TABLE accounts;

DELETE FROM employee e WHERE id = 26;

INSERT INTO account_type (name, interest)
	VALUES ('Basic Checking', 0);

INSERT INTO account_type (name, interest)
	VALUES ('Basic Savings', 0.002);

UPDATE employee SET approved = TRUE WHERE id = 2;

INSERT INTO account (id, acc_name, acc_type, acc_owner,	balance, approved)
	VALUES (1, 'Test Account', '1', '1', 1500.00, true);

INSERT INTO employee (first_name, last_name, login, password, approved)
	VALUES ('tom', 'jerry', 'temp', 12345, true);