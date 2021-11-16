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

public class owner{
branches testing = new branches(); //Testing the methods
menu testing2 = new menu();
    Scanner scan = new Scanner(System.in);

    public void readfile() {
        try {
            String strcurrentline;
            //File myobj = new File("D:\\study\\work\\oop\\project.txt");
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\project.txt"));
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
        File myobj = new File("D:\\MIU Courses\\Object Oriented Programming\\project.txt");
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
        File myobj = new File("D:\\MIU Courses\\Object Oriented Programming\\project.txt");
        username = "";
        password = "";
        return null;
    }

    public void chooseOption() {
        System.out.println("Please pick what do you want to modify.\n"
                + "1 - Branches\n"
                + "2 - Menu\n"
                + "3 - Employees\n");
        int x;
        x = scan.nextInt();
        if(x==1){
                System.out.println("1- Check the current branches.\n"
                        +"2 - Add a new branch.\n"
                        +"3 - Edit a branch.\n"
                        +"4 - Remove a branch.\n");
                int BranchChoice = scan.nextInt();
                String y = scan.nextLine();
                if(BranchChoice == 1){
                testing.readBranches();
                testing.readAddedBranches();
                testing.showbranches();
                } else if (BranchChoice == 2){
                testing.addBranch();
                //testing.writeinitialBranches();
                testing.writeAddedBranches();
                testing.readBranches();
                testing.readAddedBranches();
                } else if (BranchChoice == 2){
                
                }
        } else if (x==2){
        testing2.orderFood();
        } else if(x==3){
        
        }
    }
;
}
