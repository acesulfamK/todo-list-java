import mypackage.models.Todo;
import java.time.LocalDate;
public class TodoTest {
    public static void main(String[] args){
        Todo todo = new Todo("hello","this is a pen",LocalDate.now(),LocalDate.now(),LocalDate.now(),4);

        System.out.println(todo);
        System.out.println(todo.toStringForCsv());
        

    }
}
