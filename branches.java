package rms;

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
    protected ArrayList<String> branchesNames = new ArrayList<>(Arrays.asList("El-Nozha", "El-Maady", "Masr El-Gdeda"));

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
        branchesNames.add(x);
    }

    public void writefile() {
        try {
            try (FileWriter mywrite = new FileWriter("D:\\MIU Courses\\Object Oriented Programming\\branches.txt", true)) {
                {                 for (int i = 0; i < branchesNames.size(); i++) {
            mywrite.write(branchesNames.get(i)+ "\n");
        }                    
                }
                mywrite.close();
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
}
