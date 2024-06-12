import java.util.Random;

public class Candidato {
    private String nome;
    private String partido;
    private int intencoesVotos;

    public Candidato(String nome, String partido, int intencoesVotos) {
        this.nome = nome;
        this.partido = partido;
        this.intencoesVotos = intencoesVotos;
    }

    public Candidato() {
        this.nome = gerarNomeAleatorio();
        this.partido = gerarPartidoAleatorio();
        this.intencoesVotos = gerarIntencoesVotosAleatorio();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getIntencoesVotos() {
        return intencoesVotos;
    }

    public void setIntencoesVotos(int intencoesVotos) {
        this.intencoesVotos = intencoesVotos;
    }

    @Override
    public String toString() {
        return "Candidato[nome:" + nome + "; \tintencao votos:" + intencoesVotos + "; \tpartido:" + partido + "]";
    }

    private String gerarNomeAleatorio() {
        String[] nomes = { "Ana", "Carlos", "Maria", "Pedro", "João", "Laura", "Marcos", "Júlia" };
        return nomes[new Random().nextInt(nomes.length)];
    }

    private String gerarPartidoAleatorio() {
        String[] partidos = {
                "Democrático",
                "Da Liberdade",
                "Verde",
                "Republicano",
                "Popular",
                "Conservador",
                "Da Esperança",
                "Humanista",
                "Independente"
        };
        return partidos[new Random().nextInt(partidos.length)];
    }

    private int gerarIntencoesVotosAleatorio(){
        return new Random().nextInt(10);
    }

}