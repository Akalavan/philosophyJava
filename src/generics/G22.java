package generics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Create<T> {
    T create(Class<T> kind);
}

class WithArgs {

    int i;
    String s;

    public WithArgs(int i, String s) {
        this.i = i;
        this.s = s;
    }
}

class Real implements Create<WithArgs> {


    @Override
    public WithArgs create(Class<WithArgs> kind) {

        try {
            return kind.getDeclaredConstructor(int.class, String.class).newInstance(1, "s");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        return method.invoke(proxied, objects);
    }
}

public class G22 {


    public static void main(String[] args) {
        Real r = new Real();
        Create proxy = (Create) Proxy.newProxyInstance(
                Create.class.getClassLoader(),
                new Class[]{Create.class},
                new DynamicProxyHandler(r));

        proxy.create(WithArgs.class);
    }
}
