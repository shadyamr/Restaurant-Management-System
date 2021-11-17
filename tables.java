package rms;

import java.util.*;

public class tables {

    Scanner scan = new Scanner(System.in);
    protected int tablechoice;
    protected String tabletext;

    public void reserveTable() {
        System.out.println("Do you want a table in the smokers' area?\n"
                + "1- Yes\n"
                + "2- No\n");
        tablechoice = scan.nextInt();
        if (tablechoice == 1) {
            tabletext = "Yes";
        } else {
            tabletext = "No";
        }
    }
}
