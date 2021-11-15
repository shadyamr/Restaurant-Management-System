package rms;

import java.io.*;
import java.util.*;

public class Rms {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(System.in);
        login s1 = new login();
        owner s2 = new owner();
        branches test = new branches();
        menu test2 = new menu();
        s1.createfile();

        System.out.print("** Welcome to Restaurant Management System! **\n"
                + "** Please input a number for access type. (1 = owner, 2 = customer, 3 = waiter)\n"
                + "* Access Type: ");
        int access_type = cin.nextInt();
        if (access_type == 1) {
            System.out.println("press 1 to enter new username and password");
            System.out.println("press 2 to delete all the file");
            System.out.println("press 3 to delete one account");
            int pick = cin.nextInt();
            cin.nextLine();
            if (pick == 1) {
                System.out.print("** Enter your login details.\n"
                        + "* Username: ");
                String username = cin.nextLine();
                System.out.print("* Password: ");
                String password = cin.nextLine();

                s1.writefile(username, password);
                s2.readfile();
            } else if (pick == 2) {
                test.chooseBranch();
                test2.orderFood();
            } else if (pick == 3) {
                owner fileSearch = new owner();
                System.out.println("enter the username to be deleted:");
                String userdelete = cin.nextLine();
                fileSearch.parseFile("D:\\study\\work\\oop\\project.txt", userdelete);
            }
        } else if (access_type == 2) {

        }
    }

}

