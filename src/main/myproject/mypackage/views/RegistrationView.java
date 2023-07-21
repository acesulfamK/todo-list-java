package mypackage.views;

import mypackage.controllers.UserController;
import java.util.*;


public class RegistrationView{
    public RegistrationView(UserController controller){
        Scanner scan = new Scanner(System.in);
        System.out.println("This is RegistrationView!!");
        while(true){
            System.out.print("Input your name:");
            String name = scan.nextLine();
            if(name == "register"){
                System.out.println("register is not userd;");
            } else if(UserController.containsName(name)){
                System.out.println("This name has already exist");
            } else {
                System.out.print("Input your password:");
                String pass = scan.nextLine();
                if(pass.length()<5){
                    System.out.println("Pass is too short");
                } else{
                    controller.setUser(name);
                    UserController.saveNewUser(name, pass);
                    break;
                }
            }
        }
    }
}