package Banking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSystem1 {
    public static String input_account_id() {
        Scanner scanner = new Scanner(System.in);

        String account_id = "";
        boolean is_loop = true;

        while (is_loop) {
            System.out.print("Enter account id: ");
            account_id = scanner.next();

            if (account_id.length() == 10) {
                is_loop = false;
            }
        }
        System.out.println();
        return account_id;
    }

    public static double input_initial_balance() {
        Scanner scanner = new Scanner(System.in);
        int deposit_amount = 0;
        boolean is_loop = true;

        System.out.print("Enter your initial deposit amount: ");

        while(is_loop) {
            try {
                deposit_amount = scanner.nextInt();
                is_loop = false;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("Try again!! Enter your initial deposit amount: ");
            }
        }
        return deposit_amount;
    }

    public static void main(String[] args) throws IOException {
        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();
        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);

        System.out.println();
        account.recordAccount();
        System.out.println("Created account success!!");
    }
}