import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {
    private char[][] labirinto;
    private int quantColunas;
    private int quantLinhas;

    public Labirinto(String filename) {
        quantColunas = 18;
        criaLabirinto(filename);
    }

    public Labirinto(){
        labirinto = new char[][]
        {{' ','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
        {' ',' ',' ',' ',' ',' ',' ',' ','X','X','X','X','X','X','X','X','X','X'},
        {'X','X','X',' ','X',' ','X',' ','X','X','X',' ',' ',' ',' ','X','X','X'},
        {'X','X','X','X',' ',' ','X',' ','X','X','X',' ','X','X',' ','X','X','X'},
        {'X','X','X','X','X','X','X',' ','X','X','X',' ','X','X',' ',' ','X','X'},
        {'X','X','X','X','X','X','X',' ',' ',' ',' ',' ','X',' ','X',' ','X','X'},
        {'X','X','X','X','X','X','X','X',' ','X','X',' ','X',' ',' ',' ',' ',' '},
        {'X','X','X','X','X','X','X','X',' ',' ',' ',' ','X',' ',' ','X','X','D'}};

        quantColunas = labirinto[0].length;
        quantLinhas = labirinto.length;
    }

    public void criaLabirinto(String filename) {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            quantLinhas = 0;
            while (br.readLine() != null) {
                quantLinhas++;
            }

            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            this.labirinto = new char[quantLinhas][quantColunas];

            String linha;
            int i = 0;
            while ((linha = br.readLine()) != null) {
                this.labirinto[i] = linha.toCharArray();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imprimeLabirinto() {
        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[0].length; j++) {
                System.out.print(labirinto[i][j]);
            }
            System.out.println("");
        }
        System.out.println();
    }

    public void imprimeLabirinto(int lin, int col) {
        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[0].length; j++) {
                if(i==lin && j==col)
                    System.out.print('O');
                else
                    System.out.print(labirinto[i][j]);
            }
            System.out.println("");
        }
        System.out.println();
    }

    public char getPosition(int lin, int col) {
        return labirinto[lin][col];
    }

    public boolean percorreLabirinto() {
        return percorreLabirinto(0, 0, 'e');
    }

    private boolean percorreLabirinto(int lin, int col, char previous) {
        imprimeLabirinto(lin, col);

        // // ajusta caso esteja fora dos limites
        
        // é uma posição proibida?
        if (getPosition(lin, col) == 'X')
            return false;

        // é o destino?
        if (getPosition(lin, col) == 'D') {
            return true;
        } 
        

        // baixo
        if ((lin+1)<=quantLinhas && previous!='b')
            if(getPosition(lin + 1, col) != 'X')
                return percorreLabirinto(lin + 1, col, 'c');

        // direita
        if ((col+1)<=quantColunas && previous!='d')
            if(getPosition(lin, col + 1) != 'X')
                return percorreLabirinto(lin, col + 1, 'e');

        // esquerda
        if ((col-1)>=0 && previous!='e')
            if(getPosition(lin, col-1) != 'X')
                return percorreLabirinto(lin, col-1, 'd');

        // cima
        if((lin-1)>=0 && previous!='c')
            if(getPosition(lin-1, col) != 'X')
                return percorreLabirinto(lin-1, col, 'b');

        return false;
    }
}
