public class UDPConnection implements Connection {
    public void connect() {
        System.out.println("Estabelecendo conexão UDP");
    }

    public void disconnect() {
        System.out.println("Fechando conexão UDP");
    }

    public String getConnectionType() {
        return "UDP";
    }
}