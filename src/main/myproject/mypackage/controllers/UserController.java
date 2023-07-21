package mypackage.controllers;
import java.util.*;
import mypackage.models.User;
import mypackage.controllers.AppController;
import mypackage.views.LoginView;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;

public class UserController{
    private AppController controller;
    private LoginView loginView;

    public UserController(AppController controller){
        this.controller = controller;
        this.loginView = new LoginView(this);
    }
    
    public void setUser(String user){
        this.controller.setUser(user);
    }

    public static boolean containsName(String name){
        String csvFile = "../resources/data/userlist.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] values = line.split(",");
                if(name.equals(values[0]))
                    return true;
            }

            return false;
        } catch (IOException e) {
            System.out.println("Failed to read file");
            System.exit(1);
        }
        return false;
    }
    
    public static void saveNewUser(String name, String path){
        String filePath = "../resources/data/users_todo/"+name+".csv";
        File file = new File(filePath);
        try{
            if(file.createNewFile()){
                System.out.println("Make file successfully!!");
                FileWriter writer=  new FileWriter("../resources/data/userlist.csv",true);
                try(PrintWriter pw = new PrintWriter(writer)){
                    pw.println(name+","+path);
                    pw.flush();
                    System.out.println("Save user and pass successfully");
                }
            } else {
                System.out.println("File is already exist");
            }
        }catch (IOException e){
            System.out.println("Something went wrong!!!");
        }
    }
    
    public static boolean passCheck(String name, String pass){
        String csvFile = "../resources/data/userlist.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] values = line.split(",");
                if(name.equals(values[0]) && pass.equals(values[1]))
                    return true;
            }

            return false;
        } catch (IOException e) {
            System.out.println("Failed to read file");
            System.exit(1);
        }
        return false;
    }
    
    public static User getUser(String name){
        String csvFile = "../resources/data/userlist.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] values = line.split(",");
                if(name.equals(values[0]))
                    return new User(values[0]);
            }
            assert false: "NoSuchAName";
            return null;
            
        } catch (IOException e) {
            System.out.println("Failed to read file");
            System.exit(1);
        }
        return null;
    }
}