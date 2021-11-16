package rms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class branches {

    Scanner scan = new Scanner(System.in);
    protected int choosenBranchName;
    protected String choosenBranch;
    protected boolean check = true;
    protected ArrayList<String> AddedBranchesNames = new ArrayList<>();
    public branches() {
        this.choosenBranchName = 0;
    }

    public branches(int choosenBranchName, String choosenBranch) {
        this.choosenBranchName = 0;
        this.choosenBranch = null;
    }

    public void chooseBranch() {
        System.out.println("Please choose one of our branches on the screen.\n");
        for (int i = 0; i < AddedBranchesNames.size(); i++) {
            System.out.println(i + " for our " + AddedBranchesNames.get(i) + " branch.\n");
        }
        do {
            check = true;
            choosenBranchName = scan.nextInt();
            if (choosenBranchName > AddedBranchesNames.size()) {
                check = false;
                System.out.println("Invalid option, please enter a valid one!");
            }
        } while (!check);
    }

    public void addBranch() {
        System.out.println("Enter the name of the new branch you want to add.\n");
        String x;
        x = scan.nextLine();
        AddedBranchesNames.add(x);       
    }
    
    public void showAddedBranches(){
    try {
            String strcurrentline;
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\branches.txt"));
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

    public void writeinitialBranches() {
try {
            try (FileWriter mywrite = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\branches.txt",true)) {
                {
                    for (int i = 0; i < AddedBranchesNames.size(); i++) {
                        mywrite.write(AddedBranchesNames.get(i) + "\n");
                    }
                }
                mywrite.close();
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }

    public void readBranches() {
        try {
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\branches.txt"));
            try (Scanner myreader = new Scanner(myobj)) {
                while (myreader.hasNext()) {
                    AddedBranchesNames.add(myreader.next());
                }
                myobj.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("an error occured");
        }
}
    
    public void writeAddedBranches() {
try {
            try (FileWriter mywrite = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\branches.txt",true)) {
                {
                    for (int i = 0; i < AddedBranchesNames.size(); i++) {
                        mywrite.write(AddedBranchesNames.get(i) + "\n");
                    }
                }
                mywrite.close();
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
    
    public void readAddedBranches() {
        try {
            BufferedReader myobj = new BufferedReader(new FileReader("D:\\MIU Courses\\Object Oriented Programming\\branches.txt"));
            try (Scanner myreader = new Scanner(myobj)) {
                while (myreader.hasNext()) {
                    AddedBranchesNames.add(myreader.next());
                }
                myobj.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("an error occured");
        }
}
    
 public void searchBranches(String branchName) throws FileNotFoundException{
 File file = new File("D:\\MIU Courses\\Object Oriented Programming/admin.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.contains(branchName)) {
                System.out.println("Branch name has been found, please enter the new name you want.");
            }
        } 
}
 
 public void removeBranch(String branchname){
 int index;
 index = scan.nextInt();
 AddedBranchesNames.remove(index);
 }
 
}
