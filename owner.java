package rms;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import static java.lang.System.exit;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class owner {

    public void readfile() {
        try {
            String strcurrentline;
            //File myobj = new File("D:\\study\\work\\oop\\project.txt");
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\study\\work\\oop\\project.txt"));
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
            e.printStackTrace();
            System.out.println("an error occured");
        }
    }

    public void parseFile(String fileName, String searchStr) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNext()) {
            String line = scan.nextLine().toLowerCase();
            if (line.contains(searchStr)) {
                System.out.println(line);
            }
        }
    }

    public void deletefile(int choose) {
        File myobj = new File("D:\\study\\work\\oop\\project.txt");
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
        File myobj = new File("D:\\study\\work\\oop\\project.txt");
        username = "";
        password = "";
        return null;
    }

}
