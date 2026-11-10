import java.util.ArrayList;

public class PedidoRepositorio {

    ArrayList<Pedido> pedidos = new ArrayList<>();

    public void salvarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido salvo com sucesso!");
    }
}