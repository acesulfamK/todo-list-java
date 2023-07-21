package mypackage.views;

import mypackage.controllers.TodoListController;
import mypackage.models.Todo;
import java.util.*;

public class TodoDetailView{
    private TodoListController controller;
    private Todo todo;

    public TodoDetailView(TodoListController contorller,Todo todo){
        this.controller = controller;
        this.todo = todo;
        do{
            this.showStatus();
        } while(showControlPanel());
    }
    
    private boolean showControlPanel(){
        System.out.println("[e] exit");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        switch(c){
            case 'e':
                return false;
            default:
                return true;
        }
    }
    
    private void showStatus(){
        System.out.println("Title:"+todo.getTitle());
        System.out.println("Content:"+todo.getContent());
        System.out.println("Created Date:"+todo.getCreatedAt());
        System.out.println("Last Updated Date:"+todo.getUpdatedAt());
        System.out.println("Due Date:"+todo.getDueDate());
        System.out.println("Priority:"+todo.getPriority());
    }
}