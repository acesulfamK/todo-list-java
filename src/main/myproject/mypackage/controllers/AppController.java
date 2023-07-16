package mypackage.controllers;

import mypackage.views.LoginView;
import mypackage.views.TodoListView;
import mypackage.models.User;
import java.util.*;

public class AppController{

    private LoginView loginView;
    private TodoListView todoListView;
    private User user;



    public AppController(){
        this.loginView = new LoginView(this);
        System.out.println("login Succeeded(this is in AppController)!!");
        this.todoListView = new TodoListView(this);
    }
    
    public void setUser(String user){
        this.user = new User(user);
    }
    
    public void start(){
        // if there are GUIs this.loginView.setVisible(true);
    }

}