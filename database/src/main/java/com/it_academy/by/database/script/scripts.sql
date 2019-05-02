CREATE DATABASE IF NOT EXISTS shop;
use shop;

DROP TABLE IF EXISTS `CARS`;

CREATE TABLE CARS
(
    ID INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    SUPPLIER VARCHAR(20),
    MODEL VARCHAR(15),
    PRICE DEC NOT NULL DEFAULT 0.0
);

INSERT INTO CARS (SUPPLIER, MODEL, PRICE) VALUES
    ('Merc','GBH 2-24 D',259),
    ('Posrch','GBH 2-26 DFR',367),
    ('Lada','GBH 2-24 DRE', 480);


