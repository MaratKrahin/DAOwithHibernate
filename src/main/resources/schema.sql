CREATE TABLE PERSON (
                         name VARCHAR(255),
                         surname VARCHAR(255),
                         age int check ( age >= 0 ),
                         phone_number VARCHAR(50),
                         city_of_living VARCHAR(50),
                         PRIMARY KEY (name, surname, age));


insert into PERSON (name, surname, age, phone_number, city_of_living)
VALUES ( 'vasya', 'vasyev', 27, '111111','MOSCOW' ),
       ( 'kolya', 'kolyaev', 26, '22222','PITER' ),
       ( 'masha', 'masheva', 33, '333333','MOSCOW' ),
       ( 'max', 'maxov', 12, '44444444','TULA' )