public class TCPChannel implements Channel {
    public void send() {
        System.out.println("Enviando mensagem TCP");
    }

    public void receive() {
        System.out.println("Recebendo mensagem TCP");
    }
}
