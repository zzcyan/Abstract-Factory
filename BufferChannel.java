public class BufferChannel extends ChannelDecorator {

    public BufferChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send() {
        System.out.println("Adicionando ao buffer de envio...");
        channel.send();
    }

    @Override
    public void receive() {
        channel.receive();
        System.out.println("Lendo do buffer de recebimento...");
    }
}
