CREATE TABLE person(
  id SERIAL PRIMARY KEY,
  firstname varchar(80) NOT NULL,
  lastname varchar(80) NOT NULL,
  address varchar(100) NOT NULL,
  gender varchar(6) NOT NULL
);
