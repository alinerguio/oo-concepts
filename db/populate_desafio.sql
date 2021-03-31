insert into cozinha values (1, 'Mineira', 14, 20, 'Tropeiro');
insert into cozinha values (2, 'Italiana', 10, 20, 'Macarrão');
insert into cozinha values (3, 'Mexicana', 20, 23, 'Tacos');
insert into cozinha values (4, 'Árabe', 14, 19, 'Hummus');
insert into cozinha values (5, 'Japonesa', 19, 23, 'Sushi');

insert into ingrediente values (1, 'Alga', '2021-04-04');
insert into ingrediente values (2, 'Arroz', '2021-12-31');
insert into ingrediente values (3, 'Feijão', '2021-12-31');
insert into ingrediente values (4, 'Tortilla', '2021-04-15');
insert into ingrediente values (5, 'Grão de Bico', '2021-04-04');
insert into ingrediente values (6, 'Shimeji', '2021-04-01');
insert into ingrediente values (7, 'Pimenta', '2021-06-10');
insert into ingrediente values (8, 'Massa', '2021-05-05');

insert into funcionario values (1, 'Alice', 'Cozinherx', 1);
insert into funcionario values (2, 'João', 'Ajudante', 1);
insert into funcionario values (3, 'Maria', 'Equipe de Limpeza', 2);
insert into funcionario values (4, 'José', 'Cozinherx', 2);
insert into funcionario values (5, 'Ricardo', 'Ajudante', 3);
insert into funcionario values (6, 'Joana', 'Equipe de Limpeza', 4);
insert into funcionario values (7, 'Daniel', 'Cozinherx', 4);
insert into funcionario values (8, 'Luna', 'Ajudante',4);
insert into funcionario values (9, 'Eduardo', 'Equipe de Limpeza', 4);
insert into funcionario values (10, 'Eduarda', 'Cozinherx', 4);

insert into ingrediente_cozinha values (5, 1);
insert into ingrediente_cozinha values (5, 2);
insert into ingrediente_cozinha values (3, 2);
insert into ingrediente_cozinha values (3, 3);
insert into ingrediente_cozinha values (3, 4);
insert into ingrediente_cozinha values (4, 5);
insert into ingrediente_cozinha values (5, 6);
insert into ingrediente_cozinha values (3, 7);
insert into ingrediente_cozinha values (2, 7);
insert into ingrediente_cozinha values (2, 8);