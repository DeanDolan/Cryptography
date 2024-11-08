CREATE DATABASE cryptography;

USE cryptography;

CREATE TABLE user_information (
    Username VARCHAR(255) NOT NULL,
    Hashed_Password VARCHAR(255) NOT NULL,
    Security_Question VARCHAR(255) NOT NULL,
    Answer VARCHAR(255) NOT NULL,
    PRIMARY KEY (Username)
);


