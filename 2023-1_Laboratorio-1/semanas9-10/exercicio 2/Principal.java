import java.util.Random;

public class Principal {
    public static void main(String[] args){
        Random random = new Random();
        int figuraAleatoria = random.nextInt(2); // generates a random integer between 0 (inclusive) and upperBound (exclusive)

        for(int i=1; i<5; i++){

            Figura fig;

            figuraAleatoria = random.nextInt(2);


            if(figuraAleatoria == 1){
                System.out.println("Criando círculo");
                fig = new Circulo(random.nextDouble(10.0));
            }
            else {
                System.out.println("Criando retangulo");
                fig = new Retangulo(random.nextDouble(10.0), random.nextDouble(10.0));
            }


            if(fig instanceof Circulo){
                System.out.println("Area do círculo: " + ((Circulo)fig).calculaArea());
            } 
            
            if(fig instanceof Retangulo){
                System.out.println("Area do retangulo: " + ((Retangulo)fig).calculaArea());
            } 
            
        }
    }
}
