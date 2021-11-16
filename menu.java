package rms;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    protected ArrayList<String> Main = new ArrayList<>();
    protected ArrayList<String> Side = new ArrayList<>();
    protected ArrayList<String> Drinks = new ArrayList<>();
    protected ArrayList<String> Dessert = new ArrayList<>();
    
    protected HashMap<String, Integer> MainItems = new HashMap<>();
    protected HashMap<String, Integer> SideItems = new HashMap<>();
    protected HashMap<String, Integer> DrinkItems = new HashMap<>();
    protected HashMap<String, Integer> DessertItems = new HashMap<>();
    public void defineMaps(){
    MainItems.put("Shawarma",35);
    MainItems.put("Molokhiya",30);
    MainItems.put("Kebda",15);
    MainItems.put("Hawawshi",20);
    SideItems.put("Salad", 10);
    SideItems.put("Tameeya", 10);
    SideItems.put("Bread", 5);
    SideItems.put("Soup", 20);
    SideItems.put("Fries", 10);
    DrinkItems.put("Pepsi", 8);
    DrinkItems.put("Seven-up", 8);
    DrinkItems.put("Fanta", 8);
    DrinkItems.put("Tea", 10);
    DrinkItems.put("Coffee", 15);
    DessertItems.put("Baqlawa",25);
    DessertItems.put("Basboosa",30);
    DessertItems.put("Balah El-Sham",35);
    DessertItems.put("Kunafa",40);
    DessertItems.put("Om-Ali",25);
}
    
        public void orderFood() {
            System.out.println("Please choose your main-dish!\n"
                + "MAIN DISHES\n"
                + "1 for our " + MainItems.entrySet() + "\n");
        do {
            check = true;
            choosenMainNum = scan.nextInt();
            if (choosenMainNum > 5) {
                check = false;
                System.out.println("Invalid option, please enter a valid one!");
            }
        } while (!check);

        /*System.out.println("Please choose your side-dish!\n"
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
        } while (!check);*/
    }
    
        public void AddMainToMenu() {
        System.out.println("Enter the name of the new main you want to add.\n");
        String x;
        x = scan.nextLine();
        int y;
        System.out.println("Enter the price of the item.");
        y = scan.nextInt();
        MainItems.put(x, y);
        System.out.println(MainItems.entrySet() + "\n");
        File file = new File("D:\\MIU Courses\\Object Oriented Programming\\mainitems.txt");
            BufferedWriter bf = null;

            try {

                // create new BufferedWriter for the output file
                bf = new BufferedWriter(new FileWriter(file));

                // iterate map entries
                for (Map.Entry<String, Integer> entry
                        : MainItems.entrySet()) {

                    // put key and value separated by a colon
                    bf.write(entry.getKey() + ":"
                            + entry.getValue());

                    // new line
                    bf.newLine();
                }

                bf.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {

                    // always close the writer
                    bf.close();
                } catch (Exception e) {
                }
            }
        }
    public void showAddedMainItems(){
    try {
            String strcurrentline;
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\menu.txt"));
            try (Scanner myreader = new Scanner(myobj)) {
                while ((strcurrentline = myobj.readLine()) != null) {

                    System.out.println(strcurrentline);
                }
                int data = myobj.read();
                while (data != -1) {
                    data = myobj.read();
                }
                myobj.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("an error occured");
        }
    }

    public void readMain() {
        try {
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\menu.txt"));
            try (Scanner myreader = new Scanner(myobj)) {
                while (myreader.hasNext()) {
                    Main.add(myreader.next());
                }
                myobj.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("an error occured");
        }
}
}
    
    /*public void readAddedMainItems() {
        try {
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\menu.txt"));
            try (Scanner myreader = new Scanner(myobj)) {
                while (myreader.hasNext()) {
                    Main.add(myreader.next());
                }
                myobj.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("an error occured");
        }
}
}*/
