/**
*   gabrielJaya: 20.ene.2023
* Script de base de datos
*/

.version 
.database
.show
.tables

CREATE TABLE PERSONA
(
  ID  INTEGER PRIMARY KEY,
  NOMBRE VARCHAR(10),
  APELLIDO VARCHAR(10)
);

--SELECT * FROM T2
--DROP TABLE PERSONA;

INSERT INTO PERSONA (ID, NOMBRE, APELLIDO)
            VALUES (1,"Pepe lucho", "perez");
INSERT INTO PERSONA (ID, NOMBRE, APELLIDO)
            VALUES (2,"Ana", "Suarez");
INSERT INTO PERSONA (ID, NOMBRE, APELLIDO)
            VALUES (3,"Juan", "Sanchez");

SELECT * FROM PERSONA;
----------------------------------------------
CREATE TABLE PET
(
  ID  INTEGER PRIMARY KEY,
  NOMBRE VARCHAR(10),
  EDAD INTEGER
);

--DROP TABLE PET;

INSERT INTO PET (ID, NOMBRE, EDAD) VALUES (1,"VALUMA", 1);
INSERT INTO PET (ID, NOMBRE, EDAD) VALUES (2,"JUANA", 2);
INSERT INTO PET (ID, NOMBRE, EDAD)  VALUES (3,"COMOTU", 3);

SELECT * FROM PET;

------------------------------------------------------------------

CREATE TABLE MASCOTA
(
  idMascota INTEGER PRIMARY KEY AUTOINCREMENT,
  FOREIGN KEY (idMT) REFERENCES MascotaTipo(idMT),
  FOREIGN KEY (idSexo) REFERENCES SEXO(idSexo),
  idSexo INTEGER NOT NULL REFERENCES SEXO,
  NOMBRE VARCHAR(10) NOT NULL,
  EDAD INTEGER  default (0),
  ESTADO VARCHAR(1) default ('A')
);

INSERT INTO MASCOTA( idMT, idSexo, NOMBRE, EDAD, Estado) VALUES (3,2,"Mora",3,'A');
INSERT INTO MASCOTA( idMT, idSexo, NOMBRE, EDAD, Estado) VALUES (2,1,"Oso",3,'A');
INSERT INTO MASCOTA( idMT, idSexo, NOMBRE, EDAD, Estado) VALUES (1,3,"Lucho",4,'A');
INSERT INTO MASCOTA( idMT, idSexo, NOMBRE, EDAD, Estado) VALUES (6,3,"Pepito",4,'A');

--DROP TABLE MASCOTA;
SELECT * FROM MASCOTA;

UPDATE MASCOTA SET NOMBRE = 'osa' WHERE NOMBRE = 'Oso' AND idMT = 2;


--DELETE FROM  MASCOTA WHERE idPet = 2;
SELECT * FROM MASCOTA;

--------------------------------------------------------------------

CREATE TABLE SEXO (idSexo INTEGER PRIMARY KEY, NOMBRE VARCHAR(10) );

INSERT INTO SEXO(idSexo, NOMBRE) VALUES (1, "Masculino");
INSERT INTO SEXO(idSexo, NOMBRE) VALUES (2, "Hembra");
INSERT INTO SEXO(idSexo, NOMBRE) VALUES (3, "S/N");

--DROP TABLE SEXO; 
SELECT * FROM SEXO;

-----------------------------------------------------------------------

CREATE TABLE MascotaTipo( idMT INTEGER PRIMARY KEY AUTOINCREMENT , NOMBRE VARCHAR(10) NOT NULL, Estado VARCHAR(1) NOT NULL DEFAULT ('A'));

INSERT INTO MascotaTipo(NOMBRE) VALUES ("perros");
INSERT INTO MascotaTipo(NOMBRE) VALUES ("gatos");
INSERT INTO MascotaTipo(NOMBRE) VALUES ("tortuga");
INSERT INTO MascotaTipo(NOMBRE) VALUES ("peces");
INSERT INTO MascotaTipo(NOMBRE) VALUES ("cuyes");
--INSERT INTO MascotaTipo(idMT, NOMBRE) VALUES (10, "cuyes");
--INSERT INTO MascotaTipo(idMT, NOMBRE) VALUES (7,"cuyes");

--DROP TABLE MascotaTipo;
UPDATE MascotaTipo SET Estado = "X" WHERE idMT in (6,12);



SELECT * FROM MascotaTipo;
SELECT NOMBRE FROM MascotaTipo;
SELECT * FROM MascotaTipo WHERE Estado = 'A';
SELECT NOMBRE FROM MascotaTipo WHERE Estado = 'A';

