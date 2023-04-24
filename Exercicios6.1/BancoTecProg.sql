create database Bancotecprog;
use Bancotecprog;

create table Usuario(
id int(4) auto_increment primary key not null,
codigo int(3) not null,
login varchar(100),
senha varchar(50),
telefone varchar(11)
);

create table Usuarios(
id int not null auto_increment primary key,
codigo int,
nome varchar(100),
email varchar(50),
login varchar(50),
senha varchar(50)
);

create table Produtos(
id int not null auto_increment primary key,
codigo int,
nomeProduto varchar(100),
descricao varchar(100)
);

create table Vendedor(
id int not null auto_increment primary key,
codigo int,
nomeVendedor varchar(100),
produtoVendido varchar(100)
);