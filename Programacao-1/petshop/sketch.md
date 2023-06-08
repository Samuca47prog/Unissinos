# Classes

## PetShop
Rerpresenta uma loja de PetShop

### Atributos
- -nome: String
- -endereco: Endereco
- -estoque: Estoque
- -clientes: Cliente[]
- -funcionarios: Funcionario[]


## Pet
um animalzinho, um gato, um cachorro, etc.

### Atributos
- String raca
- String nome
- int idade

## Mamifero
extends Pet  
Um tipo de Pet

## Peixe
extends Pet  
Um tipo de Pet

## Ave
extends Pet  
Um tipo de Pet

## Funcionario
Funcionário do PetShop

### Atributos
- String nome
- Endereco endereco
- Double salario

## Gestor
extends Funcionario  
Um tipo de funcionário

## Veterinario
extends Funcionario  
Um tipo de funcionário

## Cliente
Cliente do PetShop

### Atributos
- String nome
- Endereco endereco
- Pet[] pets

## Produto
Produto vendido no PetShop

### Atributos
- String nome
- double valor
- String descricao

## Estoque
Estoque de produtos do PetShop

### Atributos
- Produtos[] estoque

## Endereco
Representa um endereço

### Atributos
- String rua
- int numero
- String bairro
- String cidade
- String estado
- String pais


# Sistema
- > todos os papéis possam ser cadastrados e associados entre si. Por exemplo, deve ser possível cadastrar um novo cliente que possui 4 Pets. Naturalmente, estes Pets também deverão ser cadastrados

Para realizar a tarefa de cadastro, deve ser implementado o seguinte:
- Pedir as informações do cliente para criar o objeto deste cliente
- Pedir ao usuário quantos pets ele deseja cadastrar para o recem criado cliente
- realizar um for para pedir as informações dos pets o número de vezes que foi passado no item anterior, adicionando tais pets ao cliente recem cadastrado

- > buscas sejam feitas a partir de informações armazenadas no sistema. Por exemplo, buscar todos os Pets de uma determinada raça, todos os Pets que são peixes, o endereço de determinado cliente, o salário de um funcionário etc.

Para realizar buscas no sistema, será feito iterações seguidas de comparações nos atributos do clientes e do funcionarios. Cada funcionário criado deve ser adicionado na lista de funcionários, da mesma forma para clientes.

Desta forma, para pesquisar uma raça de pet, deve ser feito:
- iterar por cada posição não nula de Clientes
- dentro da iteração anterior, iterar por cada pet desse cliente
- comparar a raça de cada pet com a raça pesquisada.
- retornar um vetor com todos os clientes que possuem a raça pesquisada.

Similarmente, para pesquisar o salário de um funcionário, deve ser feito:
- iterar por cada posição não nula de Funcionarios
- se o nome do funcionário for igual ao nome pesquisado, retornar o salário deste funcionário.


- > que informações sejam excluídas do sistema quando desejado

Para exluir informações como Cliente, Funcionário, Produto ou Pets, basta pesquisar essa informação no vetor respectivo e remover essa posição. 