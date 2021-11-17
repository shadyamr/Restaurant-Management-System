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
    protected String choosenMain;
    protected String choosenSide;
    protected String choosenDrink;
    protected String choosenDessert;
    tables tableinfo = new tables();
    branches branchinfo = new branches();
    protected int branchnumber;
    protected String tabletext;
    protected HashMap<String, Integer> MainItems = new HashMap<>();
    protected HashMap<String, Integer> SideItems = new HashMap<>();
    protected HashMap<String, Integer> DrinkItems = new HashMap<>();
    protected HashMap<String, Integer> DessertItems = new HashMap<>();

    public void defineMaps() {
        MainItems.put("Shawarma", 35);
        MainItems.put("Molokhiya", 30);
        MainItems.put("Kebda", 15);
        MainItems.put("Hawawshi", 20);
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
        DessertItems.put("Baqlawa", 25);
        DessertItems.put("Basboosa", 30);
        DessertItems.put("Balah El-Sham", 35);
        DessertItems.put("Kunafa", 40);
        DessertItems.put("Om-Ali", 25);
    }

    public void orderFood() {
        System.out.println("Please choose your main-dish! Write only ONE choice per course!\n"
                + "MAIN DISHES\n"
                + "Our available main dishes " + MainItems.entrySet() + "\n");
        choosenMain = scan.nextLine();
        System.out.println("Please choose your side-dish!\n"
                + "SIDE DISHES\n"
                + "Our available sides: " + SideItems.entrySet() + "\n");
        choosenSide = scan.nextLine();
        System.out.println("Please choose your drink!\n"
                + "DRINKS\n"
                + "Our available drinks: " + DrinkItems.entrySet() + "\n");
        choosenDrink = scan.nextLine();

        System.out.println("Please choose your dessert!\n"
                + "DESSERTS!\n"
                + "Our available desserts: " + DessertItems.entrySet() + "\n");
        choosenDessert = scan.nextLine();
        System.out.println("Thanks for ordering, the price of the ordered items = " + (MainItems.get(choosenMain) + SideItems.get(choosenSide) + DrinkItems.get(choosenDrink) + DessertItems.get(choosenDessert)) + "\n");
    }

    public void AddMainToMenu() throws IOException {
        FileWriter fw = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\mainitems.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("Enter the name of the new main you want to add.\n");
        String x;
        x = scan.nextLine();
        int y;
        System.out.println("Enter the price of the item.");
        y = scan.nextInt();
        MainItems.put(x, y);
        //System.out.println(MainItems.entrySet() + "\n");

        try {

            bw = new BufferedWriter(new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\mainitems.txt", true));

            for (Map.Entry<String, Integer> entry
                    : MainItems.entrySet()) {

                bw.write(entry.getKey() + ":"
                        + entry.getValue());

                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
        } finally {

            try {

                bw.close();
            } catch (IOException e) {
            }
        }
    }

    public void AddSideToMenu() throws IOException {
        FileWriter fw = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\sideitems.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("Enter the name of the new side you want to add.\n");
        String x;
        x = scan.nextLine();
        int y;
        System.out.println("Enter the price of the item.");
        y = scan.nextInt();
        SideItems.put(x, y);
        //System.out.println(SideItems.entrySet() + "\n");

        try {

            bw = new BufferedWriter(new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\sideitems.txt", true));

            for (Map.Entry<String, Integer> entry
                    : SideItems.entrySet()) {

                bw.write(entry.getKey() + ":"
                        + entry.getValue());

                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
        } finally {

            try {
                bw.close();
            } catch (IOException e) {
            }
        }
    }

    public void AddDrinkToMenu() throws IOException {
        FileWriter fw = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\drinkitems.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("Enter the name of the new drink you want to add.\n");
        String x;
        x = scan.nextLine();
        int y;
        System.out.println("Enter the price of the item.");
        y = scan.nextInt();
        DrinkItems.put(x, y);
        //System.out.println(DrinkItems.entrySet() + "\n");

        try {

            bw = new BufferedWriter(new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\drinkitems.txt", true));

            for (Map.Entry<String, Integer> entry
                    : DrinkItems.entrySet()) {

                bw.write(entry.getKey() + ":"
                        + entry.getValue());

                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
        } finally {

            try {
                bw.close();
            } catch (IOException e) {
            }
        }
    }

    public void AddDessertToMenu() throws IOException {
        FileWriter fw = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\dessertitems.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("Enter the name of the new dessert you want to add.\n");
        String x;
        x = scan.nextLine();
        int y;
        System.out.println("Enter the price of the item.");
        y = scan.nextInt();
        DessertItems.put(x, y);
        //System.out.println(DessertItems.entrySet() + "\n");

        try {

            bw = new BufferedWriter(new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\dessertitems.txt", true));

            for (Map.Entry<String, Integer> entry
                    : DessertItems.entrySet()) {

                bw.write(entry.getKey() + ":"
                        + entry.getValue());

                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
        } finally {

            try {
                bw.close();
            } catch (IOException e) {
            }
        }
    }

    public void showAddedMainItems() {
        try {
            String strcurrentline;
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\mainitems.txt"));
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
            System.out.println("an error occured");
        }
    }

    public void showAddedSideItems() {
        try {
            String strcurrentline;
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\sideitems.txt"));
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
            System.out.println("an error occured");
        }
    }

    public void showAddedDrinkItems() {
        try {
            String strcurrentline;
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\drinkitems.txt"));
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
            System.out.println("an error occured");
        }
    }

    public void showAddedDessertItems() {
        try {
            String strcurrentline;
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\dessertitems.txt"));
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
            System.out.println("an error occured");
        }
    }

    public void WriteTheOrder() {
        if (tableinfo.tablechoice == 1) {
            tabletext = "Yes";
        } else {
            tabletext = "No";
        }

        try {
            try (FileWriter mywrite = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\order.txt", true)) {
                {
                    mywrite.write("Smokers Table: " + tabletext + "\n"
                            + "Main dish: " + choosenMain + "\n"
                            + "Side dish: " + choosenSide + "\n"
                            + "Drink: " + choosenDrink + "\n"
                            + "Dessert: " + choosenDessert + "\n"
                            + "\n");
                }
                mywrite.close();
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
        }
    }
}
