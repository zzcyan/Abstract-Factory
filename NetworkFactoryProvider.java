public class NetworkFactoryProvider {
    public static NetworkAbstractFactory getFactory(String protocol) {
        if (protocol.equalsIgnoreCase("TCP")) {
            return new TCPNetworkFactory();
        } else if (protocol.equalsIgnoreCase("UDP")) {
            return new UDPNetworkFactory();
        }
        throw new IllegalArgumentException("Protocol não suportado: " + protocol);
    }
}