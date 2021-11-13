package rms;
import java.util.*;
public class Rms 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        login s1 = new login();
        owner s2 = new owner();
        s1.createfile();

        System.out.print("** Welcome to Restaurant Management System! **\n"
                + "** Please input a number for access type. (1 = owner, 2 = customer, 3 = waiter)\n"
                + "* Access Type: ");
        int access_type = cin.nextInt();
        cin.nextLine();
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