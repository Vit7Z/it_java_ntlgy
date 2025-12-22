package Accounts;

public abstract class Account {
    private long amount;
    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public boolean add(long amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean pay(long amount) {
        if (this.balance < amount) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    public boolean transfer(Account account, long amount) {
        if (this.balance < amount) {
            return false;
        } else {
            this.pay(amount);
            account.add(amount);
            return true;
        }
    }

    public long getBalance() {
        return balance;
    }
}