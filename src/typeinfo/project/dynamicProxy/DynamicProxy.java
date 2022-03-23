package typeinfo.project.dynamicProxy;

import typeinfo.project.dynamicProxy.exceptions.IncorrectData;
import typeinfo.project.dynamicProxy.exceptions.InsufficientFunds;
import util.MapEntry;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

import static typeinfo.project.dynamicProxy.project.sber;

public class DynamicProxy implements InvocationHandler {

    private Object proxied;
    private FileWriter fw;


    public DynamicProxy(Object proxied) throws IOException {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] arg) throws Throwable {
        Object result = null;
        StringBuilder data = new StringBuilder();
        fw = new FileWriter("BankOperations.txt", true);
        try {
            result = method.invoke(proxied, arg);

            if (method.getName().equals("createAccount")) {
                data.append("Operation createAccount:\n");
            }

            if (method.getName().equals("adding")) {
                data.append("Operation adding:\n");
            }

            if (method.getName().equals("withdraw")) {
                data.append("Operation withdraw:\n");
            }

            for (Map.Entry<User, BankAccount> entry:
                    sber.entrySet()){
                data.append(entry.getKey()).append("; ").append(entry.getValue());
            }

            data.append("\n");
            try(BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(String.valueOf(data));
            } catch (Exception e) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {

    }

}
