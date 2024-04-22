import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Campeonato {

    private TimeCampeonato[] times;

	public TimeCampeonato[] getTimes() {
		return times;
	}

	public void setTimes(TimeCampeonato[] times) {
		this.times = times;
	}

    public void leArquivo(String filename) throws IOException{
		int quantLinhas = quantLinhas(filename);
		
        // Cada linha possui 2 times, portanto teremos um array de tamanho 2x o número de linhas
		this.times = new TimeCampeonato[quantLinhas*2];

		int proximaPosicaoTime = 0;
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		//Grêmio|5|x|0|Internacional
		//   0   1 2 3      4
	
        while(line != null){
			
			String[] separada = line.split("\\s");
			
			int golsFeitosT1 = Integer.parseInt(separada[1]);
			int golsSofridosT1 = Integer.parseInt(separada[3]);
			int saldoGolsT1 = golsFeitosT1 - golsSofridosT1;
			TimeCampeonato t1 = new TimeCampeonato(separada[0], saldoGolsT1);
			
			int i=0;
			for(; i<proximaPosicaoTime; i++)
				if(times[i].getNome().equalsIgnoreCase(t1.getNome())){
					times[i].setSaldoGols(times[i].getSaldoGols() + saldoGolsT1);
					//achou = true;
					break;
				}
			
			if(i == proximaPosicaoTime)
				times[proximaPosicaoTime++] = t1;
				
			int golsFeitosT2 = Integer.parseInt(separada[3]);
			int golsSofridosT2 = Integer.parseInt(separada[1]);
			int saldoGolsT2 = golsFeitosT2 - golsSofridosT2;
			TimeCampeonato t2 = new TimeCampeonato(separada[4], saldoGolsT2);
			
			for(i=0; i<proximaPosicaoTime; i++)
				if(times[i].getNome().equalsIgnoreCase(t2.getNome())){
					times[i].setSaldoGols(times[i].getSaldoGols() + saldoGolsT2);
					//achou = true;
					break;
				}
			
			if(i == proximaPosicaoTime)
				times[proximaPosicaoTime++] = t2;
			
			line = br.readLine();
		}
		
		br.close();
		
	}

    private int quantLinhas(String filename) throws IOException{
        /*
         * Define quantas linhas há em um arquivo
         */
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		int quantLinhas = (int)br.lines().count();
		
		br.close();
		
		return quantLinhas;
	}

    public TimeCampeonato timeMaiorSaldoGols() throws IllegalArgumentException{
        if(times == null){
            throw new IllegalArgumentException();
        } 
        return timeMaiorSaldoGols(1, 0);
    }

    private TimeCampeonato timeMaiorSaldoGols(int i, int posicaoTimeMaiorSaldoGols){
        if(i > times.length || times[i] == null) {
            return times[posicaoTimeMaiorSaldoGols];
        }

        if(times[i].getSaldoGols() > times[posicaoTimeMaiorSaldoGols].getSaldoGols()){
            posicaoTimeMaiorSaldoGols = i;
        }

        return timeMaiorSaldoGols(i+1, posicaoTimeMaiorSaldoGols);
    }
}
