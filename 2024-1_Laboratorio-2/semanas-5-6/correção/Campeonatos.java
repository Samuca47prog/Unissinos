import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Campeonatos {
	private TimeCampeonatos[] times;

	public TimeCampeonatos[] getTimes() {
		return times;
	}

	public void setTimes(TimeCampeonatos[] times) {
		this.times = times;
	}
	
	public void leArquivo(String filename) throws IOException{
		int quantLinhas = quantLinhas(filename);
		
		times = new TimeCampeonatos[quantLinhas*2];
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
			TimeCampeonatos t1 = new TimeCampeonatos(separada[0], saldoGolsT1);
			
			//boolean achou = false;
			int i=0;
			for(; i<proximaPosicaoTime; i++)
				if(times[i].getNome().equalsIgnoreCase(t1.getNome())){
					times[i].setSaldoGols(times[i].getSaldoGols() + saldoGolsT1);
					//achou = true;
					break;
				}
			
			if(i == proximaPosicaoTime)
				times[proximaPosicaoTime++] = t1;
			
			/*if(!achou)
				times[proximaPosicaoTime++] = t1;*/
				
			int golsFeitosT2 = Integer.parseInt(separada[3]);
			int golsSofridosT2 = Integer.parseInt(separada[1]);
			int saldoGolsT2 = golsFeitosT2 - golsSofridosT2;
			TimeCampeonatos t2 = new TimeCampeonatos(separada[4], saldoGolsT2);
			
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
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		int quantLinhas = (int)br.lines().count();
		
		br.close();
		
		return quantLinhas;
	}
	
	public TimeCampeonatos timeMaiorSaldoGols() throws IllegalArgumentException{
		if(times == null) throw new IllegalArgumentException();
		return timeMaiorSaldoGols(1, 0);
	}
	
	private TimeCampeonatos timeMaiorSaldoGols(int i, int posicaoTimeMaiorSaldoGols){
		if(i >= times.length || times[i] == null) return times[posicaoTimeMaiorSaldoGols];
		
		if(times[i].getSaldoGols() > times[posicaoTimeMaiorSaldoGols].getSaldoGols())
			posicaoTimeMaiorSaldoGols = i;

		return timeMaiorSaldoGols(i+1, posicaoTimeMaiorSaldoGols);
	}
}





