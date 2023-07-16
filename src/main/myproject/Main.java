import mypackage.views.LoginView;
import mypackage.controllers.AppController;

public class Main{
    public static void main(String[] args){
        System.out.println("This is Main.");
        AppController appController = new AppController();
        appController.start();
    }
}