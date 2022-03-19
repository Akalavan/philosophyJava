package typeinfo.project.dynamicProxy;

public class User {

    private String fio;
    private String gender;
    private BankAccount bankAccount;

    public User(String fio, String gender) {
        this.fio = fio;
        this.gender = gender;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "User{" +
                "fio='" + fio + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
