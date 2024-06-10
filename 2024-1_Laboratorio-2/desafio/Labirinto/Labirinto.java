import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {
    private char[][] labirinto;

    public Labirinto(String filename){
        criaLabirinto(filename);
    }

    public void criaLabirinto(String filename){
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            int quantLinhas=0;
            while (br.readLine() != null) {
                quantLinhas++;
            }



            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            this.labirinto = new char[quantLinhas][18];

            String linha;
            int i=0;
            while ((linha = br.readLine()) != null) {
                this.labirinto[i] = linha.toCharArray();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imprimeLabirinto(){
        for(int i=0; i<labirinto.length; i++){
            for(int j=0; j<labirinto[0].length; j++){
                System.out.print(labirinto[i][j]);
            }
            System.out.println("");
        }
    }
}
