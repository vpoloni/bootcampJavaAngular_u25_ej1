DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;

CREATE TABLE fabricantes (
	id int auto_increment PRIMARY KEY,
	nombre nvarchar(100)
);

CREATE TABLE articulos (
	id int auto_increment PRIMARY KEY,
	nombre nvarchar(100),
	precio int,
	fabricante_id int,
	CONSTRAINT fabricante_fk FOREIGN KEY (fabricante_id) REFERENCES fabricantes (id)
);

INSERT INTO fabricantes (nombre) VALUES(('jordi'));
INSERT INTO fabricantes (nombre) VALUES(('ana'));
INSERT INTO fabricantes (nombre) VALUES(('eva'));

INSERT INTO articulos (nombre,precio,fabricante_id) VALUES ('juan',20, 1);
INSERT INTO articulos (nombre,precio,fabricante_id) VALUES ('anton',10, 2);
INSERT INTO articulos (nombre,precio,fabricante_id) VALUES ('manel',30, 3);