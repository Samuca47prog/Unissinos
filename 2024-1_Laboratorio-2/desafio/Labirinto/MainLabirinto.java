public class MainLabirinto{
    public static void main(String[] args) {
        // Labirinto labirinto = new Labirinto();
        Labirinto labirinto = new Labirinto("labirinto.txt");

        labirinto.imprimeLabirinto();

        System.out.println("Labirinto com D: True == " + labirinto.percorreLabirinto());
    }
}