package mypackage.controllers;

import mypackage.views.*;
import java.util.*;

public class AppController{

    private LoginView loginView;

    public AppController(){
        this.loginView = new LoginView(this);
    }
    
    public void start(){
        // if there are GUIs this.loginView.setVisible(true);
    }

    public void loginSucceeded(){
        System.out.println("login Succeeded(this is in AppController)!!");
    }
}