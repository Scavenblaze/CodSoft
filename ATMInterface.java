import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Success! Amount of " + amount + " has been deposited.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Success! Amount of " + amount + " has been withdrawn.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public int checkBalance() {
        return balance;
    }
}

public class ATMInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount userAccount = new BankAccount(1000);

        while (true) {
            System.out.println("\nATM Machine\n Please Select an option:");
            System.out.println("1] DEPOSIT");
            System.out.println("2] WITHDRAWAL");
            System.out.println("3] CHECK BALANCE");
            System.out.println("4] EXIT");

            System.out.print("Enter the Number to choose the option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Amount to Deposit: ");
                    int depositAmount = sc.nextInt();
                    userAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    userAccount.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("The Balance Amount is: " + userAccount.checkBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option! Please choose a valid number.");
                    break;
            }
        }
    }
}