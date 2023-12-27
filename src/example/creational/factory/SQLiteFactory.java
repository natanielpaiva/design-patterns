package example.creational.factory;

public class SQLiteFactory implements ConnectionFactory{
    @Override
    public Connection createConnection() {
        return new SQLiteConnection();
    }
}
