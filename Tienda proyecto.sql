create database if not exists tienda;
use tienda;

create table usuarios (
    id int auto_increment primary key,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    telefono varchar(20) not null
);

insert into usuarios (nombre, apellido, telefono) values 
('Tebo', 'Gonzalez', '261-4589632'), -- Esto es una referencia a EL GENIO DEL TEBO
('Lucia', 'Fernandez', '261-5896321'), -- Sin comentarios :)
('Tomi', 'Perez', '261-6321458'),
('Lucho', 'Rodriguez', '261-7412589');