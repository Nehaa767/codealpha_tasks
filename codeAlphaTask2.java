import java.util.Scanner;

public class codeAlphaTask2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double accountBalance = 0.0; 

        System.out.println("Welcome to the Simple Banking Application!");

        while (true) {
            // Display menu
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            
            System.out.print("Enter your choice: ");
            int userChoice = inputScanner.nextInt();

            switch (userChoice) {
                case 1: 
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = inputScanner.nextDouble();
                    if (depositAmount > 0) {
                        accountBalance += depositAmount;
                        System.out.println("Successfully deposited $" + depositAmount);
                    } else {
                        System.out.println("Invalid amount! Please enter a positive value.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawalAmount = inputScanner.nextDouble();
                    if (withdrawalAmount > 0 && withdrawalAmount <= accountBalance) {
                        accountBalance -= withdrawalAmount;
                        System.out.println("Successfully withdrew $" + withdrawalAmount);
                    } else if (withdrawalAmount > accountBalance) {
                        System.out.println("Insufficient balance! You have $" + accountBalance);
                    } else {
                        System.out.println("Invalid amount! Please enter a positive value.");
                    }
                    break;

                case 3: 
                    System.out.println("Your current balance is $" + accountBalance);
                    break;

                case 4: 
                    System.out.println("Thank you for using the banking application. Goodbye!");
                    inputScanner.close(); 
                    return;

                default: 
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
