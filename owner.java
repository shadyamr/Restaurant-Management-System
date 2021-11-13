package rms;

import java.io.*;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;

public class owner {

    public void readfile() {
        try {
            File myobj = new File("C:\\Users\\PC\\Desktop\\project.txt");
            try (Scanner myreader = new Scanner(myobj)) {
                while (myreader.hasNextLine()) {
                    String data = myreader.nextLine();
                    System.out.println(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("an error occured");
        }
    }

    public void deletefile(int choose) {
        File myobj = new File("C:\\Users\\PC\\Desktop\\project.txt");
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
        username = "";
        password = "";
        return null;
    }
}