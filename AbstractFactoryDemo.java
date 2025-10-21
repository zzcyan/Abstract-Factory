public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Pattern Demo ===\n");

        System.out.println(">>> Demonstração TCP:");
        NetworkAbstractFactory tcpFactory = NetworkFactoryProvider.getFactory("TCP");
        Channel tcpChannel = tcpFactory.createChannel();
        Connection tcpConnection = tcpFactory.createConnection();

        tcpConnection.connect();
        tcpChannel.getMessage();
        tcpConnection.disconnect();
        System.out.println("Tipo de conexão: " + tcpConnection.getConnectionType() + "\n");

        System.out.println(">>> Demonstração UDP:");
        NetworkAbstractFactory udpFactory = NetworkFactoryProvider.getFactory("UDP");
        Channel udpChannel = udpFactory.createChannel();
        Connection udpConnection = udpFactory.createConnection();

        udpConnection.connect();
        udpChannel.getMessage();
        udpConnection.disconnect();
        System.out.println("Tipo de conexão: " + udpConnection.getConnectionType() + "\n");

        System.out.println(">>> Demonstração com classes de teste:");
        Teste1 t1 = new Teste1(); 
        Teste2 t2 = new Teste2(); 
        Teste3 t3 = new Teste3(); 

        System.out.println("Teste1 (TCP):");
        t1.connectar();

        System.out.println("\nTeste2 (UDP):");
        t2.connectar();

        System.out.println("\nTeste3 (TCP):");
        t3.connectar();
    }
}