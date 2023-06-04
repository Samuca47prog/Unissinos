public class Testes {
    public static void main(String[] args){

        Livro l1 = new Livro("Do mil ao milhão", "Thiago Nigro", 2018);
        Livro l2 = new Livro("Pai rico, pai pobre", "Robert Kiyosaki", 1997);
        Livro l3 = new Livro("Mais esperto que o diabo", "Napoleon Hill", 1938);
        Livro[] livros = {l1, null, l2, l3};

        Universidade u1 = new Universidade("Unisinos", 10000);
        Universidade u2 = new Universidade("Feevale", 1000);
        Universidade u3 = new Universidade("PUC", 100);
        Universidade[] universidades = {u1, null, u2, u3};
        Universidade[] universidadesNull = {null, null, null};


        // Exercício 1
        exercicio1 exercicio1 = new exercicio1();
        System.out.println("\n\n\t Exercício 1");
        System.out.println( (exercicio1.verificaLivro(livros, "Do mil ao milhão") == true ? "[Certo]" : "[Error]") + " - Pesquisando um livro que existe o retorno deve ser true" );
        System.out.println( (exercicio1.verificaLivro(livros, "O Investidor Inteligente") == false ? "[Certo]" : "[Error]") + " - Pesquisando um livro que NÃO existe o retorno deve ser false" );


        // Exercício 2
        Exercicio2 exercicio2 = new Exercicio2();
        System.out.println("\n\n\t Exercício 2");
        System.out.println( (exercicio2.retornaLivro(livros, "Do mil ao milhão") != null  ? "[Certo]" : "[Error]") + " - Retorna o livro quando ele existe no array" );
        System.out.println( (exercicio2.retornaLivro(livros, "O Investidor Inteligente") == null ? "[Certo]" : "[Error]") + " - Retorna null quando o livro não existe" );


        // Exercicio 3
        Exercicio3 exercicio3 = new Exercicio3();
        System.out.println("\n\n\t Exercício 3");
        exercicio3.imprimeUniversidades(universidades);


        // Exercicio 4
        Exercicio4 exercicio4 = new Exercicio4();
        System.out.println("\n\n\t Exercício 4");
        System.out.println( ( (exercicio4.maisAlunos(universidades).getNumeroDeAlunos() ==  u1.getNumeroDeAlunos() ) ? "[Certo]" : "[Error]") + " - Retorna a faculdade com maior quantidade de alunos");
        System.out.println( ( (exercicio4.maisAlunos(universidadesNull) == null ) ? "[Certo]" : "[Error]") + " - Retorna null se nenhuma universidade foi passada");

    }
}
