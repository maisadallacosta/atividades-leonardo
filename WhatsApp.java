public class WhatsApp implements Notificacao {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}