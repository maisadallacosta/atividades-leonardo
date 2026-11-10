public class SMS implements Notificacao {

    public void enviarNotificacao(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}