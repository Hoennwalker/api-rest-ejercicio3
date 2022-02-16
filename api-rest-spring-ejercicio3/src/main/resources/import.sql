INSERT INTO departamentos(nombre,ubicacion) VALUES ("frontend", "piso1");
INSERT INTO departamentos(nombre,ubicacion) VALUES ("backend", "piso1");
INSERT INTO departamentos(nombre,ubicacion) VALUES ("marketing", "piso2");

INSERT INTO empleados(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234T","Jose",1200,666777,1);
INSERT INTO empleados(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234S","Jose",1300,766777,2);
INSERT INTO empleados(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234Y","Jose",1200,866777,2);
INSERT INTO empleados(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234L","Jose",1400,966777,2);
INSERT INTO empleados(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234P","Jose",1300,666779,3);

INSERT INTO jefes(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234A","Jose",1200,666771,1);
INSERT INTO jefes(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234I","Jose",1200,666772,2);
INSERT INTO jefes(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234U","Jose",1200,666773,1);
INSERT INTO jefes(dni,nombre,salario,telefono,departamento_id) VALUES ("11122234E","Jose",1200,666774,3);

INSERT INTO usuario(usuario_id,nombre,contraseña) VALUES (1,"Jose","hola");
INSERT INTO usuario(usuario_id,nombre,contraseña) VALUES (2,"Jose","adios");

INSERT INTO usuarios (username,password,enabled) VALUES ('rolando','$2a$10$VTMecMi.QwIynlpyuBHAAenhz9Wg2fEk4VbaOlXn.2xKkCJTMf75u',1);
INSERT INTO usuarios (username,password,enabled) VALUES ('admin','$2a$10$nSgo1TPH4IQRro7HkVqrBO.cNC1cXrW5Xyhs5u/NwkjeEUh9Bo65G',1);

INSERT INTO roles (nombre) VALUES('ROLE_USER');
INSERT INTO roles (nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(2,2);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(2,1);
