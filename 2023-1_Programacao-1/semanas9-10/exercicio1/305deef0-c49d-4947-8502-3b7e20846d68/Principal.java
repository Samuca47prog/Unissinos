public class Principal{
    public static void main(String[] args){
        Banana b = new Banana("Caturra", 10, "Comestível");
        Melancia m = new Melancia("Cléber", 23, 13, false);
        Programador p = new Programador("José", 5, "C++");
        Aluno a = new Aluno("Pedrinho", 23, 6);
        
        System.out.println("Preço da banana "+b.getNome()+": R$"+b.calculaPreco(90.0));
        System.out.println("Preço da melancia "+m.getNome()+": R$"+m.calculaPrecoFinal());
        System.out.println("Dados do programador:");
        p.imprimeDados();
        System.out.println("Dados do aluno:");
        a.imprimeDados();
    }
}