public class Teste2 {
    private Channel ch;
    private Connection conn;
    private NetworkAbstractFactory factory;

    public Teste2(){
        this.factory = NetworkFactoryProvider.getFactory("UDP");
        this.ch = factory.createChannel();
        this.conn = factory.createConnection();
    }

    public void connectar(){
        this.conn.connect();
        this.ch.getMessage();
        this.conn.disconnect();
    }
}
