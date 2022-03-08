package operators;

public class Operator10 {


    public static void main(String[] args) {
        int i = 0x01010101;
        int i2 = 0x10101010;

        System.out.println(Integer.toBinaryString(i | i2));
        System.out.println(Integer.toBinaryString(i & i2));
        System.out.println(Integer.toBinaryString(i ^ i2));
    }
}
