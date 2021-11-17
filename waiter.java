package rms;

import java.util.*;
import java.io.*;
import static java.lang.System.exit;

public class waiter {

    public void writefile(String username, String password) {
        try {
            try (FileWriter mywrite = new FileWriter("D:\\MIU Courses\\Object Oriented Programming/waiter.txt", true)) {
                mywrite.write(username);
                mywrite.write(password);
            }
        } catch (IOException ex) {
            System.out.println("An error occurred." + ex);
        }
    }

    public boolean searchusername(String username) throws FileNotFoundException {
        File file = new File("D:\\MIU Courses\\Object Oriented Programming/waiter.txt");
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
        File file = new File("D:\\MIU Courses\\Object Oriented Programming/waiter.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.contains(password)) {
                return true;
            }
        }
        return false;
    }

    public void parseFile(String fileName, String searchStr) throws FileNotFoundException { //Search
        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNext()) {
            String line = scan.nextLine().toLowerCase();
            if (line.contains(searchStr)) {
                System.out.println(line);
            }
        }
    }

    public void deletefile(int choose) {
        File myobj = new File("D:\\MIU Courses\\Object Oriented Programming\\waiter.txt");
        if (choose == 1) {//handle the error if the user enters letter not a number
            if (myobj.delete()) {
                System.out.println(myobj.getName() + ":file is deleted successfully");
            } else {
                System.out.println("unexpected error occured");
            }
        } else {
            exit(0);
        }
    }

    public String delete(String username, String password) {
        File myobj = new File("D:\\MIU Courses\\Object Oriented Programming\\waiter.txt");
        username = "";
        password = "";
        return null;
    }

    public void GetTheOrder() {
        try {
            String strcurrentline;
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\order.txt"));
            try (Scanner myreader = new Scanner(myobj)) {
                while ((strcurrentline = myobj.readLine()) != null) {

                    System.out.println(strcurrentline);
                }
                int data = myobj.read();
                while (data != -1) {
                    data = myobj.read();
                }
                myobj.close();
            }
        } catch (IOException e) {
            System.out.println("an error occured");
        }
    }
}
