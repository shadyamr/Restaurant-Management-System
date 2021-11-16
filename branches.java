package rms;

import java.io.BufferedReader;
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
    protected ArrayList<String> branchesNames = new ArrayList<>(Arrays.asList("El-Nozha", "El-Maady", "Madinet-Nasr"));
    protected ArrayList<String> AddedBranchesNames = new ArrayList<>();
    protected double CombinedSizes = branchesNames.size() + AddedBranchesNames.size();
    public branches() {
        this.choosenBranchName = 0;
    }

    public branches(int choosenBranchName, String choosenBranch) {
        this.choosenBranchName = 0;
        this.choosenBranch = null;
    }

    public void chooseBranch() {
        System.out.println("Please choose one of our branches on the screen.\n");
        for (int i = 0; i < branchesNames.size(); i++) {
            System.out.println(i + " for our " + branchesNames.get(i) + " branch.\n");
        }
        do {
            check = true;
            choosenBranchName = scan.nextInt();
            if (choosenBranchName > branchesNames.size()) {
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

    public void showbranches() {
        int y = 1,z = 1;
        System.out.println("The current branches are: ");
        for (int i = 0; i < CombinedSizes; i++) {
            System.out.println(y + " - " + branchesNames.get(i) + "\n");
            y++;
        }
        /*for (int i = 0; i < AddedBranchesNames.size(); i++) {
            System.out.println(y + " - " + AddedBranchesNames.get(i) + "\n");
            y++;
        }*/
    }

    public void writeinitialBranches() {
try {
            try (FileWriter mywrite = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\branches.txt",true)) {
                {
                    for (int i = 0; i < branchesNames.size(); i++) {
                        mywrite.write(branchesNames.get(i) + "\n");
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
                    branchesNames.add(myreader.next());
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
    
}
