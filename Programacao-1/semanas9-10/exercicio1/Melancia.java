public class Melancia extends Fruta{
    private Double precoAdicional;
    private boolean ehEpoca;
    
    public Melancia(String nome, double preco, Double precoAdicional, boolean ehEpoca){
        super(nome, preco);

        this.precoAdicional = precoAdicional;
        this.ehEpoca = ehEpoca;
    }

    public void setPrecoAdicional(Double precoAdicional){
        this.precoAdicional = precoAdicional;
    }
    public void setEhEpoca(boolean ehEpoca){
        this.ehEpoca = ehEpoca;
    }

    public Double getPrecoAdicional(){
        return precoAdicional;
    }
    public boolean getEhEpoca(){
        return ehEpoca;
    }

    public double calculaPrecoFinal(){
        if(ehEpoca){
            return super.getPreco();
        } 
        else {
            return super.getPreco() + precoAdicional;
        }
    }
}
