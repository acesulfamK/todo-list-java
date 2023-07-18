package mypackage.controllers;

import mypackage.models.TodoList;
import mypackage.models.User;
import mypackage.controllers.AppController;

public class TodoListController {
    private TodoList todoList;
    
    public TodoListController(AppController controller){
        String filepath = "./../resources/data/users_todo/"+controller.getUser()+".csv";
        todoList = new TodoList(filepath);
    }
    
    public void showTodoList(){
        todoList.show();
    }
    
}
