USE mydatabase;
CREATE TABLE Country(
    Country_id int NOT NULL AUTO_INCREMENT,
    Country_name varchar(255),
    PRIMARY KEY (Country_id)
);
CREATE TABLE City(
    Id int NOT NULL AUTO_INCREMENT,
    City_name varchar(40),
    Population int,
    Country_id int,
    PRIMARY KEY(Id),
    FOREIGN KEY(Country_id) References Country(Country_id)
);
INSERT INTO Country (Country_name) values
    ('Ukraine'),('Czech Republic'),('Germany')
INSERT INTO City (City_name,Population,Country_id) values
    ('Mykolaiv',480000,1),('Odesa',990000,1),('Kharkiv',1420000,1),
    ('Hradec Kralove',92000,2),('Liberec',105000,2),('Prague',1300000,2),
    ('Hamburg',1900000,3),('Munich',1470000,3),('Cologne',1070000,3)

SELECT * FROM Country;
SELECT * FROM City;

SELECT City.City_name,City.Population,Country.Country_name
FROM City
LEFT JOIN Country
ON City.Country_id=Country.Country_id;