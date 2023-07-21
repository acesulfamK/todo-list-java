package mypackage.views;
import mypackage.controllers.UserController;

import java.util.*;
public class LoginView{
    
    private UserController controller;
    
    public LoginView(UserController controller){
        this.controller = controller;
        System.out.println("LoginView Constructor!!");
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Input your name:");
            String name = scan.nextLine();
            if(UserController.containsName(name)){
                this.controller.setUser(name);
                break;
            } else {
                System.out.println("Your name is not registered!!");
            }
        }
    }
}