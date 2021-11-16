package rms;

import java.util.*;

public class menu {

    Scanner scan = new Scanner(System.in);
    protected String choosenAppetizer;
    protected String choosenMain;
    protected String choosenSide;
    protected String choosenDrink;
    protected String choosenDessert;
    protected int choosenAppetizerNum;
    protected int choosenMainNum;
    protected int choosenSideNum;
    protected int choosenDrinkNum;
    protected int choosenDessertNum;
    protected boolean check = true;
    protected String[] appetizers = new String[]{"Tahini", "Sambousek", "Hummus", "Baba Ghanoush", "Torshi"};
    protected String[] main = new String[]{"Shawarma", "Molokhiya", "Fatta", "Kebda", "Hawawshi"};
    protected String[] side = new String[]{"Salad", "Tameeya", "Bread", "Soup", "Fries"};
    protected String[] drink = new String[]{"Pepsi", "Seven-up", "Fanta", "Tea", "Coffee"};
    protected String[] dessert = new String[]{"Baqlawa", "Basboosa", "Balah El-Sham", "Kunafa","Om-Ali"};

    public void orderFood() {
        System.out.println("Please choose your appetizer!\n"
                + "APPETIZERS\n"
                + "1 for our " + appetizers[0] + "\n"
                + "2 for our " + appetizers[1] + "\n"
                + "3 for our " + appetizers[2] + "\n"
                + "4 for our " + appetizers[3] + "\n"
                + "5 for our " + appetizers[4] + "\n");
        do {
            check = true;
            choosenAppetizerNum = scan.nextInt();
            if (choosenAppetizerNum > 5) {
                check = false;
                System.out.println("Invalid option, please enter a valid one!");
            }
            switch (choosenAppetizerNum) {
                case 1:
                    System.out.println("Great choice!\n");
                    choosenAppetizer = appetizers[0];
                    break;
                case 2:
                    System.out.println("Great choice!\n");
                    choosenAppetizer = appetizers[1];
                    break;
                case 3:
                    System.out.println("Great choice!\n");
                    choosenAppetizer = appetizers[2];
                    break;
                case 4:
                    System.out.println("Great choice!\n");
                    choosenAppetizer = appetizers[3];
                    break;
                case 5:
                    System.out.println("Great choice!\n");
                    choosenAppetizer = appetizers[4];
                    break;
                default:
                    break;
            }
        } while (!check);

        System.out.println("Please choose your main-dish!\n"
                + "MAIN DISHES\n"
                + "1 for our " + main[0] + "\n"
                + "2 for our " + main[1] + "\n"
                + "3 for our " + main[2] + "\n"
                + "4 for our " + main[3] + "\n"
                + "5 for our " + main[4] + "\n");
        do {
            check = true;
            choosenMainNum = scan.nextInt();
            if (choosenMainNum > 5) {
                check = false;
                System.out.println("Invalid option, please enter a valid one!");
            }
            switch (choosenMainNum) {
                case 1:
                    System.out.println("Great choice!\n");
                    choosenMain = main[0];
                    break;
                case 2:
                    System.out.println("Great choice!\n");
                    choosenMain = main[1];
                    break;
                case 3:
                    System.out.println("Great choice!\n");
                    choosenMain = main[2];
                    break;
                case 4:
                    System.out.println("Great choice!\n");
                    choosenMain = main[3];
                    break;
                case 5:
                    System.out.println("Great choice!\n");
                    choosenMain = main[4];
                    break;
                default:
                    break;
            }
        } while (!check);
    
     System.out.println("Please choose your side-dish!\n"
                + "SIDE DISHES\n"
                + "1 for our " + side[0] + "\n"
                + "2 for our " + side[1] + "\n"
                + "3 for our " + side[2] + "\n"
                + "4 for our " + side[3] + "\n"
                + "5 for our " + side[4] + "\n");
        do {
            check = true;
            choosenSideNum = scan.nextInt();
            if (choosenSideNum > 5) {
                check = false;
                System.out.println("Invalid option, please enter a valid one!");
            }
            switch (choosenSideNum) {
                case 1:
                    System.out.println("Great choice!\n");
                    choosenSide = side[0];
                    break;
                case 2:
                    System.out.println("Great choice!\n");
                    choosenSide = side[1];
                    break;
                case 3:
                    System.out.println("Great choice!\n");
                    choosenSide = side[2];
                    break;
                case 4:
                    System.out.println("Great choice!\n");
                    choosenSide = side[3];
                    break;
                case 5:
                    System.out.println("Great choice!\n");
                    choosenSide = side[4];
                    break;
                default:
                    break;
            }
        } while (!check);
    System.out.println("Please choose a drink!\n"
                + "DRINKS\n"
                + "1 for our " + drink[0] + "\n"
                + "2 for our " + drink[1] + "\n"
                + "3 for our " + drink[2] + "\n"
                + "4 for our " + drink[3] + "\n"
                + "5 for our " + drink[4] + "\n");
    do {
            check = true;
            choosenDrinkNum = scan.nextInt();
            if (choosenDrinkNum > 5) {
                check = false;
                System.out.println("Invalid option, please enter a valid one!");
            }
            switch (choosenDrinkNum) {
                case 1:
                    System.out.println("Great choice!\n");
                    choosenDrink = drink[0];
                    break;
                case 2:
                    System.out.println("Great choice!\n");
                    choosenDrink = drink[1];
                    break;
                case 3:
                    System.out.println("Great choice!\n");
                    choosenDrink = drink[2];
                    break;
                case 4:
                    System.out.println("Great choice!\n");
                    choosenDrink = drink[3];
                    break;
                case 5:
                    System.out.println("Great choice!\n");
                    choosenDrink = drink[4];
                    break;
                default:
                    break;
            }
        } while (!check);
    
    System.out.println("Please choose a dessert!\n"
                + "DESSERTS\n"
                + "1 for our " + dessert[0] + "\n"
                + "2 for our " + dessert[1] + "\n"
                + "3 for our " + dessert[2] + "\n"
                + "4 for our " + dessert[3] + "\n"
                + "5 for our " + dessert[4] + "\n");
    do {
            check = true;
            choosenDessertNum = scan.nextInt();
            if (choosenDessertNum > 5) {
                check = false;
                System.out.println("Invalid option, please enter a valid one!");
            }
            switch (choosenDessertNum) {
                case 1:
                    System.out.println("Great choice!\n");
                    choosenDessert = dessert[0];
                    break;
                case 2:
                    System.out.println("Great choice!\n");
                    choosenDessert = dessert[1];
                    break;
                case 3:
                    System.out.println("Great choice!\n");
                    choosenDessert = dessert[2];
                    break;
                case 4:
                    System.out.println("Great choice!\n");
                    choosenDessert = dessert[3];
                    break;
                case 5:
                    System.out.println("Great choice!\n");
                    choosenDessert = dessert[4];
                    break;
                default:
                    break;
            }
        } while (!check);
    }
}