
public class Dinheiro implements FormaPagamento {

    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado em dinheiro.");
    }
}