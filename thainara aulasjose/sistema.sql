/**
Sistema para gestao de OS
@author Thainara Pires
*/

 select * from usuarios;
 show tables;
create database dbsistema;
show databases;

drop table clientes;

use dbsistema;

create table usuarios (
	id int primary key auto_increment,
	nome varchar(50) not null,
    login varchar(15) not null unique,
    senha varchar(250) not null
 );
 
 create table clientes (
	idcli int primary key auto_increment,
	nome varchar(50) not null,
	cpf varchar(11) not null unique,
	rg varchar(9) not null unique,
    cnpj varchar(14) unique,
    endereco varchar(35) not null,
    numero varchar(10) not null,
	complemento varchar(20),
    bairro varchar(50) not null,
    cep varchar(20),
    cidade varchar(30) not null,
    uf char(2),
	fone varchar(12) not null,
	email varchar(50) not null unique
 ); 
 
 -- Unique nao permite valores duplicados no campo
describe clientes;
 insert into clientes (nome,cpf,rg, cnpj, endereco, bairro, telefone, email)
 values ('thainara','555555578', '444444444', '4444444444444', 'rua seila', 'tatuape', '999999999', 'thainara@mail.com');
 select * from clientes;
 select * from clientes where idcliente = 1;
 
-- Como criptografar uma senha md5, acima..

-- login - autenticação
select * from usuarios where login = 'admin' and senha = md5('admin');

