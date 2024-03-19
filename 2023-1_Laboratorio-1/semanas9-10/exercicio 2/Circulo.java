public class Circulo extends Figura {
    private double raio;

    // Construtores
    public Circulo(){
        super();
        this.raio = 0;
    }

    public Circulo(double raio){
        super();
        this.raio = raio;
    }

    public Circulo(double x, double y, double raio){
        super(x, y);
        this.raio = raio;
    }


    // Setters
    public void setRaio(double raio){
        this.raio = raio;
    }

    // Getters
    public double getRaio(){
        return raio;
    }

    // Outros métodos
    public String toString(){
        return super.toString() + " " + "Raio: " + raio;
    }

    public double calculaArea(){
        return 3.14 * raio * raio;
    }


}
