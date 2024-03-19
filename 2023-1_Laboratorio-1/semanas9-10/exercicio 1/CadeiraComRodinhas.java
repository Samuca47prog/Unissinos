public class CadeiraComRodinhas extends Cadeira{
	private Data dataUltimaManutencao;
	
	public CadeiraComRodinhas(Cor cor, Data dataUltimaManutencao){
		super(cor);
		this.dataUltimaManutencao = dataUltimaManutencao;
	}
	
	public Data getDataUltimaManutencao(){
		return this.dataUltimaManutencao;
	}
	
	public String toString(){
		return super.toString() + " / Última manutenção: " + dataUltimaManutencao.toString();
	}
}
