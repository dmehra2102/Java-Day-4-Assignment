package question3;

public class Account {
    private double balance;
    private int accountId;
    Account(){
        this.accountId = 1;
        this.balance = 0;
    }

    Account(int accountNumber, double amount){
        this.balance = amount;
        this.accountId = accountNumber;
    }

    void depositMoney(int accountNumber, double amount){
        if(accountNumber == this.accountId) {
            this.balance += amount;
            System.out.println(amount + " has been successfully deposited in bank with account id " + accountNumber);
        }else{
            System.out.println("Account id didn't match");
        }
    }

    void withdrawMoney(int accountNumber, double amount){
        if(accountNumber == this.accountId) {
            this.balance -= amount;
            System.out.println(amount + " has been successfully withdrawal from bank with account id " + accountNumber);
        }else{
            System.out.println("Account id didn't match");
        }
    }

    void displayBalance(int accountId){
        if(accountId == this.accountId) {
            System.out.println("Current Balance : " + this.balance);
        }else{
            System.out.println("Account Id didn't match");
        }
    }
}
