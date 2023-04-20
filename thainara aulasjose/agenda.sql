/**
* Agenda de contatos
* @author Thainara Pires da Silva
*/

-- comentários em linha
-- exibir os bancos
show databases;

-- apagar um banco de dados
drop database dbagenda;

-- criar um novo banco de dados
create database dbagenda;
-- selecionar o banco de dados a ser trabalhado
use dbagenda;
-- exibir tabelas do banco de dados
 show tables;
 -- criando uma tabela no banco de dados
 
 -- int (tipos de dados: número inteiro)
 -- primary key (chave primária)
 -- auto_increment (numeração automática)
 -- varchar (tipo de dados: String)
 -- not null (campo obrigatório)
 
 create table contatos (
	id int primary key auto_increment,
	nome varchar(50) not null,
    fone varchar(15) not null,
    email varchar(50)
 );
 -- descrever a tabela
 describe contatos;
 
 -- selecionar tudo da tabela
 select * from contatos;
 
-- CRUD CREATE
insert into contatos (nome,fone,email)
values ('Thainara','954286214', 'thainarasilvacontato@gmail.com');

insert into contatos (nome,fone)
values ('Bill Gates','9542834243');

insert into contatos (nome,fone)
values ('Amanda','9542834253');

insert into contatos (nome,fone)
values ('Aline','9542834246');

insert into contatos (nome,fone)
values ('Andressa','9542855543');

insert into contatos (nome,fone)
values ('Angela','9542834543');

insert into contatos (nome,fone,email)
values ('Poliana','9542432434', 'poliana@gmail.com');

insert into contatos (nome,fone,email)
values ('Thaina','944432434', 'thaina@gmail.com');

insert into contatos (nome,fone,email)
values ('Mariana','945632434', 'mariana@gmail.com');

insert into contatos (nome,fone,email)
values ('matheus','944552434', 'matheus@gmail.com');

-- Simulando um erro

insert into contatos(nome,email)
values ('Robson Vaamonde', 'vava@gmail.com');


-- CRUD Read

-- selecionar tudo da tabela
select * from contatos;

-- selecionar e ordenar
select * from contatos order by nome;
select * from contatos order by nome desc;

-- pesquisas avançadas
select nome from contatos;
select nome, email from contatos;
select * from contatos where nome like 'an%';
select * from contatos where nome = "Thainara";
select * from contatos where id = 1;
select nome from contatos order by nome;
select fone from contatos order by nome;

-- relatórios personalizados com apelidos para os campos
select nome as Contato, fone as Telefone, email as Email from contatos order by nome;

-- CRUD Update
-- CUIDADO !!! SEMPRE USAR A CLAÚSULA where junto com a chave primária
-- No linux funciona

update contatos set fone = '77774-7477' where id = 1;
update contatos set fone = '77774-7474' where nome = 'Amanda'; 
update contatos set fone = '77774-7433',email = 'bill@gmail.com' where id = '2';
update contatos set nome= 'Willian Gates', fone= '50 905032121', email ='bill@outlook.com' where id=2;
update contatos set nome = 'Amanda', email = 'amanda@outlook.com' where id= 3;
update contatos set nome = 'Aline', email = 'aline@outlook.com' where id= 4;
update contatos set nome = 'Andressa', email = 'andressa@outlook.com' where id= 5;
update contatos set nome = 'Angela', email = 'angela@outlook.com' where id= 6;

update contatos set fone = '46 3741-3286' where id = 1;
update contatos set fone = '41 3741-3286' where id = 2;
update contatos set fone = '21 3741-3286' where id = 3;
update contatos set fone = '77 2741-3286' where id = 4;
update contatos set fone = '10 2741-3286' where id = 5;
update contatos set fone = '01 2741-3286' where id = 6;
update contatos set fone = '23 2741-3286' where id = 7;
update contatos set fone = '87 2741-3286' where id = 8;
update contatos set fone = '12 2741-3286' where id = 9;
update contatos set fone = '11 2741-3286' where id = 10;

-- CRUD Delete
-- CUIDADO !!! SEMPRE USAR A CLAÚSULA where junto com a chave primária

delete from contatos where id = 10;

insert into contatos (nome, fone, email)
values ('Leandro ramos', '88 8888-8888', 'lele@outlook.com');

-- Alterações na estrutura da tabela :D 

alter table contatos add column obs varchar(100);

 -- adicionar uma coluna após um local específico
 alter table contatos add fone2 varchar(15) not null after fone;

-- alterando tipo de dados ou validações
-- atenção aos dados já cadastrados 

alter table contatos modify fone2 varchar(20);
alter table contatos drop column obs;
 
 -- Excluir tabela :(((((((
 drop table contatos;
 
describe contatos;
select * from contatos;


