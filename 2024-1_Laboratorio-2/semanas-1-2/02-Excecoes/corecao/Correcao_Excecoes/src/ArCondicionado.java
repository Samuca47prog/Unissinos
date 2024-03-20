import java.io.FileNotFoundException;


public class ArCondicionado {
	private double temperaturaAtual;

	public ArCondicionado() {
		this.temperaturaAtual = 20;
	}

	@Override
	public String toString() {
		return "ArCondicionado [temperaturaAtual=" + temperaturaAtual + "]";
	}

	public double getTemperaturaAtual() {
		return temperaturaAtual;
	}
	
	public void aumentaTemperatura(double tempMais){
		try{
			this.temperaturaAtual += tempMais;
			if(temperaturaAtual < 16 || temperaturaAtual > 32)
				throw new IllegalArgumentException();
		}catch(IllegalArgumentException e){
			this.temperaturaAtual -= tempMais;
			System.out.println("Erro: temperatura inválida.\nA temperatura foi mantida em "+this.temperaturaAtual);
		}
	}
	
	public void diminuiTemperatura(double tempMenos){
		try{
			this.temperaturaAtual -= tempMenos;
			if(temperaturaAtual < 16 || temperaturaAtual > 32)
				throw new IllegalArgumentException();
		}catch(IllegalArgumentException e){
			this.temperaturaAtual += tempMenos;
			System.out.println("Erro: temperatura inválida.\nA temperatura foi mantida em "+this.temperaturaAtual);
		}
	}
	
	public void aumentaTemperatura_2(double tempMais) throws IllegalArgumentException{
		this.temperaturaAtual += tempMais;
		if(temperaturaAtual < 16 || temperaturaAtual > 32){
			this.temperaturaAtual -= tempMais;
			throw new IllegalArgumentException();
		}
	}
	
	public void diminuiTemperatura_2(double tempMenos){
		this.temperaturaAtual -= tempMenos;
		if(temperaturaAtual < 16 || temperaturaAtual > 32){
			this.temperaturaAtual += tempMenos;
			throw new IllegalArgumentException();
		}	
	}
}
