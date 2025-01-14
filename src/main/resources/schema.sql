-- Drop existing tables if they exist
DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS authors;

-- Create the sequence for author ids
-- CREATE SEQUENCE authors_id_seq;

-- Create the authors table
CREATE TABLE authors (
    id BIGINT DEFAULT nextval('authors_id_seq') PRIMARY KEY,
    name TEXT,
    age INTEGER
);

-- Create the books table
CREATE TABLE books (
    isbn TEXT PRIMARY KEY,
    title TEXT,
    author_id BIGINT,
    CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES authors(id)
);
