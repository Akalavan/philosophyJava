package access;

import java.util.Collections;


public class ConnectionManager {
    private static Connection[] connection = new Connection[5];
    private static int count = 0;

    static {
        connection[0] = new Connection();
        connection[1] = new Connection();
        connection[2] = new Connection();
        connection[3] = new Connection();
        connection[4] = new Connection();
    }

    public static Connection getConnection() {
        if (count < connection.length)
            return connection[count++];
        else return null;
    }
}
