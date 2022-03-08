package exceptions;

import static util.Print.print;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("Me exception");
        } catch (Exception e) {
            print("Caught");
            print("getMessage():" + e.getMessage());
            print("getLocalizedMessage():" + e.getLocalizedMessage());
            print("toString():" + e);
            print("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
