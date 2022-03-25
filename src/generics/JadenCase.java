package generics;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() < 1) return null;

        StringBuilder sb = new StringBuilder();

        for (String s :
                phrase.split(" ")) {
            sb.append(s.substring(0, 1).toUpperCase());
            sb.append(s.substring(1));
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        System.out.println(jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(jadenCase.toJadenCase(null));
        System.out.println(jadenCase.toJadenCase(""));
    }

}