package rms;

import java.io.*;
import java.util.*;
import java.math.*;

public class paymentMethod 
{
    protected String card_number, exp_date;
    protected int cvv;
    protected boolean cvv_check = true;
    Scanner cin = new Scanner(System.in);

    public int convertIntegerToDigit(int x) 
    {
        int count = 0;
        while (x != 0) {
            x /= 10;
            ++count;
        }
        return count;
    }
    
    public void protectCardNumb(String card)
    {
        String hiddenNumbers = "", last4 = card.substring(card.length()-4, card.length());
        int stars = card.length() - 4;
        for(int i = 0; i < stars; i++)
        {
            hiddenNumbers += "*";
        }
        System.out.println(hiddenNumbers + last4);
    }
    
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
                String cashmsg = "A waiter will collect your payment!\n";
                System.out.println(cashmsg);
                break;
            case 2:
                System.out.println("** Add Card");
                cin.nextLine();
                System.out.print("* Card Number: ");
                //card_number = cin.nextLong();
                card_number = cin.nextLine();
                protectCardNumb(card_number);
                System.out.print("* Exp. Date (MM/YY): ");
                exp_date = cin.nextLine();
                System.out.print("* CVV: ");
                do 
                {
                    cvv_check = true;
                    cvv = cin.nextInt();
                    if (convertIntegerToDigit(cvv) > 3 || convertIntegerToDigit(cvv) < 3) 
                    {
                        cvv_check = false;
                        System.out.println("* [Error]: CVV contains 3 numbers. Please enter a valid CCV!");
                    }
                } while (!cvv_check);

                break;
            default:
                System.out.println("Payment error! Please try again.");
                break;
        }
    }
}
