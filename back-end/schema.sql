CREATE TABLE IF NOT EXISTS user (
    id INT PRIMARY KEY AUTO_INCREMENT, 
    name varchar(30) NOT NULL, 
    email varchar(30) NOT NULL UNIQUE, 
    cep INT NOT NULL, 
    password varchar(30) NOT NULL
    );

CREATE TABLE IF NOT EXISTS house (
    id INT PRIMARY KEY AUTO_INCREMENT, 
    name Varchar(30) NOT NULL, 
    state varchar(4) NOT NULL, 
    price INT(30) NOT NULL, 
    location BOOLEAN NOT NULL DEFAULT false
    );

CREATE TABLE IF NOT EXISTS images (
    id INT PRIMARY KEY AUTO_INCREMENT, 
    url TEXT NOT NULL, 
    houseId INT NOT NULL, 
    FOREIGN KEY (houseId) REFERENCES house(id)
    );

CREATE TABLE IF NOT EXISTS userHouse (
    id INT PRIMARY KEY AUTO_INCREMENT, 
    houseId INT NOT NULL, 
    userId INT NOT NULL, 
    FOREIGN KEY (houseId) REFERENCES house(id), 
    FOREIGN KEY (userId) REFERENCES user(id)
    );