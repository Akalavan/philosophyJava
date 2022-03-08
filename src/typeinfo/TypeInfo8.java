package typeinfo;

import java.lang.reflect.Field;

public class TypeInfo8 {

    public static void info(Class c) {
        if (c == null) return;
        System.out.println(c.getSimpleName());

        for (Field field :
                c.getDeclaredFields()) {
            System.out.print(field + ", ");
        }
        System.out.println();

        info(c.getSuperclass());
    }
}
