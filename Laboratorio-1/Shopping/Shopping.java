import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtores
    public Shopping(String nome, Endereco endereco, int maxNumeroLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxNumeroLojas];
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    // Outros métodos
    public String toString(){
        return  "Shopping " + nome + "\n" +
                "Endereço: " + endereco.toString() + "\n" +
                "Lojas: " + Arrays.toString(lojas);
    }

    // Métodos relacionados com arrays
    public boolean insereLoja(Loja loja){

        for(int i=0; i<lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){

        for(int i=0; i<lojas.length; i++){
            if(lojas[i].getNome() == nomeLoja){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int quantidadeLoja = 0;

        switch(tipoLoja){
            case "Cosmético":
                for(Loja l : lojas){
                    if(l instanceof Cosmetico){
                        quantidadeLoja++;
                    }
                }
                break;
            
            case "Vestuário":
                for(Loja l : lojas){
                    if(l instanceof Vestuario){
                        quantidadeLoja++;
                    }
                }
                break;

            case "Bijuteria":
                for(Loja l : lojas){
                    if(l instanceof Bijuteria){
                        quantidadeLoja++;
                    }
                }
                break;

            case "Alimentação":
                for(Loja l : lojas){
                    if(l instanceof Alimentacao){
                        quantidadeLoja++;
                    }
                }
                break;

            case "Informática":
                for(Loja l : lojas){
                    if(l instanceof Informatica){
                        quantidadeLoja++;
                    }
                }
                break;
            default:
                quantidadeLoja = -1;
        }

        return quantidadeLoja;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica informatica = null;
        double seguroMaisCaro = 0;

        for(Loja l : lojas){
            if(l instanceof Informatica){
                if( ((Informatica)l).getSeguroEletronicos() > seguroMaisCaro ){
                    informatica = (Informatica)l;
                }
            }
        }

        return informatica;
    }
}
