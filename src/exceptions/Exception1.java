package exceptions;

public class Exception1 {
    public static void main(String[] args) {
        try {
            FullConstructors fc = null;
            fc.t();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
