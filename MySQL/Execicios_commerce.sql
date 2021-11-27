create database db_commerce;

use db_commerce;

create table tb_produtos(
id int(4) auto_increment,
nome varchar(80) not null,
preco decimal(10,2),
marca varchar(10),
quatidade int(4), -- quantidade
primary key(id)
);

insert into tb_produtos(nome,preco,marca,quatidade) values ("TV 50 Polegadas",3500,"Philco",78);
insert into tb_produtos(nome,preco,marca,quatidade) values ("PS-5",4865,"Sony",32);
insert into tb_produtos(nome,preco,marca,quatidade) values ("Geladeira",1629,"Consul",12);
insert into tb_produtos(nome,preco,marca,quatidade) values ("Micro-Ondas",499,"Philco",18);
insert into tb_produtos(nome,preco,marca,quatidade) values ("Cafeteira",129,"Philco",54);
insert into tb_produtos(nome,preco,marca,quatidade) values ("Batedeira",289,"Consul",23);
insert into tb_produtos(nome,preco,marca,quatidade) values ("Fogão",290,"Consul",21);
insert into tb_produtos(nome,preco,marca,quatidade) values ("Roteador",399,"TP-link",35);

select * from tb_produtos;

select * from tb_produtos where preco < 500;

select * from tb_produtos where preco > 500;

update tb_produtos set preco = 3999 where id = 3;