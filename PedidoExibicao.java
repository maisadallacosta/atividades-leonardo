public class PedidoExibicao {

    public void exibirPedido(Pedido pedido) {
        System.out.println("\nProduto: " + pedido.produto.nome);
        System.out.println("Quantidade: " + pedido.quantidade);
        System.out.println("Valor: R$ " + (pedido.produto.preco * pedido.quantidade));
        System.out.println("\n---------------------------------");
    }
}