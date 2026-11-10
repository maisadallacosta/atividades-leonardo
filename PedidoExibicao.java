public class PedidoExibicao {

    public void exibirPedido(Pedido pedido) {
        System.out.println("Produto: " + pedido.produto);
        System.out.println("Quantidade: " + pedido.quantidade);
        System.out.println("Valor: R$ " + pedido.valor);
        System.out.println("---------------------------------");
    }
}   