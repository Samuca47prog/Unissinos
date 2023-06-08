public class BancaDeChurros {
    private Churro[] churros;

    // Construtores
    public BancaDeChurros(Churro[] churros){
        this.churros = churros;
    }

    public BancaDeChurros(int quantidadeDeChurros){
        churros = new Churro[quantidadeDeChurros];
    }

    // Outros métodos
    public int estoqueChurros(String saborBuscado){
        int quantidadeChurrosDoSabor = 0;

        for(Churro c : churros){
            if(c != null && c.getSabor().equals(saborBuscado)){
                quantidadeChurrosDoSabor += 1;
            }
        }

        return quantidadeChurrosDoSabor;
    }

    public boolean insereChurro(Churro churro){
        for(int i=0; i<this.churros.length; i++){
            if(this.churros[i] == null){
                this.churros[i] = churro;
                return true;
            }
        }
        return false;
    }

    public double valorTotal(){
        int somaPrecos = 0;

        for(Churro c : churros){
            if(c != null){
                somaPrecos += c.getPreco();
            }
        }

        return somaPrecos;
    }

    public boolean vendeChurros(String sabor){
        for(int i=0; i<this.churros.length; i++){
            if(this.churros[i] != null && this.churros[i].getSabor().equals(sabor)){
                // Churros vendido
                System.out.println("CHURROS VENDIDO - " + this.churros[i].toString());
                this.churros[i] = null;
                return true;
            }
        }
        System.out.println("CHURROS de " + sabor + " NÃO vendido por estar em falta no estoque");
        return false;
    }

    public void imprimeChurros(){
        System.out.println("\n\t Imprimindo churros na banca: ");
        for(Churro c : this.churros){
            if(c != null){
                System.out.println(c);
            }
        }
    }

    public void lePedidos(String nomeCliente, String saborDesejado, int quantidadeChurrosDoSabor){
        int quantidadeChurrosVendidos = 0;

        for(int i=0; i<quantidadeChurrosDoSabor; i++){
            if(vendeChurros(saborDesejado)){
                quantidadeChurrosVendidos += 1;
                System.out.print((i+1) + " Churro vendido ---> ");
            }
            else{
                System.out.print((i+1) + " Churro não vendido ---> ");
            }
        }

        System.out.println("\nForam vendidos " + quantidadeChurrosVendidos + " dos " + quantidadeChurrosDoSabor + " pedidos");
    }
}
