import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("source/produtos.txt");

        System.out.println("\n\n\n PRINCIPAL \n\n\n");

        // Primeiro encontra os iniciais
        Alimento alimentoMaisCaro = null;
        Eletrodomestico eletrodomestioMaisBarato = null;
        int quantidadeVestuarioEmEstoque = 0;

        boolean primeiroAlimentoEncontrado = false;
        boolean primeiroEletroEncontrado = false;
        for (Produto p : estoque.getProdutos()) {
            if(p instanceof Alimento && !primeiroAlimentoEncontrado){
                alimentoMaisCaro = (Alimento)p;
                primeiroAlimentoEncontrado = true;
            }
    
            if(p instanceof Eletrodomestico && !primeiroEletroEncontrado){
                eletrodomestioMaisBarato = (Eletrodomestico)p;
                primeiroEletroEncontrado = true;
            }
        }

        // Procura mais caros, mais baratos e totais
        for (Produto p : estoque.getProdutos()) {
            System.out.println(p + "\n");

            if(p instanceof Alimento && alimentoMaisCaro != null){
                if ((alimentoMaisCaro.getPreco() < p.getPreco())) {
                    alimentoMaisCaro = (Alimento)p;
                }
            }

            if(p instanceof Eletrodomestico && eletrodomestioMaisBarato != null){
                if ((eletrodomestioMaisBarato.getPreco() > p.getPreco())) {
                    eletrodomestioMaisBarato = (Eletrodomestico)p;
                }
            }

            if(p instanceof Vestuario){
                quantidadeVestuarioEmEstoque += ((Vestuario)p).getQuantidadeEmEstoque();
            }
        }

        // Reporte final
        System.out.println("\n\n\n RELATÓRIO FINAL \n\n\n");

        String gravaArquivo="";
        String msg ="";

        if(alimentoMaisCaro != null){
            msg = "Alimento mais caro: " + alimentoMaisCaro.toString();
            System.out.println(msg);
            gravaArquivo += msg + "\n\n";
        }
        else{
            msg = "Nenhum alimento encontrado no estoque.";
            System.out.println(msg);
            gravaArquivo += msg + "\n\n";
        }


        msg = "Quantidade vestuário em estoque: " + quantidadeVestuarioEmEstoque;
        System.out.println(msg);
        gravaArquivo += msg + "\n\n";

        if(eletrodomestioMaisBarato != null){
            msg = "Eletrodoméstico mais barato: " + eletrodomestioMaisBarato.toString();
            System.out.println(msg);
            gravaArquivo += msg + "\n\n";
        }
        else{
            msg = "Nenhum eletrodoméstico encontrado no estoque.";
            System.out.println(msg);
            gravaArquivo += msg + "\n\n";
        }


        // Escreve no arquivo
        FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			 fw = new FileWriter("info.txt");
			 pw = new PrintWriter(fw);
			 
			 pw.write(gravaArquivo);
			 
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally{
			pw.close();
		}
    }
}
