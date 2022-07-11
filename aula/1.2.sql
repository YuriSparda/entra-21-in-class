CREATE TABLE produto (
  ProdID INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Quant INTEGER UNSIGNED  NOT NULL  ,
  valorEA DOUBLE  NOT NULL  ,
  nomeProduto2 TEXT  NOT NULL    ,
PRIMARY KEY(ProdID));



CREATE TABLE Cliente (
  idCliente INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Nome TEXT  NOT NULL  ,
  Numero INTEGER UNSIGNED  NOT NULL  ,
  Rua TEXT  NOT NULL  ,
  Estado TEXT  NOT NULL  ,
  Cidade TEXT  NOT NULL  ,
  email TEXT  NOT NULL  ,
  CNPJ INTEGER UNSIGNED  NOT NULL    ,
PRIMARY KEY(idCliente));



CREATE TABLE Pedido (
  idPedido INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Cliente_idCliente INTEGER UNSIGNED  NOT NULL  ,
  Data-do-Pedido DATE  NULL  ,
  Data-para-entregar DATE  NULL    ,
PRIMARY KEY(idPedido)  ,
INDEX Pedido_FKIndex2(Cliente_idCliente),
  FOREIGN KEY(Cliente_idCliente)
    REFERENCES Cliente(idCliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Table_06 (
  produto_ProdID INTEGER UNSIGNED  NOT NULL  ,
  Pedido_idPedido INTEGER UNSIGNED  NOT NULL  ,
  Quant pedi INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(produto_ProdID, Pedido_idPedido)  ,
INDEX Table_06_FKIndex1(produto_ProdID)  ,
INDEX Table_06_FKIndex2(Pedido_idPedido),
  FOREIGN KEY(produto_ProdID)
    REFERENCES produto(ProdID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Pedido_idPedido)
    REFERENCES Pedido(idPedido)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);




