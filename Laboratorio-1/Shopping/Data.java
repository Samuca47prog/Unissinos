import java.time.LocalDate;

public class Data {
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Construtores
    public Data(int dia, int mes, int ano){
        boolean ehDataValida = true;
        boolean ehAnoBissexto = false;
        int numeroDiasNoMes = 0;

        // vefifica range de cada atributo
        if (dia < 1 || dia > 31)
            ehDataValida = false;
        
        if (mes < 1 || mes > 12)
            ehDataValida = false;

        // verifica os dias de cada mês
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numeroDiasNoMes = 31;
                break;

            case 4: case 6: case 9: case 11: 
                numeroDiasNoMes = 30;
                break;

            case 2: 
                numeroDiasNoMes = 28;
                break;

            default:
                ehDataValida = false;
        }

        // Descobre se é ano bissexto
        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            ehAnoBissexto = true;
        } else if (ano % 400 == 0) {
            ehAnoBissexto = true;
        } else {
            ehAnoBissexto = false;
        }

        if (ehAnoBissexto && mes==2){
            numeroDiasNoMes = 29;
        }


        if (dia > numeroDiasNoMes){
            ehDataValida = false;
        }





        if (ehDataValida){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            System.out.println("Data inválida!");
        }
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

    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            return true;
        } else if (ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int comparaData(Data dataReferencia){
        LocalDate dateRefer = LocalDate.of(dataReferencia.getAno(), dataReferencia.getMes(), dataReferencia.getDia());
        LocalDate dateThis = LocalDate.of(this.ano, this.mes, this.dia);
    
        if (dateRefer.compareTo(dateThis) < 0) {
            System.out.println("Data de referência é anterior a data testada");
            return 1;

        } else if (dateRefer.compareTo(dateThis) > 0) {
            System.out.println("Data testada é anterior a data de referência");
            return -1;

        } else {
            System.out.println("Datas iguais");
            return 0;
            
        }
    }
}
