-- DROP TABLE IF EXISTS user;
--
-- CREATE TABLE user(id  varchar(255) PRIMARY KEY, name VARCHAR(255),email VARCHAR(255));

insert into user values (1,'Abhishek', 'gupta@gmail.com')
insert into user values (2,'Amar', 'gurav@gmail.com')
insert into user values (3,'Manish', 'jha@gmail.com')

-- select * from user;
--
-- DROP TABLE IF EXISTS category;
--
-- CREATE TABLE category(id  varchar(255) PRIMARY KEY, name VARCHAR(255));

insert into category values (1,'Travel')
insert into category values (2,'Auto Loan')
insert into category  values (3,'Travel')
insert into category  values (4,'Travel2')

-- select * from category;
--
-- DROP TABLE IF EXISTS expense;
--
-- CREATE TABLE expense(id  varchar(255) PRIMARY KEY, expenseDate DATE ,description VARCHAR(255),location VARCHAR(255));
--
--  ALTER TABLE expense ADD FOREIGN KEY (id) REFERENCES category(id);
--
--  ALTER TABLE expense ADD FOREIGN KEY (id) REFERENCES user(id);

insert into expense values (100,'Mumbai Trip','2019-06-16','New York',1,1)

insert into expense values (101,'Pune Trip','2019-06-15','Los Angeles',2,2)

insert into expense values(102,'Jaipur Trip','2019-06-15','Arizona',3,1)

-- select * from expense;


