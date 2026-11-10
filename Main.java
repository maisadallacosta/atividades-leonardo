public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido("Hambúrguer", 2, 30.00);

        PedidoRepositorio repositorio = new PedidoRepositorio();
        repositorio.salvarPedido(pedido1);

        PedidoExibicao exibicao = new PedidoExibicao();
        exibicao.exibirPedido(pedido1);

        FormaPagamento pagamento = new Cartao();
        pagamento.pagar(pedido1.valor);

        pagamento = new Pix();
        pagamento.pagar(pedido1.valor);

        pagamento = new Dinheiro();
        pagamento.pagar(pedido1.valor);
    }
}