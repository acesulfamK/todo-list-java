import mypackage.controllers.UserController;
import mypackage.models.Todo;

public class Test{

    public static void main(String[] args){
        String str = "sanka test benkyo,kaigyoui yurusanai!!,20010403,20020403,20020715,6";
        Todo todo = new Todo(str);
        System.out.println(todo);
    }
}