public class TesteDecorator {
    public static void main(String[] args) {
        System.out.println("=== Teste 1: TCP Channel simples ===");
        Channel tcpChannel = new TCPChannel();
        tcpChannel.send();
        tcpChannel.receive();

        System.out.println("\n=== Teste 2: TCP Channel com Log ===");
        Channel tcpWithLog = new LogChannel(new TCPChannel());
        tcpWithLog.send();
        tcpWithLog.receive();

        System.out.println("\n=== Teste 3: UDP Channel com Zip ===");
        Channel udpWithZip = new ZipChannel(new UDPChannel());
        udpWithZip.send();
        udpWithZip.receive();

        System.out.println("\n=== Teste 4: TCP Channel com Buffer e Log ===");
        Channel tcpWithBufferAndLog = new LogChannel(new BufferChannel(new TCPChannel()));
        tcpWithBufferAndLog.send();
        tcpWithBufferAndLog.receive();

        System.out.println("\n=== Teste 5: UDP Channel com Zip, Buffer e Log (todos decoradores) ===");
        Channel udpCompleto = new LogChannel(
            new BufferChannel(
                new ZipChannel(
                    new UDPChannel()
                )
            )
        );
        udpCompleto.send();
        udpCompleto.receive();
    }
}
