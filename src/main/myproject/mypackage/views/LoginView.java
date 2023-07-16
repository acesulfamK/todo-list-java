package mypackage.views;
import mypackage.controllers.AppController;

import java.util.*;
public class LoginView{
    
    private AppController controller;
    
    public LoginView(AppController controller){
        this.controller = controller;
        System.out.println("LoginView Constructor!!");
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Input your name:");
            String name = scan.nextLine();
            if(name.equals("taro")){
                this.controller.loginSucceeded();
                break;
            } else {
                System.out.println("Your name is not registered!!");
            }
        }
    }
    


}