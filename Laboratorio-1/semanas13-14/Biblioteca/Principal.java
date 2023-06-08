public class Principal {
    public static void main(String[] args){

        // Possibilidade de autores:
        String[] autoresPossiveis = {
            "William Shakespeare",
            "Jane Austen",
            "Leo Tolstoy",
            "Mark Twain",
            "Charles Dickens",
            "Virginia Woolf",
            "Fyodor Dostoevsky",
            "Ernest Hemingway",
            "Gabriel Garcia Marquez",
            "J.R.R. Tolkien",
            "George Orwell",
            "Harper Lee",
            "Emily Dickinson",
            "Toni Morrison",
            "J.K. Rowling"
        };
        // Possibilidade de livros
        String[] livrosPossiveis = {
            "To Kill a Mockingbird",
            "1984",
            "Pride and Prejudice",
            "The Great Gatsby",
            "The Catcher in the Rye",
            "Moby-Dick",
            "War and Peace",
            "The Lord of the Rings",
            "The Chronicles of Narnia",
            "Harry Potter and the Philosopher's Stone",
            "The Hobbit",
            "Brave New World",
            "The Odyssey",
            "Crime and Punishment",
            "Don Quixote",
            "Frankenstein",
            "The Adventures of Huckleberry Finn",
            "Jane Eyre",
            "The Iliad",
            "One Hundred Years of Solitude",
            "Wuthering Heights",
            "The Divine Comedy",
            "Alice's Adventures in Wonderland",
            "The Picture of Dorian Gray",
            "The Color Purple",
            "Gone with the Wind",
            "The Alchemist",
            "The Little Prince",
            "The Hitchhiker's Guide to the Galaxy",
            "The Da Vinci Code"
        };
        // Preços podem variar de 5 a 300
        // Anos de criação podem variar de 1950 a 2020
        // Descontos podem variar de 5 a 50
        // Número de edição podem variar de 1 a 20

        String tituloLivroBuscado;
        Livro livroBuscado;


        // 1. ------------------
        System.out.println("\n\n\t 1. Criação da biblioreta");

        int quantidadeMaxDeLivros = (int)(Math.random() * 200 + 1);
        Biblioteca biblioteca = new Biblioteca(quantidadeMaxDeLivros);
        System.out.println("Biblioteca criada com capacidade de " + quantidadeMaxDeLivros + " Livros");


        // 2. ------------------
        System.out.println("\n\n\t 2. Sorteio de valores até 300");

        int quant = (int)(Math.random() * 300 + 1);
        System.out.println("Vamos tentar colocar " + quant + " Livros nesta biblioteca...");


        // 3. ------------------
        System.out.println("\n\n\t 3. Inserindo livros na biblioteca");

        for(int i=0; i<quant; i++){

            if((int)(Math.random() * 2 + 1) > 1){
                boolean livroInserido = biblioteca.insereLivro(new Novo(livrosPossiveis[(int)(Math.random() * livrosPossiveis.length)],
                                                                        autoresPossiveis[(int)(Math.random() * autoresPossiveis.length)],
                                                                        (double)(Math.random() * 295) + 5,
                                                                        (int)(Math.random() * 70) + 1950,
                                                                        (double)(Math.random() * 45) + 5)
                                                                );
                if(livroInserido){
                    System.out.println(i + ". Livro inserido!");
                }
                else {
                    System.out.println(i + ". Livro NÃO inserido!");
                }
            }
            else {
                boolean livroInserido = biblioteca.insereLivro(new Antigo(  livrosPossiveis[(int)(Math.random() * livrosPossiveis.length)],
                                                                            autoresPossiveis[(int)(Math.random() * autoresPossiveis.length)],
                                                                            (double)(Math.random() * 295) + 5,
                                                                            (int)(Math.random() * 70) + 1950,
                                                                            (int)(Math.random() * 19) + 1)
                                                                            );
                if(livroInserido){
                    System.out.println(i + ". Livro inserido!");
                }
                else {
                    System.out.println(i + ". Livro NÃO inserido!");
                }
            }
        }


        // 4. ------------------
        System.out.println("\n\n\t 4. Pesquisando um livro na biblioteca");

        tituloLivroBuscado = "The Odyssey";

        livroBuscado = biblioteca.procuraLivroPorTitulo(tituloLivroBuscado);

        if(livroBuscado != null){
            System.out.println("O livro buscado " + tituloLivroBuscado + " existe. Segue suas informações: ");
            System.out.println(livroBuscado.toString());
        }
        else{
            System.out.println("O livro buscado " + tituloLivroBuscado + " NÃO está presente na biblioteca!");
        }


        // 5. ------------------
        System.out.println("\n\n\t 5. Pesquisando o desconto de livro na biblioteca");

        tituloLivroBuscado = "Alice's Adventures in Wonderland";

        livroBuscado = biblioteca.procuraLivroPorTitulo(tituloLivroBuscado);

        if(livroBuscado != null){
            if(livroBuscado instanceof Novo){
                System.out.println("O livro buscado " + tituloLivroBuscado + " está com desconto de " + ((Novo)livroBuscado).getDesconto());
            }
            else {
                System.out.println("O livro buscado " + tituloLivroBuscado + " existe na biblioteca mas NÃO possui desconto.");
            }
        }
        else{
            System.out.println("O livro buscado " + tituloLivroBuscado + " NÃO está presente na biblioteca!");
        }


        // 6. ------------------
        System.out.println("\n\n\t 6. Imprimindo as edições dos livros antigos");

        biblioteca.imprimeEdicoes();


        // 7. ------------------
        System.out.println("\n\n\t 7. Imprimindo livros de acordo com ano de criação");

        biblioteca.imprimeLivroPorAno();


        // 8. ------------------
        System.out.println("\n\n\t 8. Valor médio dos livros");

        System.out.println("Valor médio: " + biblioteca.calculaMediaPreco());


        // 9. ------------------
        System.out.println("\n\n\t 9. Livro com maior título");

        System.out.println("Livro com maior título: " + biblioteca.livroComMaiorTitulo());
    }
}
