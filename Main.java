public class Main {
    public static void main(String[] args) {

        Produto produto = new Pizza("Pizza", 45.00);
        Pedido pedido = new Pedido(produto, 1);

        PedidoRepositorio repositorio = new PedidoRepositorio();
        repositorio.salvarPedido(pedido);

        EnvioNotificacao notificacao = new EnvioNotificacao();
        notificacao.enviarNotificacao("Seu pedido foi recebido!");

        RelatorioPedidos relatorio = new RelatorioPedidos();
        relatorio.gerarRelatorio();

        Entrega entrega = new Entrega();
        entrega.atualizarEntrega("Saiu para entrega!");
    }
}