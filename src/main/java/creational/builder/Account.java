package creational.builder;

public class Account {

    private String accountName;
    private Long accountNumber;
    private String accountHolder;
    private double balance;
    private String type;
    private double interest;

    public Account accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public Account accountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public Account accountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
        return this;
    }

    public Account balance(double balance) {
        this.balance = balance;
        return this;
    }

    public Account type(String type) {
        this.type = type;
        return this;
    }

    public Account interest(double interest) {
        this.interest = interest;
        return this;
    }

    public Account build() {
        return this;
    }

    @Override
    public String toString() {
        return "Account [accountName=" + accountName + ", accountNumber=" + accountNumber + ", accountHolder="
                + accountHolder + ", balance=" + balance + ", type=" + type + ", interest=" + interest + "]";
    }
}
