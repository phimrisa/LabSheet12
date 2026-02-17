import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static String hide_password(String password) {
        String hide_password = "";

        for(int i=0; i < password.length(); i++) {
            if(i == 0) hide_password += password.charAt(i);
            else if(i == password.length()-1) hide_password += password;
            else hide_password += "*";
        }

        return hide_password;
    }

    public static void main(String[] args) throws IOException {
        // Open the file.
        File filename = new File("src/users.txt");
        Scanner scanner = new Scanner(filename);

        while(scanner.hasNext()) {
            // Read the file.
            String[] data = scanner.nextLine().split(",");

            // Show the file.
            /*
            data[0] is username
            data[1] is password
            data[2] is gender
            data[3] is birthYear
            */

            String username = data[0];
            String password = data[1];
            String gender = data[2];
            int birthYear = Integer.parseInt(data[3]);
            System.out.println(username);

            System.out.println("Username = " + username);
            System.out.println("Password = " + hide_password(password));
            System.out.println("Gender = " + gender);
            System.out.println("Birth year = " + birthYear);
            System.out.println();
        }

        // Close the file.
        scanner.close();
    }
}
