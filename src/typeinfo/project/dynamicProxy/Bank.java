package typeinfo.project.dynamicProxy;

import typeinfo.project.dynamicProxy.exceptions.IncorrectData;
import typeinfo.project.dynamicProxy.exceptions.InsufficientFunds;

import java.util.HashMap;
import java.util.List;

import static util.Print.print;

public class Bank extends HashMap<User, BankAccount> implements BankOperations {

    @Override
    public void createAccount(User user, Long credits) {
        BankAccount ba = get(user);
        if (ba == null) {
            BankAccount bankAccount;
            if (credits == 0L) {
                bankAccount = new BankAccount(user);
            } else {
                bankAccount = new BankAccount(user, credits);
            }
            put(user, bankAccount);
            user.setBankAccount(bankAccount);
            print("Account successfully created: " + bankAccount);
        } else {
            print("The " + user.getFio() + " already has an account: " + ba);
        }

    }

    @Override
    public void adding(User user, Long credits) throws IncorrectData {
        BankAccount ba = get(user);
        if (ba == null)
            throw new NullPointerException();
        if (credits < 0) {
            print("Enter the correct amount");
            throw new IncorrectData("Entered incorrect data");
        }
        ba.setCredits(ba.getCredits() + credits);
        print("Credit successfully adding");
        print("Available credits: " + ba.getCredits());
    }

    @Override
    public void withdraw(User user, Long withdrawCredits) throws InsufficientFunds, IncorrectData {
        BankAccount ba = get(user);
        long baCredit = ba.getCredits();
        if (withdrawCredits < 0) {
            print("Enter the correct amount");
            throw new IncorrectData("Entered incorrect data");
        }
        if (baCredit < withdrawCredits) {
            print("There is not enough money to withdraw " + withdrawCredits + ". On the money account " + baCredit);
            throw new InsufficientFunds("There are not enough funds in the account");
        }
        ba.setCredits(baCredit - withdrawCredits);
        print("Remains " + ba.getCredits());
    }


}
