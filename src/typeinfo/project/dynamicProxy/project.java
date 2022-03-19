package typeinfo.project.dynamicProxy;

import typeinfo.project.dynamicProxy.exceptions.IncorrectData;
import typeinfo.project.dynamicProxy.exceptions.InsufficientFunds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.Map;

public class project {

    public static Bank sber;

    public static void consumer(BankOperations bo) throws IncorrectData, InsufficientFunds {
        User mmm = new User("Михайлов Михаил Михайлович", "M");
        User ccc = new User("Сергеев Сергей Сергеевич", "M");
        bo.createAccount(mmm, 0L);
        bo.adding(mmm, 500L);
        bo.withdraw(mmm, 800L);
        bo.adding(mmm, 500L);
        bo.withdraw(mmm, 800L);

        bo.createAccount(ccc, 700L);
        bo.adding(ccc, 500L);
        bo.withdraw(ccc, 800L);
        bo.adding(ccc, 500L);
        bo.withdraw(ccc, 800L);

    }


    public static void main(String[] args) throws InsufficientFunds, IncorrectData {
        sber = new Bank();
        BankOperations bo = null;
        try {
            bo = (BankOperations) Proxy.newProxyInstance(
                    BankOperations.class.getClassLoader(),
                    new Class[]{BankOperations.class},
                    new DynamicProxy(sber)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (bo != null) {
            consumer(bo);
        }



    }
}
