package rms;

import java.io.*;
import java.util.*;

public class customer {

    branches branching = new branches();
    protected String customer_name;
    protected int ph_numb;
    Scanner cin = new Scanner(System.in);
    menu Menu = new menu();
    paymentMethod payment = new paymentMethod();
    tables tablereserve = new tables();

    public void customerChoose() {
        String screenmsg_x = "\n*** Customer Section: ***\n"
                + "** Please enter your information.";
        System.out.println(screenmsg_x);
        System.out.print("* Name: ");
        customer_name = cin.nextLine();
        System.out.print("* Phone Number: ");
        ph_numb = cin.nextInt();
        System.out.println("*** Customer Section (" + customer_name + " - 0" + ph_numb + "): ***\n");
        System.out.println("- Reservation Process -");
        branching.showAddedBranches();
        branching.chooseBranch();
        Menu.defineMaps();
        Menu.showAddedMainItems();
        Menu.orderFood();
        payment.paymentMethod();
        tablereserve.reserveTable();
        WriteTheOrder2();
        Menu.WriteTheOrder();
    }

    public void WriteTheOrder2() {
        try {
            try (FileWriter mywrite = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\order.txt", true)) {
                {
                    mywrite.write("Name: " + customer_name + "\n"
                            + "Phone number: " + ph_numb + "\n");
                }
                mywrite.close();
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
        }
    }
}
