DROP TABLE IF EXISTS usuario;

create table usuario (id integer AUTO_INCREMENT not null, nombre varchar(255),email varchar(255),password varchar(255), primary key (id));

DROP TABLE IF EXISTS carrito;

create table carrito (id integer AUTO_INCREMENT not null,usuario_id integer not null, nentradasvip integer,nentradasnormal integer, granpremio integer, primary key (id));

DROP TABLE IF EXISTS grandespremios;

create table grandespremios (id integer AUTO_INCREMENT not null, nombre varChar(255), ganador integer, primary key (id));

DROP TABLE IF EXISTS pilotos;

create table pilotos (id integer not null, nombre varChar(255), pais varChar(255), primary key (id));

DROP TABLE IF EXISTS contacto;

create table contacto (id integer AUTO_INCREMENT not null, email varChar(255), texto varChar(500), primary key (id));