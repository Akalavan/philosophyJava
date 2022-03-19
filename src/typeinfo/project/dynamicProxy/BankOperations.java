package typeinfo.project.dynamicProxy;

import typeinfo.project.dynamicProxy.exceptions.IncorrectData;
import typeinfo.project.dynamicProxy.exceptions.InsufficientFunds;

public interface BankOperations {

    void createAccount(User user, Long credits);

    void adding(User user, Long credits) throws IncorrectData;

    void withdraw(User user, Long credits) throws InsufficientFunds, IncorrectData;
}
