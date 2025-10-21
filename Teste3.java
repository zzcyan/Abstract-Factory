public class Teste3 {
    private Channel ch;
    private Connection conn;
    private NetworkAbstractFactory factory;

    public Teste3(){
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
