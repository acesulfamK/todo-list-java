package mypackage.controllers;

import mypackage.models.TodoList;
import mypackage.models.User;
import mypackage.models.Todo;
import mypackage.views.TodoListView;
import mypackage.views.TodoDetailView;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodoListController {

    private TodoList todoList;
    private TodoListView todoListView;
    private User user;
    private String filePath;
    
    public TodoListController(AppController controller){
        filePath = "./../resources/data/users_todo/"+controller.getUser()+".csv";
        todoList = new TodoList(filePath);
        todoListView = new TodoListView(this);
        user = controller.getUser();
    }
    
    
    public void addTodo(String title, String content, String endDate, String priority){
        LocalDate endDateOfLocalDate = LocalDate.parse(endDate,DateTimeFormatter.ofPattern("yyyyMMdd"));
        int priorityOfInt = Integer.parseInt(priority);
        Todo todo = new Todo(title,content,LocalDate.now(),LocalDate.now(),endDateOfLocalDate,priorityOfInt);
        todoList.add(todo);
    }
    public void deleteTodo(int input){
        todoList.delete(input);
    }
    
    public void displayTodoDetail(int n){
        new TodoDetailView(this,todoList.getTodo(n));
    }
    
    
    public User getUser(){
        return user;
    }
    
    public void showTodoList(){
        todoList.show();
    }
    
    public void saveTodoList(){
        todoList.save(filePath);
        System.out.println("Saved successfully");
    }
}
