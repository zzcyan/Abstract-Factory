public class UDPChannel implements Channel {
    public void send() {
        System.out.println("Enviando mensagem UDP");
    }

    public void receive() {
        System.out.println("Recebendo mensagem UDP");
    }
}
