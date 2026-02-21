package WriteFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter filename = new FileWriter("src/WriteFile/users.txt",true);
        PrintWriter writer = new PrintWriter(filename);

        writer.println("Hello, World");

        writer.close();
    }
}