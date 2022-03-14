package typeinfo.project.dynamicProxy.exceptions;

public class InsufficientFunds extends Exception {

    public InsufficientFunds(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "InsufficientFunds";
    }
}
