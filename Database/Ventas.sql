drop database if exists ventas;
create database if not exists ventas;
use ventas;

create table cliente
(
    id_cliente int auto_increment
        primary key,
    name       varchar(50) not null,
    state      varchar(30) null
);

create table madera
(
    codigo        int auto_increment
        primary key,
    nombre_madera char(10)    not null,
    precio        bigint(100) null,
    Stock         bigint(100) null
);

create table orden
(
    id_orden      int auto_increment
        primary key,
    fk_id_cliente int(100) not null,
    fecha         date     not null,
    constraint fk_id_cliente
        foreign key (fk_id_cliente) references cliente (id_cliente)
);

create table detalles
(
    id_orden    int auto_increment
        primary key,
    fk_id_orden int(100) not null,
    fk_codigo   int(100) not null,
    total       int      not null,
    constraint fk_codigo
        foreign key (fk_codigo) references madera (codigo),
    constraint fk_id_orden
        foreign key (fk_id_orden) references orden (id_orden)
);

create table permissions
(
    ID       int auto_increment
        primary key,
    User     varchar(20)  not null,
    Password varchar(100) not null,
    constraint permissions_User_uindex
        unique (User)
);

-- INSERTS

INSERT INTO ventas.cliente (id_cliente, name, state) VALUES (15, 'Angelo', 'Campeche');
INSERT INTO ventas.cliente (id_cliente, name, state) VALUES (16, 'Miguel', 'Merida');
INSERT INTO ventas.cliente (id_cliente, name, state) VALUES (17, 'Luis', 'Oaxaca');
INSERT INTO ventas.cliente (id_cliente, name, state) VALUES (18, 'jose', 'los angeles');
INSERT INTO ventas.cliente (id_cliente, name, state) VALUES (19, 'PEDRO', 'los angeles');
INSERT INTO ventas.detalles (id_orden, fk_id_orden, fk_codigo, total) VALUES (1, 1, 10, 36);
INSERT INTO ventas.detalles (id_orden, fk_id_orden, fk_codigo, total) VALUES (2, 1, 11, 24);
INSERT INTO ventas.detalles (id_orden, fk_id_orden, fk_codigo, total) VALUES (3, 1, 9, 200);
INSERT INTO ventas.detalles (id_orden, fk_id_orden, fk_codigo, total) VALUES (4, 2, 13, 130);
INSERT INTO ventas.detalles (id_orden, fk_id_orden, fk_codigo, total) VALUES (5, 3, 10, 120);
INSERT INTO ventas.detalles (id_orden, fk_id_orden, fk_codigo, total) VALUES (6, 3, 12, 120);
INSERT INTO ventas.detalles (id_orden, fk_id_orden, fk_codigo, total) VALUES (7, 4, 8, 600);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (8, 'Cedro', 20, 11);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (9, 'Caoba', 20, 11);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (10, 'Pino', 12, 8);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (11, 'Abedul', 12, 8);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (12, 'Naranjo', 12, 8);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (13, 'Maple', 12, 8);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (17, 'Roble', 60, 100);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (18, 'Chaca', 10, 30);
INSERT INTO ventas.madera (codigo, nombre_madera, precio, Stock) VALUES (19, 'ZAPOTE', 20, 20);
INSERT INTO ventas.orden (id_orden, fk_id_cliente, fecha) VALUES (1, 15, '2019-06-22');
INSERT INTO ventas.orden (id_orden, fk_id_cliente, fecha) VALUES (2, 16, '2016-01-03');
INSERT INTO ventas.orden (id_orden, fk_id_cliente, fecha) VALUES (3, 17, '2018-05-21');
INSERT INTO ventas.orden (id_orden, fk_id_cliente, fecha) VALUES (4, 15, '2051-01-23');
INSERT INTO ventas.orden (id_orden, fk_id_cliente, fecha) VALUES (5, 16, '2051-01-23');
INSERT INTO ventas.permissions (ID, User, Password) VALUES (1, 'admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918');
INSERT INTO ventas.permissions (ID, User, Password) VALUES (2, 'root', '4813494d137e1631bba301d5acab6e7bb7aa74ce1185d456565ef51d737677b2');
INSERT INTO ventas.permissions (ID, User, Password) VALUES (3, 'profesor', '2babd7dc0a27f4bbd13b33b61469de32e4c4e42a22f8c4db55973e5def912486');
INSERT INTO ventas.permissions (ID, User, Password) VALUES (4, 'dev2019', '5e9986dbc8771eaa68c191cbcb5fc064d58a77757bd0a41ce6458166af8efc51');