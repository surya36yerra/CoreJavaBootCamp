package java.Preparation.GenericQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCheck {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(checkForFile());
    }


     static boolean checkForFile() throws FileNotFoundException {
        File f = new File("/Users/syerr3/desktop/test.txt");
        Scanner scanner = new Scanner(f);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.contains("test")){
                scanner.close();
                return true;
            }
        }
        return false;

      }
}
