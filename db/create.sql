create database restaurante;
create table cozinha (
	id_cozinha integer primary key,
	tipo varchar(30),
	horaabertura integer,
	horafechamento integer,
	pratoprincipal varchar(30)
);

create table ingrediente (
	id_ingrediente integer primary key,
	nome varchar(30),
	datavalidade date
);

create table funcionario (
	id_funcionario integer primary key,
	nome varchar(30),
	atividade varchar(30)
);