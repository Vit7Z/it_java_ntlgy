import Accounts.SimpleAccount;
import Accounts.CreditAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");

        SimpleAccount sAccount = new SimpleAccount(100);
        CreditAccount cAccount = new CreditAccount(200);

        System.out.println("sAccount   " + sAccount.getBalance());
        System.out.println("cAccount   " + cAccount.getBalance());

        sAccount.transfer(cAccount, 50);

        System.out.println("sAccount   " + sAccount.getBalance());
        System.out.println("cAccount   " + cAccount.getBalance());
    }
}