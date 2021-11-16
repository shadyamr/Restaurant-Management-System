package rms;
import java.io.*;
import java.util.*;
public class customer
{
    Scanner cin = new Scanner(System.in);
    menu Menuo = new menu();
    paymentMethod payment = new paymentMethod();
    public void customerChoose()
    {
        String screenmsg = "*** Customer Section: ***\n"
                + "To select an item, enter:\n"
                + "* 1: Reservation\n"
                + "* 2: Order Food\n";
        System.out.println(screenmsg);
        int productid = cin.nextInt();
        switch(productid)
        {
            case 1:
                System.out.println("Reservation!");
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