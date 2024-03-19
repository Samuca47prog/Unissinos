public class Livro{
    private String titulo;
    private String autor;
    private double preco;
    private int ano;

    // Construtores
    public Livro(String titulo, String autor, double preco, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.ano = ano;
    }

    // Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    // Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public double getPreco(){
        return preco;
    }

    public int getAno(){
        return ano;
    }

    // Outros métodos
    public String toString(){
        return "Livro " + titulo + ", autoria de " + autor + ", custando " + preco + ", publicado em " + ano;
    }
}