public class Exercicios {
    public static void main(String[] args) {
        StaticList<Integer> lista = new StaticList<Integer>(10);
        StaticList<Integer> lista2 = new StaticList<Integer>(10);

        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(-3);

        lista2.add(1);
        lista2.add(1);
        lista2.add(1);
        
        System.out.println(lista.toString());

        imprimeTitulo("Exercício 1");
        System.out.println(lista.contaElementos(2));

        imprimeTitulo("Exercício 2");
        System.out.println(contaNegativos(lista));

        imprimeTitulo("Exercício 3");
        removePrimos(lista);
        System.out.println(lista.toString());

        imprimeTitulo("Exercício 4");
        System.out.println(exercicio4(lista, lista2));






        // Criação de um objeto Eletrodomestico
        Eletrodomestico eletrodomestico = new Eletrodomestico("Samsung", 220, 1500.0);

        // Exibindo informações do eletrodoméstico
        System.out.println(eletrodomestico);

        StaticList<Eletrodomestico> eletros = new StaticList<Eletrodomestico>(10);

         // Adicionando 6 eletrodomésticos à lista
         eletros.add(new Eletrodomestico("Samsung", 220, 1500.0));
         eletros.add(new Eletrodomestico("LG", 110, 1800.0));
         eletros.add(new Eletrodomestico("Philips", 220, 1300.0));
         eletros.add(new Eletrodomestico("Electrolux", 110, 2000.0));
         eletros.add(new Eletrodomestico("Brastemp", 220, 2500.0));
         eletros.add(new Eletrodomestico("Consul", 110, 900.0));

        // Exibindo informações atualizadas do eletrodoméstico
        imprimeTitulo("Exercício 5");
        System.out.println(contaEletrodomesticosCaros(eletros, 1500.0));

    }




    public static void imprimeTitulo(String titulo){
        System.out.println("\n\n\n-----------");
        System.out.println("\t" + titulo);
        System.out.println("-----------");
    }

    /**
	 * Retorna a quantidade de elementos negativos encontrado na lista.
	 */
	// exercício 2
	public static int contaNegativos (List<Integer> lista) {
		return contaNegativos(lista, 0, lista.numElements()-1, 0);
	}
	
	private static int contaNegativos(List<Integer> lista, int inicio, int fim, int cont) {
		if(inicio > fim) {
			return cont;
		}
		if(lista.get(inicio) < 0) {
			inicio++;
			cont++;
			return contaNegativos(lista, inicio,fim, cont);
		}
		inicio++;
		return contaNegativos(lista, inicio, fim, cont);
	}

    /**
	 * Retorna true se número for primo.
	 */
	// exercício 3 a
    public static boolean isPrimo(int number) {
        // Check if the number is less than 2 (not prime)
        if (number < 2) {
            return false;
        }

        // Check for divisors from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        // No divisors found, the number is prime
        return true;
    }

    /**
	 * remove os números primos da lista
	 */
	// exercício 3 b
    public static void removePrimos (List<Integer> lista){
        for(int i=0; i<lista.numElements(); i++){
            if(isPrimo(lista.get(i)))
                lista.remove(i);
        }
    }

    /**
	 * soma os valores de duas listas
	 */
	// exercício 4
    public static int exercicio4(List<Integer> lista1, List<Integer> lista2) throws UnderflowException{
		if(lista1.isEmpty() || lista1 == null || lista2 == null || lista2.isEmpty()) throw new UnderflowException();
		return exercicio4(lista1, lista2, 0,0,0);
	}
	
	private static int exercicio4(List<Integer> lista1, List<Integer> lista2, int soma, int i, int j) {
		if(i < lista1.numElements()) {
			soma += lista1.get(i);
			i++;
			return exercicio4(lista1, lista2, soma, i, j);
			
		} else if (j < lista2.numElements()){
			soma += lista2.get(j);
			j++;
			return exercicio4(lista1, lista2, soma, i, j);
		}
		return soma;
	}


    public static int contaEletrodomesticosCaros(List<Eletrodomestico> eletros, double valorLimite){
        int cont=0;
        for(int i=0; i < eletros.numElements(); i++) {
            if (eletros.get(i).getPreco() > valorLimite) {
                cont++;
            }
        }
        return cont;
    }
}
