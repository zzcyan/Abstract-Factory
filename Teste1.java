public class Teste1 {
    private Channel ch;
    private Connection conn;
    private NetworkAbstractFactory factory;

    public Teste1(){
        this.factory = NetworkFactoryProvider.getFactory("TCP");
        this.ch = factory.createChannel();
        this.conn = factory.createConnection();
    }

    public void connectar(){
        this.conn.connect();
        this.ch.getMessage();
        this.conn.disconnect();
    }
}
