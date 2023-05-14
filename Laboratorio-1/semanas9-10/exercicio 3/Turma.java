public class Turma {
    private String codigo;
    private Aluno a1;
    private Aluno a2;
    private Aluno a3;

    // Construtores
    public Turma(String codigo, Aluno a1, Aluno a2, Aluno a3){
        this.codigo = codigo;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public double mediaNotasTurma(){
        double somaNotas = 0;
        int quantidadeAlunos = 0;

        if(a1 != null){
            somaNotas += a1.calculaNotaFinal();
            quantidadeAlunos++;
        }

        if(a2 != null){
            somaNotas += a2.calculaNotaFinal();
            quantidadeAlunos++;
        }

        if(a3 != null){
            somaNotas += a3.calculaNotaFinal();
            quantidadeAlunos++;
        }

        if(quantidadeAlunos == 0){
            return -1;
        }

        return somaNotas / quantidadeAlunos;
    }

    public void alteraNotasGrauA(String nome, double notaProva, double notaTrabalho){
        if(a1 != null && a1.getNome().equals(nome)){
            a1.getGa().setNotaProva(notaProva);
            a1.getGa().setNotaTrabalho(notaTrabalho);
        }

        if(a2 != null && a2.getNome().equals(nome)){
            a2.getGa().setNotaProva(notaProva);
            a2.getGa().setNotaTrabalho(notaTrabalho);
        }

        if(a3 != null && a3.getNome().equals(nome)){
            a3.getGa().setNotaProva(notaProva);
            a3.getGa().setNotaTrabalho(notaTrabalho);
        }
    }

    public void alteraNotasGrauB(String nome, double notaAtividades, double notaSeminario, double notaParticipacao){
        if(a1 != null && a1.getNome().equals(nome)){
            a1.getGb().setNotaAtividades(notaAtividades);
            a1.getGb().setNotaSeminario(notaSeminario);
            a1.getGb().setNotaParticipacao(notaParticipacao);
        }

        if(a2 != null && a2.getNome().equals(nome)){
            a2.getGb().setNotaAtividades(notaAtividades);
            a2.getGb().setNotaSeminario(notaSeminario);
            a2.getGb().setNotaParticipacao(notaParticipacao);
        }

        if(a3 != null && a3.getNome().equals(nome)){
            a3.getGb().setNotaAtividades(notaAtividades);
            a3.getGb().setNotaSeminario(notaSeminario);
            a3.getGb().setNotaParticipacao(notaParticipacao);
        }
    }
}
