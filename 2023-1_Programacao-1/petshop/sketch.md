# Classes

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
- salario

## Gestor
Um tipo de funcionário

## Veterinario
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
- todos os papéis possam ser cadastrados e associados entre si. Por exemplo, deve ser possível cadastrar um novo cliente que possui 4 Pets. Naturalmente, estes Pets também deverão ser cadastrados
- buscas sejam feitas a partir de informações armazenadas no sistema. Por exemplo, buscar todos os Pets de uma determinada raça, todos os Pets que são peixes, o endereço de determinado cliente, o salário de um funcionário etc.
- que informações sejam excluídas do sistema quando desejado
