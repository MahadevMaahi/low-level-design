package DesignPatterns.SingletonPattern;

public class DBConnection {
    private volatile static DBConnection instance = null;
    
    private DBConnection() {
        System.out.println("Creating DB connection");
    }
    
    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
    
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
    
    public void closeConnection() {
        System.out.println("Closing DB connection");
    }
}
