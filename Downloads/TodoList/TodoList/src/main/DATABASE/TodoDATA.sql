CREATE DATABASE todolist;


CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    description TEXT NOT NULL,
    completed BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO tasks (description, completed) VALUES
('Acheter du lait', FALSE),
('Faire les devoirs', TRUE),
('Appeler la banque', FALSE);