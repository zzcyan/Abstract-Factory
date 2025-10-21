public class LogChannel extends ChannelDecorator {

    public LogChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send() {
        System.out.println("[LOG] Registrando envio de mensagem...");
        channel.send();
    }

    @Override
    public void receive() {
        channel.receive();
        System.out.println("[LOG] Registrando recebimento de mensagem...");
    }
}
