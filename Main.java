public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido("Hambúrguer", 2, 30.00);
        Pedido pedido2 = new Pedido("Pizza", 1, 45.00);

        PedidoRepositorio repositorio = new PedidoRepositorio();

        repositorio.salvarPedido(pedido1);
        repositorio.salvarPedido(pedido2);

        PedidoExibicao exibicao = new PedidoExibicao();

        exibicao.exibirPedido(pedido1);
        exibicao.exibirPedido(pedido2);
    }
}