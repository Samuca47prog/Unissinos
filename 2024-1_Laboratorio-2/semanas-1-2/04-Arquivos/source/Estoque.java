import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Estoque {
    private Produto[] produtos;
    private BufferedReader br;

    // ----------------------
    // Construtores

    public Estoque(Produto[] produtos){
        this.produtos = produtos;
    }

    public Estoque(String nomeArquivoEstoque){
		preencheEstoque(nomeArquivoEstoque);
	}

    // ----------------------
    // Getters e Setters

    public Produto[] getProdutos(){
		return produtos;
	}

    // ----------------------
    // Outros métodos

    public boolean preencheEstoque(String fileName){
        String delimiter = "\\s\\*\\s";

        try {
            // Leitura do arquivo
            FileReader fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            // Cria o estoque com a quantidade de produtos no arquivo
            int quantidadeProdutos = (int)br.lines().count() - 1;
            this.produtos = new Produto[quantidadeProdutos];
            br.close();

            fr = new FileReader(fileName);
			br = new BufferedReader(fr);
            String line = br.readLine(); // headers

            line = br.readLine();
            int lineIndex = 0;

            while(line != null){
                System.out.println("\n\n" + line);

                String produto=""; String descricao=""; double preco=0.0; String tipo=""; String extra="";

                try{
                    produto = line.split(delimiter)[0];
                    descricao = line.split(delimiter)[1];
                    preco = Double.parseDouble(line.split(delimiter)[2]);
                    tipo = line.split(delimiter)[3];
                    extra = line.split(delimiter)[4];
                }
                catch (Exception e){
                    System.out.println("Problem to resolve line " + lineIndex);
                }

                switch (tipo) {
                    case "Alimento":
                        produtos[lineIndex] = new Alimento(produto, descricao, preco, extra);
                    break;

                    case "Vestuario":
                        produtos[lineIndex] = new Vestuario(produto, descricao, preco, Integer.parseInt(extra));
                    break;

                    case "Eletrodomestico":
                        produtos[lineIndex] = new Eletrodomestico(produto, descricao, preco, Double.parseDouble(extra));
                    break;

                    default:
                        System.out.println("Tipo " + tipo + " não é válido. Deve ser um de ['Alimento', 'Eletrodomestico', 'Vestuario']");
                }
                
                lineIndex++;
                line = br.readLine();
            }
            br.close();

        } 
        catch (FileNotFoundException e) {
            System.out.println("Arquivo '" + fileName + "' não existe.");
        }
        catch (IOException e) {
            System.out.println("Erro na leitura do arquivo '" + fileName + "'.");
        }

        return true;
    }
}
