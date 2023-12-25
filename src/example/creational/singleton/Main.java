package example.creational.singleton;


public class Main {

    public static void main(String[] args){
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2= DatabaseConnection.getInstance();

        Connection connection = databaseConnection.getConnection();
        Connection connection2 = databaseConnection2.getConnection();
    }

}
