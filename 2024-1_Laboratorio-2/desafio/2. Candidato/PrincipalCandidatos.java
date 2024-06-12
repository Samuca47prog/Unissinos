import java.util.Random;

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

    private static void troca(Candidato[] candidatos, int firstIndex, int secondIndex) {
        Candidato temp = candidatos[firstIndex];
        candidatos[firstIndex] = candidatos[secondIndex];
        candidatos[secondIndex] = temp;
    }

}
