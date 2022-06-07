package Patterns.Proxy;

public class Client {

    public static final String dbname = "postgres";

    public static void main(String[] args) {
        DbConnectImpl dbConnect = new DbConnectImpl();
//        dbConnect.connect("jdbc:postgresql://localhost:5432/postgres");
        DbConnectionProxy dbConnectionProxy = new DbConnectionProxy(dbConnect);
        dbConnectionProxy.connect(dbname);
        dbConnectionProxy.connect(dbname);

    }
}
