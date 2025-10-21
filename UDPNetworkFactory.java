public class UDPNetworkFactory implements NetworkAbstractFactory {
    public Channel createChannel() {
        return new UDPChannel();
    }

    public Connection createConnection() {
        return new UDPConnection();
    }
}