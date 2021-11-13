package rms;

import java.io.*;

public class login {

    private static String username, password;

    public login() {

    }

    public void createfile() {
        try {
            File file = new File("C:\\Users\\PC\\Desktop\\project.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writefile(String username,String password) {
        try {
            try (FileWriter mywrite = new FileWriter("C:\\Users\\PC\\Desktop\\project.txt", true)) {
                mywrite.write(username);
                mywrite.write(password);
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }

    public void setusername(String username) {
        login.username = username;
    }

    public void setpassword(String password) {
        login.password = password;
    }

    public String getusername() {
        return username;
    }

    public String getpassword() {
        return password;
    }

}