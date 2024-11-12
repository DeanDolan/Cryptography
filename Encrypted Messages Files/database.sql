CREATE DATABASE cryptography;

USE cryptography;

CREATE TABLE user_information (
    Username VARCHAR(255) NOT NULL,
    PRIMARY KEY (Username)
);

CREATE TABLE messages (
    Username VARCHAR(255) NOT NULL,
    EncryptedMessage TEXT NOT NULL,
    FOREIGN KEY (Username) REFERENCES user_information(Username)
);


-- the first one is just a part of the sql code we already have