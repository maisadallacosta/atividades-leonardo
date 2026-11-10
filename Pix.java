
public class Pix implements FormaPagamento {

    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}