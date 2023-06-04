public class exercicio1 {
    
    public boolean verificaLivro(Livro[] livros, String titulo){
        
        for(Livro l : livros){
            if(l != null){
                if(  l.getTitulo().equals(titulo)  ){
                    return true;
                }
            }
        }

        return false;
    }
}
