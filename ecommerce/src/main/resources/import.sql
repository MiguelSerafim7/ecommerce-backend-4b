

insert into categoria (nome, descricao) values ('Informatica', 'Produtos de Informatica');

insert into categoria (nome, descricao) values ('Livros', 'Livros Tecnicos');

insert into categoria (nome, descricao) values ('Eletronicos', 'Produtos Eletronicos');

insert into categoria (nome, descricao) values ('Acessorios', 'Acessorios para Computadores');

insert into categoria (nome, descricao) values ('Games', 'Produtos para Games');




insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Codigo limpo', 'Livro do Robert C Martin', 87.34, 20, 2);

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Notebook Lenovo', 'Notebook para estudos e trabalho', 3500.00, 10, 1);

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Mouse Logitech', 'Mouse sem fio para computador', 120.50, 30, 4);

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Teclado Mecanico', 'Teclado mecanico para computadores', 250.00, 15, 4);

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Controle Xbox', 'Controle para jogos de computador', 399.90, 12, 5);




insert into cliente (nome, email, telefone) values ('miguel', 'Miguel@Gmail.com', '18997965327');

insert into cliente (nome, email, telefone) values ('Joao', 'Joao@Gmail.com', '18991234567');

insert into cliente (nome, email, telefone) values ('Maria', 'Maria@Gmail.com', '18992345678');

insert into cliente (nome, email, telefone) values ('Carlos', 'Carlos@Gmail.com', '18993456789');

insert into cliente (nome, email, telefone) values ('Ana', 'Ana@Gmail.com', '18994567890');



insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-02 20:13:10', 'Pago', '436.70', '1')

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-03 10:20:15', 'Pago', '3500', '2');

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-04 14:30:00', 'Pendente', '120.50', '3');

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-04 18:45:30', 'Pago', '250', '4');

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-05 09:15:45', 'Pendente', '399.90', '5');




insert into item_pedido (pedido_id, produto_id, quantidade, valor_unitario) values ('1', '1', '5', '87.34');

insert into item_pedido (pedido_id, produto_id, quantidade, valor_unitario) values ('2', '2', '1', '3500');

insert into item_pedido (pedido_id, produto_id, quantidade, valor_unitario) values ('3', '3', '1', '120.50');

insert into item_pedido (pedido_id, produto_id, quantidade, valor_unitario) values ('4', '4', '1', '250');

insert into item_pedido (pedido_id, produto_id, quantidade, valor_unitario) values ('5', '5', '1', '399.90');






insert into pagamento (pedido_id, valor, data, status, tipo) values ('1', '436.70', '2026-09-02 20:13:10', 'ativo', 'normal');

insert into pagamento (pedido_id, valor, data, status, tipo) values ('2', '3500', '2026-09-03 10:20:15', 'ativo', 'normal');

insert into pagamento (pedido_id, valor, data, status, tipo) values ('3', '120.50', '2026-09-04 14:30:00', 'pendente', 'normal');

insert into pagamento (pedido_id, valor, data, status, tipo) values ('4', '250', '2026-09-04 18:45:30', 'ativo', 'normal');

insert into pagamento (pedido_id, valor, data, status, tipo) values ('5', '399.90', '2026-09-05 09:15:45', 'pendente', 'normal');

