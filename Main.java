public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Pizza("Pizza", 45.00);
        Produto produto2 = new Hamburguer("Hambúrguer", 30.00);
        Produto produto3 = new Bebida("Refrigerante", 8.00);

        PedidoRepositorio repositorio = new PedidoRepositorio();
        PedidoExibicao exibicao = new PedidoExibicao();

        Pedido pedido1 = new Pedido(produto1, 1);
        Pedido pedido2 = new Pedido(produto2, 2);
        Pedido pedido3 = new Pedido(produto3, 3);

        repositorio.salvarPedido(pedido1);
        repositorio.salvarPedido(pedido2);
        repositorio.salvarPedido(pedido3);

        exibicao.exibirPedido(pedido1);
        exibicao.exibirPedido(pedido2);
        exibicao.exibirPedido(pedido3);
    }
}