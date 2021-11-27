create database db_escola;

use db_escola;

create table tb_estudantes(
id int(4) auto_increment,
nome varchar(80) not null,
turno char,
serie int(1),
telefone_responsavel int(11),
nota int(3),
primary key(id)
);

insert into tb_estudantes (nome,turno,serie,telefone_responsavel,nota) values ("Guilherme","V",7,11,8);
insert into tb_estudantes (nome,turno,serie,telefone_responsavel,nota) values ("Lucas","M",7,1198724196,6);
insert into tb_estudantes (nome,turno,serie,telefone_responsavel,nota) values ("Julia","V",6,1191358729,4);
insert into tb_estudantes (nome,turno,serie,telefone_responsavel,nota) values ("Maria","N",5,1199872365,7);
insert into tb_estudantes (nome,turno,serie,telefone_responsavel,nota) values ("Karla","M",5,1198245667,9);
insert into tb_estudantes (nome,turno,serie,telefone_responsavel,nota) values ("Ana","N",6,1196724589,10);
insert into tb_estudantes (nome,turno,serie,telefone_responsavel,nota) values ("João","V",8,1199025643,6);
insert into tb_estudantes (nome,turno,serie,telefone_responsavel,nota) values ("Matheus","V",8,1197835654,8);

select * from tb_estudantes;

select * from tb_estudantes where nota > 7;

select * from tb_estudantes where nota < 7;

update tb_estudantes set serie= 8 where id = 2;