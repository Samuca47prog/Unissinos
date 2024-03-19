public class Principal {
    public static void main(String[] args){

        Churro[] churrosPadrao = {  new Churro(),
                                    new Churro("Chocolate"),
                                    new Churro(),
                                    new Churro(),
                                    new Churro("Chocolate"),
                                    new Churro(),
                                    null,
                                    null,
                                    new Churro("Nuttela", 7.0)
                                };

        String sabor = "Doce de leite";

        BancaDeChurros banca = new BancaDeChurros(churrosPadrao);

        System.out.println("\n\n\t Churros na banca no início da execução");
        banca.imprimeChurros();

        // 1. ------------------------
        System.out.println("\n\n\t 1. Testando função estoqueChurros()");

        System.out.println("Quantidade de churros " + sabor + ": " + banca.estoqueChurros(sabor));
        System.out.println("Esperado: 4");


        // 2. ------------------------
        System.out.println("\n\n\t 2. Testando função insereChurros()");

        boolean churrosInserido = banca.insereChurro(new Churro("Nuttela", 7.0));
        System.out.println("Churros foi inserido: " + (churrosInserido ? "SIM" : "NÃO"));
        banca.imprimeChurros();


        // 3. ------------------------
        System.out.println("\n\n\t 3. Testando função valorTotal()");

        System.out.println("Valor total dos churros " + banca.valorTotal());
        

        // 4. ------------------------
        System.out.println("\n\n\t 4. Testando função vendeChurros()");

        System.out.println("Churros deve ser vendido...");
        banca.vendeChurros("Chocolate");
        System.out.println("Churros NÃO deve ser vendido...");
        banca.vendeChurros("Stikadinho");

        banca.imprimeChurros();
        
        // 6. ------------------------
        System.out.println("\n\n\t 6. Testando função lePedidos()");

        System.out.println("Todos os churros devem ser vendidos...");
        banca.lePedidos("Samuel", "Doce de leite", 3);

        System.out.println("Não haverá churros suficientes...");
        banca.lePedidos("Rafaela", "Doce de leite", 3);

        banca.imprimeChurros();
    }
}
