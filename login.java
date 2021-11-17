package rms;

import java.io.*;
import java.util.*;

public class login {

    //private static String username, password;
    public login() {

    }

    public void createfile() {
        try {
            File file = new File("D:\\MIU Courses\\Object Oriented Programming/admin.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred." + e);
            //e.printStackTrace();
        }
    }

    public void writefile(String username, String password) {
        try {
            try (FileWriter mywrite = new FileWriter("D:\\MIU Courses\\Object Oriented Programming/admin.txt", true)) {
                mywrite.write(username);
                mywrite.write(password);
            }
        } catch (IOException ex) {
            System.out.println("An error occurred." + ex);
            //ex.printStackTrace();
        }
    }

    public boolean searchusername(String username) throws FileNotFoundException {
        File file = new File("D:\\MIU Courses\\Object Oriented Programming/admin.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.contains(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchpassword(String password) throws FileNotFoundException {
        File file = new File("D:\\MIU Courses\\Object Oriented Programming/admin.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.contains(password)) {
                return true;
            }
        }
        return false;
    }
}
