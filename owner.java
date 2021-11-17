package rms;

import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class owner {

    branches testing = new branches(); //Testing the methods
    menu testing2 = new menu();
    Scanner scan = new Scanner(System.in);

    public void readfile() {
        try {
            String strcurrentline;
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\project.txt"));
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

    public void parseFile(String fileName, String searchStr) throws FileNotFoundException { //Search
        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNext()) {
            String line = scan.nextLine().toLowerCase();
            if (line.contains(searchStr)) {
                System.out.println(line);
            }
        }
    }

    public void deletefile(int choose) {
        File myobj = new File("D:\\MIU Courses\\Object Oriented Programming\\project.txt");
        if (choose == 1) {//handle the error if the user enters letter not a number
            if (myobj.delete()) {
                System.out.println(myobj.getName() + ":file is deleted successfully");
            } else {
                System.out.println("unexpected error occured");
            }
        } else {
            exit(0);
        }
    }

    public String delete(String username, String password) {
        File myobj = new File("D:\\MIU Courses\\Object Oriented Programming\\project.txt");
        username = "";
        password = "";
        return null;
    }
    
    public static void editFile(String old_data, String new_data) {
        File fileToBeModified = new File("D:\\MIU Courses\\Object Oriented Programming\\admin.txt");

        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();

            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();

                line = reader.readLine();
            }

            String newContent = oldContent.replaceAll(old_data, new_data);
            writer = new FileWriter(fileToBeModified);

            writer.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing the resources

                reader.close();

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void chooseOption() throws FileNotFoundException, IOException {
        System.out.println("Please pick what do you want to modify.\n"
                + "1 - Branches\n"
                + "2 - Menu\n"
                + "3 - Employees\n");
        int x;
        x = scan.nextInt();
        int MenuChoice;
        if (x == 1) {
            System.out.println("1 - Check the current branches.\n"
                    + "2 - Add a new branch.\n"
                    + "3 - Edit a branch.\n"
                    + "4 - Remove a branch.\n");
            int BranchChoice = scan.nextInt();
            String y = scan.nextLine();
            if (BranchChoice == 1) {
                testing.showAddedBranches();
            } else if (BranchChoice == 2) {
                testing.addBranch();
                testing.writeAddedBranches();
                testing.readBranches();
                testing.readAddedBranches();
            } else if (BranchChoice == 3) {
                System.out.println("Please enter a branch to search for.");
                String NameOfBranch = scan.nextLine();
                testing.searchBranches(NameOfBranch);
            }
        } else if (x == 2) {
            System.out.println("1 - Check the current menu.\n"
                    + "2 - Add a new menu item.\n"
                    + "3 - Edit a menu item.\n"
                    + "4 - Remove a menu item.\n");
            MenuChoice = scan.nextInt();
            if (MenuChoice == 1) {
                testing2.defineMaps();
                testing2.showAddedMainItems();
                testing2.showAddedSideItems();
                testing2.showAddedDrinkItems();
                testing2.showAddedDessertItems();
            } else if (MenuChoice == 2) {
                System.out.println("What course do you want to add a menu item to?");
                int coursechoice;
                System.out.println("1- Main items.\n"
                        + "2 - Side items.\n"
                        + "3 - Drink items.\n"
                        + "4 - Dessert items.\n");
                coursechoice = scan.nextInt();
                switch (coursechoice) {
                    case 1:
                        testing2.AddMainToMenu();
                        break;
                    case 2:
                        testing2.AddSideToMenu();
                        break;
                    case 3:
                        testing2.AddDrinkToMenu();
                        break;
                    case 4:
                        testing2.AddDessertToMenu();
                    default:
                        break;
                }
            }
        } else if (x == 3) {

        }
    }
;
}
