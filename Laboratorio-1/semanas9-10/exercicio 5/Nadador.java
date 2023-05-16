public class Nadador extends Atleta{
    private String categoria;

    // Construtores
    public Nadador(String nome, int idade, String categoria){
        super(nome, idade);

        this.categoria = categoria;
    }

    // Setters
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    // Getters
    public String getCategoria(){
        return categoria;
    }

    // Outros métodos
    public void imprimeInfo(){
        System.out.println(
             "--- Nadador ---"
        );
        super.imprimeInfo();
        System.out.println(
             "Categoria: " + categoria
        );
    }
}
