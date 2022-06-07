package Patterns.Proxy;

import java.sql.*;

public class DbConnectImpl implements DbConnection {
    private static Connection connection;
    private static Statement stmt;

        static final String URL = "jdbc:postgresql://localhost:5432/";
        static final String USER = "postgres";
        static final String PASS = "a433rtqe";


    @Override
    public void connect(String urlOrDbName) {
        try {
            connection = DriverManager.getConnection(urlOrDbName,USER, PASS);
            stmt = connection.createStatement();
//            readEx();
            disconnect();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void disconnect() throws SQLException {
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void readEx() throws SQLException {
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM Products")) {
                while (rs.next()){
                    System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getInt(3));
                }
            }
        }
}
