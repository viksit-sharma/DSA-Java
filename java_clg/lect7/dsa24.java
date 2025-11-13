package lect7;
//3. Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement methods to deposit and withdraw money
class BankAccount {
    int accountNumber;
    String accountHolder;
    int balance;

    BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(int depositMoney) {
        this.balance += depositMoney;
        System.out.println("Deposited : "+depositMoney);
    }

    void withdraw(int withdrawMoney) {
        this.balance -= withdrawMoney;
        System.out.println("Withdrawn : "+withdrawMoney);
    }

    void display() {
        System.out.println("Balance is : "+this.balance);
    }
}
public class dsa24 {
    public static void main(String[] args) {
        BankAccount consumer = new BankAccount(1225546324, "Mr. Rupesh Kumar", 900000);
        consumer.deposit(200000);
        consumer.withdraw(100000);
        consumer.display();
    }
}
