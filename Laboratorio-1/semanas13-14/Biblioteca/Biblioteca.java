import java.util.Arrays; 

public class Biblioteca {
    private Livro[] livros;

    // Construtores
    public Biblioteca(int quantidadeDeLivros){
        this.livros = new Livro[quantidadeDeLivros];
    }

    // Setters
    public void setLivros(Livro[] livros){
        this.livros = livros;
    }

    // Getters
    public Livro[] getLivos(){
        return livros;
    }

    // Outros métodos
    public String toString(){
        return Arrays.toString(livros);
    }

    public boolean insereLivro(Livro livro){

        for(int i=0; i<this.livros.length; i++){
            if(this.livros[i] == null){
                this.livros[i] = livro;
                return true;
            }
        }
        return false;
    }

    public Livro procuraLivroPorTitulo(String tituloProcurado){

        for(int i=0; i<this.livros.length; i++){
            if(this.livros[i] != null){
                if( this.livros[i].getTitulo().equals(tituloProcurado) ){
                    return this.livros[i];
                }
            }
        }
        return null;
    }

    public double verificaDesconto(String tituloProcurado){

        for(int i=0; i<this.livros.length; i++){
            if(this.livros[i] != null && this.livros[i] instanceof Novo){
                if( this.livros[i].getTitulo().equals(tituloProcurado) ){
                    return ((Novo)this.livros[i]).getDesconto();
                }
            }
        }
        return -1;
    }

    public void imprimeEdicoes(){

        for(int i=0; i<this.livros.length; i++){
            if(this.livros[i] != null && this.livros[i] instanceof Antigo){
                System.out.println("Livro " + this.livros[i].getTitulo() + " edição " + ((Antigo)this.livros[i]).getNumeroDeEdicao());
            }
        }
    }

    public void imprimeLivroPorAno(){
        Livro[] livrosOrdenadosPorAnoCriacao = livros;

        // Bubble Sort
        // repete para cada posição do array
        for (int i = 0; i < livros.length - 1; i++){
            // Realiza comparação entre todas as posições adiantes da atual
            for (int j = 0; j < livros.length - i - 1; j++){
                if(livrosOrdenadosPorAnoCriacao[j] != null && livrosOrdenadosPorAnoCriacao[j + 1] != null){
                    if (livrosOrdenadosPorAnoCriacao[j].getAno() < livrosOrdenadosPorAnoCriacao[j + 1].getAno()) {
                        // Swap
                        Livro tempLivro = livrosOrdenadosPorAnoCriacao[j];
                        livrosOrdenadosPorAnoCriacao[j] = livrosOrdenadosPorAnoCriacao[j + 1];
                        livrosOrdenadosPorAnoCriacao[j + 1] = tempLivro;
                    }
                }
            }
        }

        for(int i=0; i<livrosOrdenadosPorAnoCriacao.length; i++){
            if(livrosOrdenadosPorAnoCriacao[i] != null){
                System.out.println(i + ": " + livrosOrdenadosPorAnoCriacao[i].getAno() + " .. " + livrosOrdenadosPorAnoCriacao[i]);
            }
        }
    }

    public double calculaMediaPreco(){
        double somaPrecos = 0;
        int quantidadeLivros = 0;

        for(Livro l : this.livros){
            if(l != null){
                somaPrecos += l.getPreco();
                quantidadeLivros += 1;
            }
        }

        return somaPrecos / quantidadeLivros;
    }

    public Livro livroComMaiorTitulo() {

        // Assume a primeira posição não nula como maior título
        int indexMaiorTitulo = -1;
        for(int i=0; i<this.livros.length; i++){
            if(livros[i] != null){
                indexMaiorTitulo = i;
                break;
            }
        }

        if(indexMaiorTitulo == -1)
            return null;

        // Compara o título do primeiro livro encontrado com os demais
        for(int i=indexMaiorTitulo; i<this.livros.length; i++){
            if(livros[i] != null && livros[i].getTitulo().length() > livros[indexMaiorTitulo].getTitulo().length()){
                indexMaiorTitulo = i;
            }
        }

        return livros[indexMaiorTitulo];
    }
}
