package Patterns.Proxy;

public class DbConnectionProxy implements DbConnection{

    private final DbConnectImpl dbConnect;
    private String cache = "";

    public DbConnectionProxy(DbConnectImpl dbConnect) {
        this.dbConnect = dbConnect;
    }

    @Override
    public void connect(String urlOrDbName) {
        if(cache.isEmpty()){
            cache = urlOrDbName;
        }else {
            System.out.println("подключено localhost:port/" + cache);
            dbConnect.connect(DbConnectImpl.URL + cache);
        }
    }
}
