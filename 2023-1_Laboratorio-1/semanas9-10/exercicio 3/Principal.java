public class Principal {
    public static void main(String[] args){

        Aluno a1 = new Aluno(
            "Samuel",
            new GrauA(
                "01/01/2023",
                "01/02/2023",
                7,
                8),
            new GrauB(
                "01/01/2023",
                "01/02/2023",
                7,
                8,
                9)
            );

        Aluno a2 = new Aluno(
            "Rafaela",
            new GrauA(
                "01/01/2023",
                "01/02/2023",
                10,
                10),
            new GrauB(
                "01/01/2023",
                "01/02/2023",
                10,
                10,
                10)
            );

        Aluno a3 = new Aluno(
            "João",
            new GrauA(
                "01/01/2023",
                "01/02/2023",
                5,
                4),
            new GrauB(
                "01/01/2023",
                "01/02/2023",
                6,
                4,
                6)
            );

        Turma turma = new Turma(
            "TURMA001",
            a1,
            a2,
            a3
            );

        System.out.println("Média notas da turma: " + turma.mediaNotasTurma());

        if(a1.calculaNotaFinal() >= 6.0){
            System.out.println("Aluno " + a1.getNome() + ": Passou por média!");
        }
        else{
            System.out.println("Aluno " + a1.getNome() + ": Ficou em Grau C.");
        }

        if(a2.calculaNotaFinal() >= 6.0){
            System.out.println("Aluno " + a2.getNome() + ": Passou por média!");
        }
        else{
            System.out.println("Aluno " + a2.getNome() + ": Ficou em Grau C.");
        }

        if(a3.calculaNotaFinal() >= 6.0){
            System.out.println("Aluno " + a3.getNome() + ": Passou por média!");
        }
        else{
            System.out.println("Aluno " + a3.getNome() + ": Ficou em Grau C.");
        }
    }
}
