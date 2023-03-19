CREATE TABLE books(
  id SERIAL PRIMARY KEY,
  author varchar(180) NOT NULL,
  title varchar(180) NOT NULL,
  price decimal(65,2) NOT NULL,
  launch_date DATE NOT NULL
);
