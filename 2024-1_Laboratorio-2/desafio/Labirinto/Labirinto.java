import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {
    private char[][] labirinto;
    private int quantColunas;
    private int quantLinhas;

    public Labirinto(String filename) {
        quantColunas = 19;
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

    public void imprimeLabirinto(int lin, int col, char posicaoAnterior) {
        int linP=0, colP=0;

        switch (posicaoAnterior) {
            case 'd':
                linP=lin; colP=col+1;
                break;
            case 'b':
                linP=lin+1; colP=col;
            break;
            case 'c':
                linP=lin-1; colP=col;
            break;
            case 'e':
                linP=lin; colP=col-1;
            break;
        
            default:
                break;
        }

        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[0].length; j++) {
                // Posição atual do cursor
                if(i==lin && j==col){
                    System.out.print('O');
                } 
                // Posição anterior do cursor
                else if(i==linP && j==colP){
                    System.out.print('.');

                 } else {
                    System.out.print(labirinto[i][j]);
                }
                    
            }
            System.out.println("");
        }
    }

    public char getPosition(int lin, int col) {
        if(lin<0 || lin>quantLinhas-1 || col<0 || col>quantColunas-1)
            return 'X';

        return labirinto[lin][col];
    }

    public boolean percorreLabirinto() {
        return percorreLabirinto3(0, 0, 'e');
    }

    private boolean percorreLabirinto(int lin, int col, char previous) {
        imprimeLabirinto(lin, col);


        // é o destino?
        if (getPosition(lin, col) == 'D') {
            return true;
        } 

        if(lin+1>=quantLinhas) return percorreLabirinto(lin-1, col, 'b');
        if(col+1>=quantColunas) return percorreLabirinto(lin, col-1, 'd');
        if(lin-1<0) return percorreLabirinto(lin+1, col, 'c');
        if(col-1<0) return percorreLabirinto(lin, col+1, 'e');

        // direita
        if ((col+1)<=quantColunas && previous!='d')
            if(getPosition(lin, col + 1) != 'X')
                return percorreLabirinto(lin, col + 1, 'e');

        // baixo
        if ((lin+1)<=quantLinhas && previous!='b')
            if(getPosition(lin + 1, col) != 'X')
                return percorreLabirinto(lin + 1, col, 'c');

        // cima
        if((lin-1)>=0 && previous!='c')
            if(getPosition(lin-1, col) != 'X')
                return percorreLabirinto(lin-1, col, 'b');

        // esquerda
        if ((col-1)>=0 && previous!='e')
        if(getPosition(lin, col-1) != 'X')
            return percorreLabirinto(lin, col-1, 'd');

        return false;
    }

    private boolean percorreLabirinto2(int lin, int col, char posicaoAnterior) {

        // ---------------------------------------
        // Na posição atual, onde eu estou?
        imprimeLabirinto(lin, col, posicaoAnterior);

        // -- é o destino?
        if (getPosition(lin, col) == 'D') {
            return true;
        } 

        // ---------------------------------------
        // Na posição atual, estou nos limites do labirinto?

        String movimentosPermitidos = "";

        // -- se mover na direção dbce, ainda fica dentro do limite do labirinto e não é um X?
        // direita
        if(col+1<=quantColunas-1)
            if(getPosition(lin, col+1) != 'X')
                movimentosPermitidos += "d";
        // baixo
        if(lin+1<=quantLinhas-1) 
            if(getPosition(lin+1, col) != 'X')
                movimentosPermitidos += "b";
        // cima
        if(lin-1>0) 
            if(getPosition(lin-1, col) != 'X')
                movimentosPermitidos += "c";
        // esquerda
        if(col-1>0) 
            if(getPosition(lin, col-1) != 'X') 
                movimentosPermitidos += "e";

        // -- não vale mover para onde veio
        String posicaoAnteriorAsStr = "" + posicaoAnterior;
        movimentosPermitidos = movimentosPermitidos.replace(posicaoAnteriorAsStr, "");

        System.out.println("Movimentos permitidos: " + movimentosPermitidos);
        System.out.println("\n");

        // ---------------------------------------
        // Se movendo pelo labirinto

        // direita
        if (movimentosPermitidos.contains("d"))
            return percorreLabirinto2(lin, col+1, 'e');

        // cima
        if(movimentosPermitidos.contains("c"))
            return percorreLabirinto2(lin-1, col, 'b');

        // baixo
        if (movimentosPermitidos.contains("b"))
            return percorreLabirinto2(lin+1, col, 'c');

        // esquerda
        if (movimentosPermitidos.contains("e"))
            return percorreLabirinto2(lin, col-1, 'd');

        return false;
    }


    private boolean percorreLabirinto3(int lin, int col, char posicaoAnterior) {

        // ---------------------------------------
        // Na posição atual, onde eu estou?
        imprimeLabirinto(lin, col, posicaoAnterior);

        // -- é o destino?
        if (getPosition(lin, col) == 'D') {
            return true;
        } 

        // ---------------------------------------
        // Na posição atual, estou nos limites do labirinto?

        String movimentosPermitidos = "";

        // -- se mover na direção dbce, ainda fica dentro do limite do labirinto e não é um X?
        // direita
        if(col+1<=quantColunas)
            if(getPosition(lin, col+1) != 'X')
                movimentosPermitidos += "d";
        // baixo
        if(lin+1<=quantLinhas) 
            if(getPosition(lin+1, col) != 'X')
                movimentosPermitidos += "b";
        // cima
        if(lin>0) 
            if(getPosition(lin-1, col) != 'X')
                movimentosPermitidos += "c";
        // esquerda
        if(col-1>0) 
            if(getPosition(lin, col-1) != 'X') 
                movimentosPermitidos += "e";

        // -- não vale mover para onde veio
        String posicaoAnteriorAsStr = "" + posicaoAnterior;
        movimentosPermitidos = movimentosPermitidos.replace(posicaoAnteriorAsStr, "");

        System.out.println("Movimentos permitidos: " + movimentosPermitidos);
        System.out.println("\n");

        // ---------------------------------------
        // Se movendo pelo labirinto
        boolean chegouNoDestino=false;

        // direita
        if (movimentosPermitidos.contains("d") && !chegouNoDestino)
            chegouNoDestino = percorreLabirinto3(lin, col+1, 'e');

        // cima
        if(movimentosPermitidos.contains("c") && !chegouNoDestino)
            chegouNoDestino = percorreLabirinto3(lin-1, col, 'b');

        // baixo
        if (movimentosPermitidos.contains("b") && !chegouNoDestino)
            chegouNoDestino = percorreLabirinto3(lin+1, col, 'c');

        // esquerda
        if (movimentosPermitidos.contains("e") && !chegouNoDestino)
            chegouNoDestino = percorreLabirinto3(lin, col-1, 'd');        
        

        return chegouNoDestino;
    }

}
