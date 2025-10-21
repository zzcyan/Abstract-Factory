public class ZipChannel extends ChannelDecorator {

    public ZipChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send() {
        System.out.println("Comprimindo mensagem...");
        channel.send();
    }

    @Override
    public void receive() {
        channel.receive();
        System.out.println("Descomprimindo mensagem...");
    }
}
