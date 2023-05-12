public class Retangulo extends Figura{
    private double base;
    private double altura;

    // Construtores
    public Retangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Retangulo(double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double x, double y, double base, double altura){
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    // Setters
    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    // Getters
    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    // Outros métodos
    public double calculaArea(){
        return base * altura;
    }
}
