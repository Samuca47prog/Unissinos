import java.io.FileNotFoundException;

public class ArCondicionado {
    public double temperaturaAtual;

    public ArCondicionado(){
        this.temperaturaAtual = 20;
    }


    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    // Com exceção runtime, unchecked, não é necessário tratar a exceção!
    public void aumentaTemperatura(double tempMais){
        this.temperaturaAtual += tempMais;

        if(temperaturaAtual<16 || temperaturaAtual>32){
            throw new IllegalArgumentException();
        }
    }


    // Exceção sendo tratada no mesmo escopo!
    public void aumentaTemperatura_2(double tempMais){
        this.temperaturaAtual += tempMais;

        try{
            if(temperaturaAtual<16 || temperaturaAtual>32){
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e){
            this.temperaturaAtual -= tempMais;
            System.out.println("Erro: temperatura inválida. \nA temperatura atual é de " + this.temperaturaAtual);
        }
    }


    // Exceção do tipo checked precisa ter tratada ou dita que pode ser jogada!
    public void aumentaTemperatura_3(double tempMais) throws FileNotFoundException{
        this.temperaturaAtual += tempMais;

        if(temperaturaAtual<16 || temperaturaAtual>32){
            throw new FileNotFoundException();
        }
    }


    public void diminuiTemperatura(double tempMenos){
        this.temperaturaAtual -= tempMenos;
    }

}