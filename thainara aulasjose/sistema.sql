/**
Sistema para gestao de OS
@author Thainara Pires
*/

 select * from usuarios;
 show tables;
create database dbsistema;
show databases;

use dbsistema;
create table usuarios (
	id int primary key auto_increment,
	nome varchar(50) not null,
    login varchar(35) not null,
    senha varchar(50)
 );
 
 insert into usuarios (nome,login,senha)
values ('Thainara','thaiipires', '123@senac');