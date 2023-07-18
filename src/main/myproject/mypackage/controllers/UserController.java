package mypackage.controllers;
import java.util.*;
import java.io.*;
import mypackage.models.User;

public class UserController{
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
            assert true: "NoSuchAName";
            return null;
            
        } catch (IOException e) {
            System.out.println("Failed to read file");
            System.exit(1);
        }
        return null;
    }
}