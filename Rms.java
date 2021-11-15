package rms;

import java.io.FileNotFoundException;
import java.util.*;

public class Rms {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(System.in);
        login s1 = new login();
        owner s2 = new owner();
        branches test = new branches();
        menu test2 = new menu();
        owner test3 = new owner();
        s1.createfile();
        System.out.print("** Welcome to Restaurant Management System! **\n"
                + "** Please input a number for access type. (1 = owner, 2 = customer, 3 = waiter)\n"
                + "* Access Type: ");
        int access_type = cin.nextInt();
        cin.nextLine();
        System.out.print("Enter your username and password.\n"
                + "Enter your login details.\n"
                + "* Username: ");
        String username = cin.nextLine();
        System.out.print("* Password: ");
        String password = cin.nextLine();
        s1.writefile(username, password);
        if (access_type == 1) {
            System.out.println("Press 1 to edit the restaurant's system.");
            System.out.println("Press 2 to delete an account.");
            int pick = cin.nextInt();
            if (pick == 1) {
            test3.chooseOption();
            } else if (pick == 2) {
                owner fileSearch = new owner();
                System.out.println("Enter the username to be deleted:");
                String userdelete = cin.nextLine();
                fileSearch.parseFile("D:\\MIU Courses\\Object Oriented Programming\\project.txt", userdelete);
            } else if (access_type == 2) {

            }
        }
    
}
}
