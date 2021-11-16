package rms;
import java.io.*;
import java.util.*;
public class customer
{
    branches branching = new branches();
    protected String customer_name;
    protected long ph_numb;
    Scanner cin = new Scanner(System.in);
    menu Menu = new menu();
    paymentMethod payment = new paymentMethod();
    tables tablereserve = new tables();
    public void customerChoose()
    {
        String screenmsg_x = "\n*** Customer Section: ***\n"
                + "** Please enter your information.";
        System.out.println(screenmsg_x);
        System.out.print("* Name: ");
        customer_name = cin.nextLine();
        System.out.print("* Phone Number: ");
        ph_numb = cin.nextLong();
        System.out.println("*** Customer Section (" + customer_name + " - 0" + ph_numb + "): ***\n");
                System.out.println("- Reservation Process -");
                branching.showAddedBranches();
                branching.chooseBranch();
                Menu.defineMaps();
                Menu.orderFood();
                payment.paymentMethod();
                tablereserve.reserveTable();
        }
    }
