package Module1;

import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String acc = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount obj = new BankAccount(acc, name, bal);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        obj.deposit(amount);

        System.out.println("\nUpdated Account Details");
        obj.displayDetails();

       
    }
}
