package typeinfo.access;

import typeinfo.TestReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestReflection tr = new TestReflection();
        Method[] methods = tr.getClass().getDeclaredMethods();
        for (Method method :
                methods) {
            method.setAccessible(true);
            method.invoke(tr);
        }
    }
}
