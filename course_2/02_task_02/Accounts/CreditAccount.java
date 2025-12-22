package Accounts;

public class CreditAccount extends Account {
    public CreditAccount(long balance) {
        super(1000);
        this.add(balance);
    }
}