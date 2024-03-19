public class Melancia extends Fruta{
    private double precoAdicional;
    private boolean epoca;
    
    public Melancia(String nome, double preco, double precoAdicional, boolean epoca){
        super(nome, preco);
        this.precoAdicional = precoAdicional;
        this.epoca = epoca;
    }
    
    public void setPrecoAdicional(double precoAdicional){
        this.precoAdicional = precoAdicional;
    }
    
    public double getPrecoAdicional(){
        return precoAdicional;
    }
    
    public void setEpoca(boolean epoca){
        this.epoca = epoca;
    }
    
    public boolean isEpoca(){
        return epoca;
    }
    
    public double calculaPrecoFinal(){
        //IF TERNÁRIO
        return epoca ? getPreco() : getPreco() + precoAdicional;
        
        /*
        if(epoca)
            return getPreco();
        return getPreco() + precoAdicional;
        */
    }
}






