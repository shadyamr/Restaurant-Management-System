package rms;
import java.io.*;
import java.util.*;
public class paymentMethod 
{
    protected long card_number;
    protected int cvv;
    protected String exp_date;
    protected int numDigitss;
    Scanner cin = new Scanner(System.in);
    public void paymentMethod() 
    {
        String paymentMsg = "*** What is your payment method? ***\n"
                + "* 1. Cash\n"
                + "* 2. Credit or Debit Card.";
        System.out.println(paymentMsg);
        int default_payment = cin.nextInt();
        switch (default_payment) 
        {
            case 1:
                String cashmsg = "Please pay at the counter.\n"
                        + "Total price: [[TO BE ADDED]]";
                System.out.println(cashmsg);
                break;
            case 2:
                System.out.println("** Add Card");
                System.out.print("* Card Number: ");
                card_number = cin.nextLong();
                cin.nextLine();
                System.out.print("* Exp. Date (MM/YY): ");
                exp_date = cin.nextLine();
                System.out.print("* CVV: ");
                cvv = cin.nextInt();
                
                break;
            default:
                System.out.println("Payment error! Please try again.");
                break;
        }
    }
}
