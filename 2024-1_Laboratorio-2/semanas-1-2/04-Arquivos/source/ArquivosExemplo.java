import java.io.*;

public class ArquivosExemplo {

    public void PrintarConteudoArquivo(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader in = new BufferedReader(fr);

            String line = in.readLine();
            System.out.println("Headers: " + line);

            line = in.readLine();
            while(line != null){
                System.out.println(line);
                line = in.readLine();
            }
            in.close();

        } 
        catch (FileNotFoundException e) {
            System.out.println("Arquivo '" + fileName + "' não existe.");
        }
        catch (IOException e) {
            System.out.println("Erro na leitura do arquivo '" + fileName + "'.");
        }
    }

    public void EscreverConteudoArquivo(String fileName) {
        try {
            File f = new File("hino.txt");
            FileWriter fr = new FileWriter(f);
            PrintWriter out = new PrintWriter(fr);
    
            out.println("Até a pé nós iremos...");
            out.println("Para o que der e vier...");
            out.println("Mas o que importa é que nós estaremos...");
            out.println("Com o Grêmio onde o Grêmio estiver!...");
    
            out.close();
        }
        catch (IOException e){
            System.out.println("Erro ao escrever o arquivo");
        }
        
    }
    
    public static void main(String[] args) {
        ArquivosExemplo ae = new ArquivosExemplo();

        ae.PrintarConteudoArquivo("source/produtos.txt");

        ae.EscreverConteudoArquivo("source/hino.txt");
    }
}