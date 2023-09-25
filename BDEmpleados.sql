
create database BDempleados;

use BDempleados;

CREATE TABLE empleados (
    idEmpleado INT AUTO_INCREMENT PRIMARY KEY,
    apellidos VARCHAR(255) NOT NULL,
    nombres VARCHAR(255) NOT NULL,
    edad INT CHECK (Edad >= 18),
    sexo CHAR(1) CHECK (Sexo IN ('M', 'F')),
    salario DECIMAL(8, 2) CHECK (Salario BETWEEN 1500 AND 2500)
);
INSERT INTO empleados (apellidos, nombres, edad, sexo, salario)
VALUES
    ('Saldaña', 'Luis', 19, 'M', 2000.00);
select * from Empleados;
