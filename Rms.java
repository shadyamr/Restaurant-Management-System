package rms;

import java.util.*;

public class Rms {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        branches test = new branches();
        menu test2 = new menu();
        login s1 = new login();
        owner s2 = new owner();
        s1.createfile();
        System.out.print(" Welcome to the system!\n"
                + "** Please input a number for access type. (1 = Owner, 2 = Customer, 3 = Waiter)\n"
                + " ACCESS TYPE: ");
        int access_type = cin.nextInt();
        cin.nextLine();
        if (access_type == 1) {
            System.out.print("** Enter your login details.\n"
                    + "* Username: ");
            String username = cin.nextLine();
            System.out.print("* Password: ");
            String password = cin.nextLine();

            s1.writefile(username, password);
            s2.readfile();
            System.out.println("Enter 1 to delete the files or anthing else to leave it:");
            int choose = cin.nextInt();
            s2.deletefile(choose);
        } else if (access_type == 2) {
            test.chooseBranch();
            test2.orderFood();
        }
        if (access_type == 3) {
            System.out.print("** Enter your login details.\n"
                    + "* Username: ");
            String username = cin.nextLine();
            System.out.print("* Password: ");
            String password = cin.nextLine();

            s1.writefile(username, password);
            s2.readfile();
            System.out.println("Enter 1 to delete the files or anthing else to leave it:");
            int choose = cin.nextInt();
            s2.deletefile(choose);
        }

    }
}
