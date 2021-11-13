package rms;
import java.util.*;
public class branches {
    Scanner scan = new Scanner(System.in);
    protected String[] branchName = new String[]{"El-Nozha", "El-Maady", "Masr El-Gdeda"};
    protected int choosenBranchName;
    protected String choosenBranch;
    protected boolean check = true;
    public branches() {
        this.choosenBranchName = 0;
    }

    public branches(int choosenBranchName, String choosenBranch) {
        this.choosenBranchName = 0;
        this.choosenBranch = null;
    }
    
    public void chooseBranch() {
        System.out.println("Welcome to our restaurant!\n"
                + "Please choose one of our branches on the screen. \n"
                + "1 for our " + branchName[0] + " branch.\n"
                + "2 for our " + branchName[1] + " branch.\n"
                + "3 for our " + branchName[2] + " branch.\n");
        
        do {
            check = true;
            choosenBranchName = scan.nextInt();
            if (choosenBranchName > 3) {
                check = false;
                System.out.println("Invalid option, please enter a valid one!");
            }
        switch (choosenBranchName) {
            case 1:
                System.out.println("Thanks for choosing the " + branchName[0] + " branch of ours.\n");
                choosenBranch = branchName[0];
                break;
            case 2:
                System.out.println("Thanks for choosing the " + branchName[1] + " branch of ours.\n");
                choosenBranch = branchName[1];
                break;
            case 3:
                System.out.println("Thanks for choosing the " + branchName[2] + " branch of ours.\n");
                choosenBranch = branchName[2];
                break;
            default:
                break;
        }
    }while (!check);
    }
}
