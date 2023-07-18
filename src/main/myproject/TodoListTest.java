import mypackage.controllers.UserController;
import mypackage.models.Todo;
import mypackage.models.TodoList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class TodoListTest{

    public static void main(String[] args){
        TodoList todoList = new TodoList("./../resources/data/users_todo/taro.csv");
        todoList.show();
        todoList.delete(0);
        System.out.println("delete !!");
        todoList.show();
        System.out.println("add !!");
        todoList.add("ryokou","yoteiwotateru",LocalDate.now(),LocalDate.now(),LocalDate.now(),3);
        todoList.show();

    }
}