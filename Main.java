public class Main {
    public static void main(String[] args) {

        SistemaNotificacao sistema;

        sistema = new SistemaNotificacao(new Email());
        sistema.enviar("Seu pedido foi recebido!");

        sistema = new SistemaNotificacao(new SMS());
        sistema.enviar("Seu pedido saiu para entrega!");

        sistema = new SistemaNotificacao(new WhatsApp());
        sistema.enviar("Seu pedido foi entregue!");
    }
}