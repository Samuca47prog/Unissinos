public class Data{
	private int dia, mes, ano;
	
	// Construtores
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Setters
	public void setDia(int dia){
		this.dia = dia;
	}

	public void setMes(int mes){
		this.mes = mes;
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	// Getters
	public int getDia(){
		return dia;
	}

	public int getMes(){
		return mes;
	}

	public int getAno(){
		return ano;
	}

	// Outros métodos
	public String toString(){
		return dia + "/" + mes + "/" + ano;
	}

	public void imprimeData(){
		System.out.println(toString());
	}
}
