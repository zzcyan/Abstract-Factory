public abstract class ChannelDecorator implements Channel {
    protected Channel channel;

    public ChannelDecorator(Channel channel) {
        this.channel = channel;
    }

    public void send() {
        channel.send();
    }

    public void receive() {
        channel.receive();
    }
}
