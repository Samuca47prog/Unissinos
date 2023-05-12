public class Main {
    public static void main(String[] args){

        String menuDeEscolha =  "(1) criar uma loja \n" + 
                                "(2) criar um produto \n" + 
                                "(3) sair";
        int opcaoDoUsuario = 0;
        
        while(opcaoDoUsuario != 3){

            System.out.println(menuDeEscolha);
            opcaoDoUsuario = Teclado.leInt("Sua opção: ");
            
            if(opcaoDoUsuario < 1 || opcaoDoUsuario > 3){
                System.out.println("Opção inválida");
                continue;
            }
            else {
                System.out.println(opcaoDoUsuario + " é uma opção válida");
            }

            switch(opcaoDoUsuario){
                case 1:
                    Loja loja = new Loja(   Teclado.leString("Nome da loja: "), 
                                            Teclado.leInt("Quantidade de funcionários: "),
                                            Teclado.leDouble("Salário base do funcionário: "),
                                            new Endereco(   Teclado.leString("Nome da rua: "),
                                                            Teclado.leString("Cidade: "),
                                                            Teclado.leString("Estado: "),
                                                            Teclado.leString("País: "),
                                                            Teclado.leString("CEP: "),
                                                            Teclado.leString("Número: "),
                                                            Teclado.leString("Complemento: ")
                                                        ),
                                            new Data(   Teclado.leInt("Dia de fundação: "),
                                                        Teclado.leInt("Mês de fundação: "),
                                                        Teclado.leInt("Ano de fundação: ")
                                                    )
                        );
                    System.out.println(loja.toString());
    
                    break;
    
                case 2:
                    Produto produto = new Produto(  Teclado.leString("Nome do produto: "),
                                                    Teclado.leDouble("Preço: "), 
                                                    new Data(   Teclado.leInt("Dia da validade: "),
                                                                Teclado.leInt("Mês da validade: "),
                                                                Teclado.leInt("Ano da validade: ")
                                                            )
                                                    );
                    System.out.println(produto.toString());

                    Data dataReferencia = new Data(20, 10, 2023);
                    if(produto.estaVencido(dataReferencia)){
                        System.out.println("PRODUTO VENCIDO");
                    }
                    else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }

                    break;
                
                default:
                    System.out.println("Nenhum objeto criado");
            }
        
        }

    }
}
