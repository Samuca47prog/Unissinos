import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TimeCampeonato timeMaior = new TimeCampeonato("Grêmio", 10);

        Campeonato campeonato = new Campeonato();

        try {
            campeonato.leArquivo("jogos.txt");
        } catch (IOException e) {
            System.out.println("Problema lendo o arquivo");
        }
        

        for (TimeCampeonato time : campeonato.getTimes()) {
            System.out.println(time);
        }

        System.out.println("Maior saldo: " + campeonato.timeMaiorSaldoGols());
    }
}
