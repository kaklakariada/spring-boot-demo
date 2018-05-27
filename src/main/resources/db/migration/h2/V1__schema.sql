CREATE SEQUENCE projects_seq;

CREATE TABLE projects (
  id INT DEFAULT projects_seq.nextval PRIMARY KEY,
  name VARCHAR
);
