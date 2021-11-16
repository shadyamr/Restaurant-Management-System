package rms;
import java.io.*;
import java.util.*;
public class Rms 
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Scanner cin = new Scanner(System.in);
        login s1 = new login();
        owner s2 = new owner();
        waiter employee = new waiter();
        branches test = new branches();
        menu test2 = new menu();
        owner test3 = new owner();
        s1.createfile();
        System.out.print("** Welcome to Restaurant Management System! **\n"
                + "** Please input a number for access type. (1 = owner, 2 = customer, 3 = waiter)\n"
                + "* Access Type: ");
        int access_type = cin.nextInt();
        cin.nextLine();
        if (access_type == 1) 
        {
            System.out.print("Enter your username and password.\n"
                    + "Enter your login details.\n"
                    + "* Username: ");
            String username = cin.nextLine();
            System.out.print("* Password: ");
            String password = cin.nextLine();

            if (s1.searchusername(username) && s1.searchpassword(password) == true) 
            {
                System.out.println("Press 1 to edit the restaurant's system.");
                System.out.println("Press 2 to delete an admin account.");
                System.out.println("Press 3 to add new admin account");
                System.out.println("Press 4 to add new waiter account.");
                System.out.println("Press 5 to delete a waiter account.");

                int pick = cin.nextInt();
                
                if (pick == 1) {
                    test3.chooseOption();
                } else if (pick == 2) {
                    owner fileSearch = new owner();
                    System.out.println("Enter the username to be deleted:");
                    cin.nextLine();
                    String userdelete = cin.nextLine();
                    fileSearch.parseFile("D:\\MIU Courses\\Object Oriented Programming\\project.txt", userdelete);
                } else if (pick == 3) {
                    System.out.print("Enter your username and password.\n"
                            + "Enter your login details.\n"
                            + "* Username: ");
                    cin.nextLine();
                    username = cin.nextLine();
                    System.out.print("* Password: ");
                    password = cin.nextLine();
                    s1.writefile(username, password);
                } else if(pick == 4) {
                   System.out.print("Enter your username and password.\n"
                            + "Enter your login details.\n"
                            + "* Username: ");
                    cin.nextLine();
                    username = cin.nextLine();
                    System.out.print("* Password: ");
                    password = cin.nextLine();
                    employee.writefile(username, password);
                } else if (pick == 5) {
                    waiter fileSearch = new waiter();
                    cin.nextLine();
                    System.out.println("Enter the username to be deleted:");
                    String userdelete = cin.nextLine();
                    fileSearch.parseFile("D:\\MIU Courses\\Object Oriented Programming\\waiter.txt", userdelete);
                }

            } 
            else 
            {
                System.out.println("Error wrong username or password");
            }
        }

        if (access_type == 2) 
        {
            customer user = new customer();
            user.customerChoose();
        } else if (access_type == 3) {
                        System.out.print("Enter your username and password.\n"
                    + "Enter your login details.\n"
                    + "* Username: ");
            String username = cin.nextLine();
            System.out.print("* Password: ");
            String password = cin.nextLine();
            if (employee.searchusername(username) && employee.searchpassword(password) == true) 
            {
                System.out.println("Login successful!");
            }
            else 
            {
                System.out.println("Error wrong username or password");
            }
        }
    }
}
