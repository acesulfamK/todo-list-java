package mypackage.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Todo {
    String title;
    String content;
    LocalDate createdAt;
    LocalDate updatedAt;
    LocalDate dueDate;
    int priority;
    
    public Todo(String str){
        String[] datalist = str.split(",");
        this.title = datalist[0];
        this.content = datalist[1];
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        this.createdAt= LocalDate.parse(datalist[2],formatter);
        this.updatedAt = LocalDate.parse(datalist[3],formatter);
        this.dueDate= LocalDate.parse(datalist[4],formatter);
        this.priority = Integer.parseInt(datalist[5]);
    }

    @Override
    public String toString(){
        return this.title+","+this.createdAt+","+this.updatedAt;
    }
}
