public class TCPNetworkFactory implements NetworkAbstractFactory {
    public Channel createChannel() {
        return new TCPChannel();
    }

    public Connection createConnection() {
        return new TCPConnection();
    }
}