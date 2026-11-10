public class SistemaNotificacao {

    Notificacao notificacao;

    public SistemaNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void enviar(String mensagem) {
        notificacao.enviarNotificacao(mensagem);
    }
}