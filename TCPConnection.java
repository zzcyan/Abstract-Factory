public class TCPConnection implements Connection {
    public void connect() {
        System.out.println("Estabelecendo conexão TCP");
    }

    public void disconnect() {
        System.out.println("Fechando conexão TCP");
    }

    public String getConnectionType() {
        return "TCP";
    }
}