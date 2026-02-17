import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean is_loop = true;

        while(is_loop) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                is_loop = false;
            } catch (InputMismatchException err) {
                scanner.next(); // P.S. Clear the error that occur and continue the loop until it's correct.
                //System.out.println(err.getMessage());
                System.out.println("Invalid data type!! ");
            } catch (Exception err) {
                scanner.next();
                System.out.print("Invalid!! ");
            }
        }

        System.out.println("You input number = " + number);
    }
}
