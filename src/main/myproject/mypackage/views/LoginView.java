package mypackage.views;
import mypackage.controllers.UserController;
import mypackage.views.RegistrationView;

import java.util.*;
public class LoginView{
    
    private UserController controller;
    
    public LoginView(UserController controller){
        this.controller = controller;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("If you want register, enter \" register \"");
            System.out.print("Input your name:");
            String name = scan.nextLine();
            if(name.equals("register")){
                new RegistrationView(controller);
                break;
            } else{
                System.out.print("Input your password:");
                String pass = scan.nextLine();
                if(UserController.passCheck(name,pass)){
                    this.controller.setUser(name);
                    break;
                } else {
                    System.out.println("Your name or pass are wrong!!");
                }
            }
        }

    }
}