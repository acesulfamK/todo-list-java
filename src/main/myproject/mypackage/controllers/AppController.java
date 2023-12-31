package mypackage.controllers;

import mypackage.views.LoginView;
import mypackage.views.TodoListView;
import mypackage.models.User;
import java.util.*;

public class AppController{

    private LoginView loginView;
    private TodoListController todoListController;
    private User user;

    public AppController(){
        System.out.println("login Succeeded(this is in AppController)!!");
        while(true){
            this.loginView = new LoginView(this);
            this.todoListController = new TodoListController(this);
        }
    }
    
    
    public void setUser(String user){
        this.user = new User(user);
    }
    
    public User getUser(){
        assert this.user != null: "This.user is not defined.";
        return this.user;
    }
    
    public void start(){
        // if there are GUIs this.loginView.setVisible(true);
    }

}