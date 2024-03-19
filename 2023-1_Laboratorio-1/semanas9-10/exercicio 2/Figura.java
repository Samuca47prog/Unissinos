public class Figura {
    private double x;
    private double y;

    // Construtores
    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Figura(){
        this.x = 0;
        this.y = 0;
    }

    // Setters
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    // Getters
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    // Outros métodos
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
