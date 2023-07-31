CREATE TABLE clientes (
                          id TEXT PRIMARY KEY NOT NULL UNIQUE,
                          codigo_cliente SERIAL,
                          name VARCHAR(40) NOT NULL,
                          cpf VARCHAR(14) NOT NULL,
                          rg VARCHAR(17) NOT NULL,
                          borndate DATE,
                          logradouro VARCHAR(40),
                          complemento VARCHAR(20),
                          bairro VARCHAR(20) NOT NULL,
                          cep VARCHAR(8) NOT NULL,
                          cidade VARCHAR(20) NOT NULL,
                          uf VARCHAR(2) NOT NULL,
                          telefone VARCHAR(13),
                          celular VARCHAR(15) NOT NULL,
                          observacao VARCHAR(150)
);
