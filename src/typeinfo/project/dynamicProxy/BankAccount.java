package typeinfo.project.dynamicProxy;

public class BankAccount {

    private static long counter = 0;
    private final Long id = counter++;
    private User owner;
    private Long credits;

    public BankAccount(User owner) {
        this.owner = owner;
        credits = 0L;
    }

    public BankAccount(User owner, Long credits) {
        this.owner = owner;
        this.credits = credits;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public long getCredits() {
        return credits;
    }

    public void setCredits(Long credits) {
        if (credits > 0)
            this.credits = credits;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", credits=" + credits +
                '}';
    }
}
