package U2;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class L25Q1 {
    public static void main(String[] args) {

        try {
            Scanner fileInput = new Scanner(new File("src/U2/Sample.t"));
            PrintWriter fileOutput = new PrintWriter("src/U2/Sample.py");

            while (fileInput.hasNext()) {
                String line = fileInput.nextLine();
                if (line.indexOf("var") == -1) {
                    if (line.indexOf(":=") != -1) {
                        line = line.replace(":=", "=");
                    }

                    if (line.indexOf("put") != -1) {
                        line = line.replace("put", "print(").replace(" \"", "\"").replace("\" ", "\"") + ")";
                    }

                    fileOutput.println(line);
                }
            }
            fileInput.close();
            fileOutput.close();
        } catch (IOException ioException) {
            System.err.println("Java Exception: " + ioException);
        }

    }
}
