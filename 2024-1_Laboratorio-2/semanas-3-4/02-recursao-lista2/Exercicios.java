public class Exercicios {

    /*
     * Exercício 1. 
     * Crie um método recursivo que recebe um array de inteiros e um
        inteiro N e retorna verdadeiro caso o inteiro N esteja presente no array, ou
        falso caso contrário.
     */
    public boolean exercicio1(int[] array, int n) throws IllegalArgumentException{
        if(array == null) throw new IllegalArgumentException();
        return checkValueInArray(array, n, 0);
    }

    private boolean checkValueInArray(int[] array, int n, int i){
        if(i >= array.length) return false;
        if(array[i] == n) return true;
        return checkValueInArray(array, n, i+1);
    }

    /*
     * Exercício 2. 
     * Crie um método recursivo que recebe um inteiro N por
        parâmetro e retorna verdadeiro caso ele seja um número primo e falso caso
        contrário.
     */
    public boolean exercicio2(int n) throws IllegalArgumentException{
        if(n < 2) throw new IllegalArgumentException();
        return checkPrimeNumber(n, 2);
    }

    private boolean checkPrimeNumber(int num, int divisor) {
        if (divisor * divisor > num) return true; // If divisor^2 > num, num is prime
        if (num % divisor == 0) return false; // If num is divisible by divisor, it's not prime
        return checkPrimeNumber(num, divisor+1);
    }


    /*
     * Exercício 3. 
     * Crie um método recursivo que recebe uma String e retorna uma
        nova String, que é a String de entrada invertida.
     */
    public String exercicio3(String s){
        if (s == null || s.length() <= 1) {
            return s;
        }
        return invertString(s, 0);
    }

    private String invertString(String s, int i){
        if(i >= s.length()) return "";
        return invertString(s, i+1) + s.charAt(i);
    }


    /*
     * Exercício 4. 
     * Crie um método recursivo que recebe um inteiro positivo (e
        maior que 0) N e calcula o seguinte: 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/N.
     */
    public double exercicio4(int n) throws IllegalArgumentException{
        if(n < 0) throw new IllegalArgumentException();
        return sumFractions(n, 1);
    }

    private double sumFractions(int n, double i){
        if(i >= n) return 1/i;
        return 1/i + sumFractions(n, i+1);
    }


    /*
     * Exercício 5. 
     * Crie um método recursivo que retorna verdadeiro caso uma
        String recebida por parâmetro seja um palíndromo e falso caso contrário.
        Um palíndromo é um texto que, desconsiderando espaços, pontuação e
        acentuação, pode ser lido da mesma forma tanto de frente pra trás quanto
        de trás para frente. Por exemplo:
        • Ana• Renner
        • O teu dueto
        • Eva, asse essa ave
        • Seco de raiva, coloco no colo caviar e doces
        • Fica facil escrever palindromos com nomes proprios, como fazem
        Mezaf Omocso, Irporp Semon, Mocs Omord, Nila Prevercs e Lica
        Facif
        No seu método público, antes de chamar o método privado, você deve
        remover pontuações (exclamações, pontos de interrogação, pontos finais e
        vírgulas) e espaços, para então chamar o método privado. Você pode assumir
        que o texto de entrada não possuirá acentos.
     */
    public boolean exercicio5(String s){
        String newS = s.replaceAll("\\s", "").toLowerCase();
        return checkPalimdrome(newS, 0, s.length()-1);
    }

    private boolean checkPalimdrome(String s, int inicio, int fim){
        if(inicio >= s.length()/2) return true;
        if(s.charAt(inicio) != s.charAt(fim)) return false;
        return checkPalimdrome(s, inicio+1, fim-1);
    }

}