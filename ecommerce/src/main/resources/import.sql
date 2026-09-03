insert into categoria (nome, descricao) values ('Informatica', 'Produtos de Informatica');

insert into categoria (nome, descricao) values ('Livros', 'Livros Tecnicos');

insert into produto (nome, descricao, preco, estoque, categoria_id ) values ('Codigo limpo', 'Livro do Robert C Martin', 87.34, 20, 2);

insert into cliente (nome, email, telefone) values ('miguel', 'Miguel@Gmail.com', '18997965327');

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-02 20:13:10', 'Pago', '35', '1');

insert into item_pedido (pedido_id, produto_id, quantidade, valor_unitario) values ('1', '2', '5', '100');