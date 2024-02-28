package jdbcconn;

import java.util.Scanner;

class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to authenticate the password
    public boolean authenticate(String password) {
        return password.equals("ram");
    }

    // Nested private Interest class
    private class Interest {
        private static final double INTEREST_RATE = 0.05; // Example interest rate (5%)

        // Method to calculate and add interest to the balance
        public void calculateAndAddInterest() {
            double interest = balance * INTEREST_RATE;
            balance += interest;
        }
    }

    // Method to show balance and calculate interest if password is correct
    public void showBalanceAndCalculateInterest(String password) {
        if (authenticate(password)) {
            System.out.println("Authenticated successfully!");
            System.out.println("Current Balance: $" + balance);

            // Create an instance of the Interest class and calculate interest
            Interest interestCalculator = new Interest();
            interestCalculator.calculateAndAddInterest();

            System.out.println("Balance after interest: $" + balance);
        } else {
            System.out.println("Authentication failed. Incorrect password.");
        }
    }
}

public class bankdet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a BankAccount instance with an initial balance
        BankAccount account = new BankAccount(1000.0);

        // Prompting the user for the password
        System.out.print("Enter password to access your account: ");
        String password = scanner.nextLine();

        // Calling the method to show balance and calculate interest
        account.showBalanceAndCalculateInterest(password);

        scanner.close();
    }
}