package example.creational.factory;

public class MySQLFactory implements ConnectionFactory{
    @Override
    public Connection createConnection() {
        //conexões

        return new MySQLConnection();
    }
}
