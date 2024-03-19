public class main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();

        int escolha = 1;

        if (escolha == 1){
            Programador prog = (Programador)pessoa;

            prog.imprimeDados();
        }
        else {
            Aluno aluno = (Aluno)pessoa;

            aluno.imprimeDados();
        }
    }
}
