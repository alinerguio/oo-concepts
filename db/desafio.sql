create table ingrediente_cozinha (
	id_cozinha integer,
	id_ingrediente integer,
	foreign key(id_cozinha) REFERENCES cozinha(id_cozinha),
	foreign key(id_ingrediente) REFERENCES ingrediente(id_ingrediente)
);

alter table funcionario
add id_cozinha integer,
add foreign key(id_cozinha) REFERENCES cozinha(id_cozinha);