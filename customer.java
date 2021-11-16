package rms;
import java.io.*;
import java.util.*;
public class customer
{
    branches branching = new branches();
    protected String customer_name;
    protected long ph_numb;
    Scanner cin = new Scanner(System.in);
    menu Menuo = new menu();
    paymentMethod payment = new paymentMethod();
    public void customerChoose()
    {
        String screenmsg_x = "\n*** Customer Section: ***\n"
                + "** Please enter your information.";
        System.out.println(screenmsg_x);
        System.out.print("* Name: ");
        customer_name = cin.nextLine();
        System.out.print("* Phone Number: ");
        ph_numb = cin.nextLong();
        
        String screenmsg_y = "\n*** Customer Section (" + customer_name + " - 0" + ph_numb + "): ***\n"
                + "To select an item, enter:\n"
                + "* 1: Reservation\n"
                + "* 2: Order Food";
        System.out.println(screenmsg_y);
        int productid = cin.nextInt();
        switch(productid)
        {
            case 1:
                System.out.println("Reservation!");
                branching.showAddedBranches();
                branching.chooseBranch();
                break;
            case 2:
                Menuo.orderFood();
                payment.paymentMethod();
                break;
            default:
                System.out.println("Error! Please try again.");
                break;
        }
    }
    

}
