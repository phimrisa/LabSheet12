package Banking;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankSystem2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your bank account: ");
        String accId = scanner.next();

        AccountTransaction account = new AccountTransaction(accId);

        if (account.hasAccountId()) {
            System.out.println();
            System.out.println("Press 1 to deposit" +
                    "\nPress 2 to withdraw" +
                    "\nPress 3 to check balance" +
                    "\nPress 4 to exit");
            System.out.println();

            boolean is_loop = true;
            int deposit_amount = 0;

            while (is_loop) {
                System.out.print("Enter a menu: ");
                int menu = scanner.nextInt();

                if (menu == 1) {
                    System.out.print("Enter amount to deposit: ");
                    deposit_amount = scanner.nextInt();
                    account.deposit(deposit_amount);
                    System.out.println("You balance = " + account.checkBalance());
                } else if (menu == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    deposit_amount = scanner.nextInt();
                    account.withdraw(deposit_amount);
                    System.out.println("You balance = " + account.checkBalance());
                } else if (menu == 3) {
                    System.out.println("You balance = " + account.checkBalance());
                } else if (menu == 4) {
                    is_loop = false;
                }
                System.out.println();
            }
        } 
        else {
            System.out.println("Bank account not found...");
        }
    }
}
