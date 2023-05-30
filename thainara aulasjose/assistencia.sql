create database suportedb charset=utf8mb4 collate=utf8mb4_general_ci;
use suportedb;

create table chamado( 
idchamado bigint auto_increment primary key, 
solicitacao varchar(200) not null, 
departamentosolicitado varchar(200) not null, 
descricaochamado text not null, 
dataabertura varchar(20), 
dataresolucao varchar(20), 
statuschamado varchar(20), 
observacoes text, 
atendente varchar(200) 
)engine innodb charset=utf8mb4 collate=utf8mb4_general_ci;

select * from chamado;
drop table chamado;

insert into chamado(solicitacao, departamentosolicitado, descricaochamado, dataabertura, dataresolucao, statuschamado, observacoes, atendente)
values('mouse travando', 'departamento de informatica', 'meu mouse ta travando e desconectando do pc', '18/05/2023', 'sem previsao', 'aberto',  'sem observações', 'junior' );