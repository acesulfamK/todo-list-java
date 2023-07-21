package mypackage.models;

import mypackage.models.Todo;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class TodoList {
    
    ArrayList<Todo> todoList = new ArrayList<>();

    public TodoList (String filepath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                this.todoList.add(new Todo(line));
            }

        } catch(IOException e){
            e.printStackTrace();
        }

    }
    
    public void delete(int n){
        todoList.remove(n);
    }
    
    public void add(Todo todo){
        todoList.add(todo);
    }
    
    public Todo getTodo(int n){
        return todoList.get(n);
    }

    public void add(
        String title,
        String content,
        LocalDate createdAt,
        LocalDate updatedAt,
        LocalDate dueDate,
        int priority
    ){
        todoList.add(new Todo(title,content,createdAt,updatedAt,dueDate,priority));
    }

    
    public void show(){
        for(int i=0;i<todoList.size();i++){
            System.out.println(""+i+": "+ todoList.get(i));
        }
    }

    
    public void save(String filepath){
        try(PrintWriter writer = new PrintWriter(filepath)){
            for(Todo todo: this.todoList){
                writer.println(todo.toStringForCsv());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
}
