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

INSERT INTO usuarios(usuario_id,nombre,contraseña) VALUES (1,"Jose","hola");
INSERT INTO usuarios(usuario_id,nombre,contraseña) VALUES (2,"Jose","adios");