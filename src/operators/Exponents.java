package operators;

import static access.Connection.*;
import static access.ConnectionManager.getConnection;

import access.Connection;
import util.Print;
import util.Range;

// "e" означает 10 в степени.
public class Exponents {
    public static void main(String[] args) {
        float expFloat = 1.39e-43f;
        expFloat = 1e-45f;
        System.out.println(expFloat);
        double expDouble = 47e47d;
        double expDouble2 = 47e47;
        System.out.println(expDouble);
        Connection connection;
        for (int i = 0; i < 6; i++) {
            System.out.println(connection = getConnection());
        }
    }
}
