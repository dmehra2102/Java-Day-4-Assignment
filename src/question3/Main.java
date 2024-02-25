package question3;

public class Main {
    public static void main(String[] args){
        Account newAccount = new Account(5, 1_20_000);
        Account newAccount2 = new Account();

        newAccount.displayBalance(5);
        // Add money in your account by passing correct accountId.
        newAccount.depositMoney(5,25_000);

        // Withdraw money from your account by passing correct accountId
        newAccount.withdrawMoney(5, 5_000);

        // Check balance of your account by passing correct accountId
        newAccount.displayBalance(5);
        newAccount2.displayBalance(1);
    }
}
