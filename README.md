# Sistema de compras 
Trabalho final, da disciplina de Linguagem de Programação Orientada a Objetos (LPOO), da Universidade Federal de Mato Grosso do Sul (UFMS), de um sistema de compras.

Este trabalho tem como objetivo desenvolver um projeto em Java no Eclipse que simule um Sistema de Compras. O trabalho foi realizado em dupla, pelos alunos Everton de Oliveira e Lourdes Oshiro Igarashi.

O sistema é composto pelas classes especificadas abaixo e deverá permitir a inclusão de Endereco, Fornecedor, Produto, Cliente, Funcionario e Compra; e de novas informações, além de alterar e ler as informações dadas, utilizando os métodos get e set.

## Saída do Projeto:
• 1- Listar Clientes
o nome, o cpf e o cleular.
• 2- Listar Funcionários
o nome, o cpf, o cleular, a função e o salário.
• 3-Listar compras:
o nome do Cliente que fez a compra, do funcionário que vendeu, listar os produtos comprados
em ordem por valor e o total da compra.

## Descrição das Classes e Interfaces
(a) Interface Verificável
• Método:
a) boolean validar(String codigo);
Este método deverá validar o CPF para Pessoa e o CNPJ para Fornecedor, sempre que
esses valores forem cadastradso ou alterados no nestas classes. Se o valor retronado for
false, então deverá chamar o método que solicita um novo valor a ser validado. 
b) void
solicitarNovo():
Este método deverá solicitar um novo CPF para Pessoa ou um novo CNPJ para fornecedor, sempre que o valor validado retorna false. Quando o novo valor for fornecido,
deverá chamar o método validar, para que seja verificado.

(b) Classe Endereço
• Atributos:
String rua; int numero; String bairro; String cidade; String cep;
• 2 construtores:
a) Para endereço completo
public Endereco(String rua, int numero, String bairro, String cidade, String cep)
b) Para endereço sem cep
public Endereco(String rua, int numero, String bairro, String cidade)
• Métodos:
a) gets e sets

(c) Classe Pessoa (Abstrata)
• Implementa a classe Verificavel
• Atributos privados:
String nome; String cpf; Endereco endereco; String celular;
• 1 Construtor
a) public Pessoa(String nome, String cpf, Endereco endereco, String celular)
obs: no construtor deve-se validar o CPF antes de atribuir o valor do cpf
Então é preciso chamar o método para validar(String codigo)
Se o CPF estiver correto, ele será atribuído,
Caso contrário deverá solicitar um novo valor para o cpf
• Métodos:
a) @Override
public boolean validar(String CPF)
este método terá que validar o CPF
b) @Override
public void solicitarNovo()
este método solicita um novo CPF, até que o valor do CPF informado esteja correto
(d) Classe Funcionario
• Estende a classe Pessoa
• 1 construtor com os parâmetros de pessoa, o salario e a funcao
• Método:
a) @Override
public String toString()
retorna uma String com o nome, o cpf, o celular, a função e o salário do funcionário.
(e) Classe Cliente
• Estende a classe Pessoa
• 1 construtor com os parâmetros de pessoa
• Método:
a) @Override
public String toString()
retorna uma String com o nome, o cpf e o celular do cliente
(f) Classe Fornecedor
• Implementa a classe Verificavel
• Atributos privados:
String razaoSocial; String nomeFantasia; String cnpj; Endereco endereco; String celular;
• 1 Construtor
a) public Fornecedor(String razaoSocial;String nomeFant; String cnpj Endereco endereco, String celular)
obs: no construtor deve-se validar o CNPJ antes de atribuir o valor do cnpj
Então é preciso chamar o método para validar(String codigo)
Se o CNPJ estiver correto, ele será atribuído,
Caso contrário deverá solicitar um novo valor para o cnpj
• Métodos:
a) @Override
public boolean validar(String CNPJ)
este método terá que validar o CNPJ
b) @Override
public void solicitarNovo()
este método solicita um novo CNPJ, até que o valor do CNPJ informado esteja correto
(g) Classe Produto
• Atributos privados:
String nomeProduto; Float valor; Fornecedor empresa
• 1 construtor com os parâmetros de Fornecedor, nomeProduto, valor e empresa
• Método:
a) int compareTo(Object obj)
compara os produtos pelo valor
b) public String toString()
retorna uma String com o nomeProduto e o valor
(h) Classe Compra
• Atributos privados:
Funcionario funcionario; Cliente cliente; List Produto produto
• 1 construtor com os parâmetros: Funcionario e Cliente
• Método:
a) void adicionaProduto(Produto prod)
b) public void listarCompra()
O método listar compra deverá informar o Funcionário que fez a venda e o cliente que
fez a compra
Em seguida, deverá listar todos os produtos comprados pelo cliente ordenado do menor
para o maior valor do produto
Ao final mostrar o valor total da compra.
O valor do Produto impresso deve possuir 2 casas decimais.
(i) Classe Main
• Possui o método main
• Inserir pelo menos 6 Enderecos, 2 Funcionarios, 2 Clientes, 2 Fornecedores, 10 Produtos
• Usar exceção para tratar entradas inválidas para os valores referente a produtos e salário
do Funcionario.
• Innserir pelo menos 2 compras com no mínimo 5 produtos.
• Listar os Cliente, os Fornecedore e as Compras conforme citado acima.
(j) Informações adicionais
• O código deve ser comentado conforme necessidade de explicar certas funções e funcionalidades;
• O projeto deve utilizar obrigatoriamente os conceitos de Herança, Abstração, Polimorfismo, Encapsulamento e Interfaces;
• Usar coleções (ArrayList), para armazenar os Produtos na classe Compra.
