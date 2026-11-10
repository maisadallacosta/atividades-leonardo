public class Email implements Notificacao {

    public void enviarNotificacao(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}