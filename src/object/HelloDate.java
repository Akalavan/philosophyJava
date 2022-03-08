package object;


import java.util.Date;

/** Первая программа-пример.
 * Выводит строку и текущее число.
 * @author Akalavan
 * @version 1.0
 */
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Arrays String
     */
    public static void main(String[] args) {
        System.out.println("Hello, today: ");
        System.out.println(new Date());
    }
}
