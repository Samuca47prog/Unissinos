public class Exercicio2 {
    
    public Livro retornaLivro(Livro[] livros, String titulo){
        Livro livro = null;

        for(Livro l : livros){
            if(l != null){
                if(  l.getTitulo().equals(titulo)  ){
                    return l;
                }
            }
        }

        return livro;
    }

}
