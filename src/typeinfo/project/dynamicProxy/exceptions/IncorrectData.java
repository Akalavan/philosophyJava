package typeinfo.project.dynamicProxy.exceptions;

public class IncorrectData extends Exception {

    public IncorrectData(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "IncorrectData";
    }
}
