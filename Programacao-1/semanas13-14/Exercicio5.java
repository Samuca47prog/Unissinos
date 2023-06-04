public class Exercicio5 {
    
    public Produto produtoMaisBarato(Produto[] produtos){
        
        int indexProdutoMaisBarato = -1;

        for(int i=0; i<produtos.length; i++){
            if(produtos[i] != null){
                indexProdutoMaisBarato = i;
                break;
            }
        }

        if(indexProdutoMaisBarato == -1){
            return null;
        }

        for(int i=indexProdutoMaisBarato; i<produtos.length; i++){
            if(produtos[i] != null){
                if(produtos[i].getPreco() < produtos[indexProdutoMaisBarato].getPreco()){
                    indexProdutoMaisBarato = i;
                }
            }
        }

        return produtos[indexProdutoMaisBarato];
    }

}
