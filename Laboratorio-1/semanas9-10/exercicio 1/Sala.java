public class Sala{
	private String nome;
	private Cadeira cadeira1, cadeira2, cadeira3, cadeira4;
	
	public Sala(String nome, Cadeira cadeira1, Cadeira cadeira2, Cadeira cadeira3, Cadeira cadeira4){
		this.nome = nome;
		this.cadeira1 = cadeira1;
		this.cadeira2 = cadeira2;
		this.cadeira3 = cadeira3;
		this.cadeira4 = cadeira4;
	}
	
	public String toString(){
		return "Sala '" + nome + "'" + 
			   "\nCadeira 1: " + cadeira1.toString() + 
			   "\nCadeira 2: " + cadeira2.toString() + 
			   "\nCadeira 3: " + cadeira3.toString() + 
			   "\nCadeira 4: " + cadeira4.toString();
			   
	}
	
	//Retorna a quantidade de cadeiras disponíveis (de qualquer tipo)
	public int cadeirasDisponiveis(){
		int livres = 0;
		
		if(cadeira1.getAluno() == null) livres++;
		if(cadeira2.getAluno() == null) livres++;
		if(cadeira3.getAluno() == null) livres++;
		if(cadeira4.getAluno() == null) livres++;
		
		return livres;
	}

	//Retorna a quantidade de cadeiras com rodinhas disponíveis
	public int cadeirasComRodinhasDisponiveis(){
		int livres = 0;

		if(cadeira1 instanceof CadeiraComRodinhas && cadeira1.getAluno() == null) livres++;
		if(cadeira2 instanceof CadeiraComRodinhas && cadeira2.getAluno() == null) livres++;
		if(cadeira3 instanceof CadeiraComRodinhas && cadeira3.getAluno() == null) livres++;
		if(cadeira4 instanceof CadeiraComRodinhas && cadeira4.getAluno() == null) livres++;
		
		return livres;
	}

	//Retorna a quantidade de cadeiras com mesa disponíveis
	public int cadeirasComMesaDisponiveis(){
		int livres = 0;

		if(cadeira1 instanceof CadeiraComMesa && cadeira1.getAluno() == null) livres++;
		if(cadeira2 instanceof CadeiraComMesa && cadeira2.getAluno() == null) livres++;
		if(cadeira3 instanceof CadeiraComMesa && cadeira3.getAluno() == null) livres++;
		if(cadeira4 instanceof CadeiraComMesa && cadeira4.getAluno() == null) livres++;
		
		return livres;
	}

	/**
	 * Crie um método chamado entraAluno, que recebe um objeto	do tipo Aluno e uma String que
	 * representa o tipo de cadeira que ele quer sentar por parâmetro.
	 * O parâmetro do tipo de cadeira terá dois valores: “mesa” ou “rodinha”. Assim sendo, o método
	 * deve colocar o aluno recebido por parâmetro em uma cadeira do tipo desejado. Caso não tenha
	 * cadeira do tipo desejado disponível, o aluno deve sentar em uma cadeira de outro tipo que
	 * estiver disponível. O método retorna a cadeira que o aluno sentou ou null caso não haja cadeiras
	 * disponíveis.
	**/
	public Cadeira entraAluno(Aluno aluno, String tipoCadeira){
		//se não há cadeiras disponíveis, não temos como incluir o aluno
		if(cadeirasDisponiveis() == 0){
			return null;
			
		} else{
			//se é cadeira com mesa e tem uma sobrando, inclui aluno
			if(tipoCadeira.equals("mesa") && cadeirasComMesaDisponiveis() > 0){
				System.out.println(" -- Alocando aluno na cadeira de preferência...");
				return incluiAlunoCadeiraMesa(aluno);
				
			} else if(tipoCadeira.equals("mesa")){
				//se não tem cadeiras com mesas disponíveis, inclui na mesa com rodinha
				System.out.println(" -- Alocando aluno na cadeira disponível...");
				return incluiAlunoCadeiraRodinha(aluno);
			}
			
			//se é cadeira com rodinha e tem uma sobrando, inclui aluno
			if(tipoCadeira.equals("rodinha") && cadeirasComRodinhasDisponiveis() > 0){
				System.out.println(" -- Alocando aluno na cadeira de preferência...");
				return incluiAlunoCadeiraRodinha(aluno);
				
			} else if(tipoCadeira.equals("rodinha")){
				//se não tem cadeiras com rodinha disponíveis, inclui na mesa com mesas
				System.out.println(" -- Alocando aluno na cadeira disponível...");
				return incluiAlunoCadeiraMesa(aluno);
			}
		}
		return null;
	}
	
	//Inclui o aluno passado como parâmetro na primeira cadeira com mesa que estiver disponível
	public Cadeira incluiAlunoCadeiraMesa(Aluno aluno){
		if(cadeira1 instanceof CadeiraComMesa && cadeira1.getAluno() == null){
			cadeira1.setAluno(aluno);
			return cadeira1;
			
		} else if(cadeira2 instanceof CadeiraComMesa && cadeira2.getAluno() == null){
			cadeira2.setAluno(aluno);
			return cadeira2;
			
		} else if(cadeira3 instanceof CadeiraComMesa && cadeira3.getAluno() == null){
			cadeira3.setAluno(aluno);
			return cadeira3;
			
		} else if(cadeira4 instanceof CadeiraComMesa && cadeira4.getAluno() == null){
			cadeira4.setAluno(aluno);
			return cadeira4;
		}  
		
		return null;
	}
	
	//Inclui o aluno passado como parâmetro na primeira cadeira com rodinhas que estiver disponível
	public Cadeira incluiAlunoCadeiraRodinha(Aluno aluno){
		if(cadeira1 instanceof CadeiraComRodinhas && cadeira1.getAluno() == null){
			cadeira1.setAluno(aluno);
			return cadeira1;
			
		} else if(cadeira2 instanceof CadeiraComRodinhas && cadeira2.getAluno() == null){
			cadeira2.setAluno(aluno);
			return cadeira2;
			
		} else if(cadeira3 instanceof CadeiraComRodinhas && cadeira3.getAluno() == null){
			cadeira3.setAluno(aluno);
			return cadeira3;
			
		} else if(cadeira4 instanceof CadeiraComRodinhas && cadeira4.getAluno() == null){
			cadeira4.setAluno(aluno);
			return cadeira4;
		}  
		
		return null;
	}
	
	//Imprima a área de todas as mesas acopladas nas cadeiras que possuem mesa
	public void exibeAreaMesas(){
		double area = 0;
		if(cadeira1 instanceof CadeiraComMesa){
			area = ((CadeiraComMesa)cadeira1).getLargura() * ((CadeiraComMesa)cadeira1).getProfundidade();
			System.out.println("Cadeira com mesa localizada. Com " + area + "cm² de área.");
		}
		
		if(cadeira2 instanceof CadeiraComMesa){
			area = ((CadeiraComMesa)cadeira2).getLargura() * ((CadeiraComMesa)cadeira2).getProfundidade();
			System.out.println("Cadeira com mesa localizada. Com " + area + "cm² de área.");
		}

		if(cadeira3 instanceof CadeiraComMesa){
			area = ((CadeiraComMesa)cadeira3).getLargura() * ((CadeiraComMesa)cadeira3).getProfundidade();
			System.out.println("Cadeira com mesa localizada. Com " + area + "cm² de área.");
		}

		if(cadeira4 instanceof CadeiraComMesa){
			area = ((CadeiraComMesa)cadeira4).getLargura() * ((CadeiraComMesa)cadeira4).getProfundidade();
			System.out.println("Cadeira com mesa localizada. Com " + area + "cm² de área.");
		}
		
		if(area == 0){
			System.out.println("Nenhuma cadeira com mesa localizada");
		}
	}
	
	//Imprima a data da última manutenção de cada cadeira com rodinhas presente na sala
	public void exibeDataUltimaManutencao(){
		Data data = null;
		
		if(cadeira1 instanceof CadeiraComRodinhas){
			data = ((CadeiraComRodinhas)cadeira1).getDataUltimaManutencao();
			System.out.println("Cadeira com rodinhas localizada, data da última manutenção: " + data.toString());
		}

		if(cadeira2 instanceof CadeiraComRodinhas){
			data = ((CadeiraComRodinhas)cadeira2).getDataUltimaManutencao();
			System.out.println("Cadeira com rodinhas localizada, data da última manutenção: " + data.toString());
		}
		
		if(cadeira3 instanceof CadeiraComRodinhas){
			data = ((CadeiraComRodinhas)cadeira3).getDataUltimaManutencao();
			System.out.println("Cadeira com rodinhas localizada, data da última manutenção: " + data.toString());
		}
		
		if(cadeira4 instanceof CadeiraComRodinhas){
			data = ((CadeiraComRodinhas)cadeira4).getDataUltimaManutencao();
			System.out.println("Cadeira com rodinhas localizada, data da última manutenção: " + data.toString());
		}
		
		if(data == null){
			System.out.println("Nenhuma cadeira com rodinhas localizada");
		}
	}

	//Verifica se um aluno  está em algma cadeira e retorna a cadeira onde ele está
	public Cadeira localizarAluno(String nome){
		if(cadeira1 != null && cadeira1.getAluno().getNome().equals(nome)) return cadeira1;
		if(cadeira2 != null && cadeira2.getAluno().getNome().equals(nome)) return cadeira2;
		if(cadeira3 != null && cadeira3.getAluno().getNome().equals(nome)) return cadeira3;
		if(cadeira4 != null && cadeira4.getAluno().getNome().equals(nome)) return cadeira4;
		return null;
	}

}
