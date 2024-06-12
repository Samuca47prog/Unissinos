import java.util.Random;
import java.util.Scanner;

public class PrincipalCandidatos {
    public static void main(String[] args) {

        // Geração dos candidatos aleatórios
        Random random = new Random();
        int tamanho = random.nextInt(100) + 1;
        System.out.println("Número de candidatos: " + tamanho);

        Candidato[] candidatos = new Candidato[tamanho];

        for (int i = 0; i < candidatos.length; i++) {
            candidatos[i] = new Candidato();
        }

        // Impressão dos candidatos aleatórios
        System.out.println("\n\n\tOrdem aleatória:");
        for (Candidato candidato : candidatos) {
            System.out.println(candidato.toString());
        }

        ordenaCandidatosPorPartido(candidatos);
        ordenaCandidatosPorVotos(candidatos);
        ordenaCandidatosPorNome(candidatos);

        // Impressão dos candidatos ordenados
        System.out.println("\n\n\tOrdem ordenada:");
        for (Candidato candidato : candidatos) {
            System.out.println(candidato.toString());
        }

        // Pesquisa o candidato
        Scanner scanner = new Scanner(System.in);
        System.out.print("Candidato procurado: ");
        String alvo = scanner.nextLine();

        int index = pesquisaBinariaCandidatos(candidatos, alvo);
        if(index > -1){
            System.out.println("\n\nCandidato achado!");
            System.out.println(candidatos[index].toString());
        }
        else {
            System.out.println("\n\nCandidato não achado!");
        }
    }

    public static void ordenaCandidatosPorNome(Candidato[] candidatos) {
        // INSERÇÃO DIRETA
        for (int i = 1; i < candidatos.length; i++) {
            Candidato candidatoAtual = candidatos[i];
            int j = i - 1;
            while (j >= 0 && candidatos[j].getNome().compareTo(candidatoAtual.getNome()) > 0) {
                candidatos[j + 1] = candidatos[j];
                j--;
            }
            candidatos[j + 1] = candidatoAtual;
        }
    }

    public static void ordenaCandidatosPorVotos(Candidato[] candidatos) {
        // INSERÇÃO DIRETA
        for (int i = 1; i < candidatos.length; i++) {
            Candidato candidatoAtual = candidatos[i];
            int j = i - 1;
            while (j >= 0 && candidatos[j].getIntencoesVotos() < candidatoAtual.getIntencoesVotos()) {
                candidatos[j + 1] = candidatos[j];
                j--;
            }
            candidatos[j + 1] = candidatoAtual;
        }
    }

    public static void ordenaCandidatosPorPartido(Candidato[] candidatos) {
        // SELEÇÃO DIRETA
        int tamanho = candidatos.length;
        for (int i = 0; i < tamanho - 1; i++) {
            String min = candidatos[i].getPartido();
            int indexOfMin = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (candidatos[j].getPartido().compareTo(min) < 0) {
                    min = candidatos[j].getPartido();
                    indexOfMin = j;
                }
            }
            troca(candidatos, i, indexOfMin);
        }
    }

    public static void troca(Candidato[] candidatos, int firstIndex, int secondIndex) {
        Candidato temp = candidatos[firstIndex];
        candidatos[firstIndex] = candidatos[secondIndex];
        candidatos[secondIndex] = temp;
    }


    public static int pesquisaBinariaCandidatos(Candidato[] candidatos, String alvo){
        return pesquisaBinariaCandidatos(candidatos, alvo, 0, candidatos.length - 1);
    }

    // Recursive binarySearch method
    private static int pesquisaBinariaCandidatos(Candidato[] candidatos, String alvo, int inicio, int fim) {
        if (inicio > fim) 
            return -1;

        int meio = (inicio + fim) / 2;

        if (candidatos[meio].getNome().equals(alvo)) {
            return meio;
        } else if (candidatos[meio].getNome().compareTo(alvo) > 0) {
            return pesquisaBinariaCandidatos(candidatos, alvo, inicio, meio - 1);
        } else {
            return pesquisaBinariaCandidatos(candidatos, alvo, meio + 1, fim);
        }
    }


}
