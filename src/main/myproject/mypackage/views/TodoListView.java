package mypackage.views;
import mypackage.controllers.AppController;
import mypackage.controllers.TodoListController;

public class TodoListView{
    private TodoListController todoListController;
    public TodoListView(AppController controller){
        System.out.println("Todo List of "+controller.getUser()+" ===");
        todoListController = new TodoListController(controller);
        todoListController.showTodoList();
    }
    
}