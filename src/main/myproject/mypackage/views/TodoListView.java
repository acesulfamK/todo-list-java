package mypackage.views;
import mypackage.controllers.TodoListController;
import java.util.*;

public class TodoListView{
    
    private TodoListController controller;

    public TodoListView(TodoListController controller){
        System.out.println("TodoListView Contructor");
        this.controller = controller;
        displayTodoList();

        while(displayControlPanel())
            displayTodoList();
        controller.saveTodoList();
    }

    public void displayTodoList(){
        System.out.println("Todo List of "+controller.getUser()+" ===");
        controller.showTodoList();
    }
    
    public boolean displayControlPanel(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Command: [a]:add, [d]:delete, [e] exit");
        char c = scan.next().charAt(0);
        switch(c){
            case 'a':
                displayAddTodo();
                break;
            case 'd':
                displayDeleteTodo();
                break;
            case 'e':
                return false;
        }
        return true;
         
    
    }
    
    public void displayAddTodo(){
        Scanner scan = new Scanner(System.in);
        String title, content, endDate, priority;
        System.out.println("Input below:");
        System.out.print("title:");
        title = scan.nextLine();
        System.out.print("content:");
        content = scan.nextLine();
        System.out.print("End date:");
        endDate = scan.nextLine();
        System.out.print("priority:");
        priority = scan.nextLine();
        this.controller.addTodo(title,content,endDate,priority);
    }
    public void displayDeleteTodo(){
        System.out.println("Input the number of task");
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        controller.deleteTodo(input);
    }
    
}