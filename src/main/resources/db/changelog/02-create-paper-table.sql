CREATE TABLE paper (
  id BIGSERIAL PRIMARY KEY,
  person_id BIGINT REFERENCES person(id),
  title VARCHAR(255),
  type VARCHAR(255),
  additional_authors VARCHAR(255),
  isbn VARCHAR(255),
  topic VARCHAR(255)
);
