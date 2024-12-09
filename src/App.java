import Controllers.MenuController;
import Materia.Stacks.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // runStack();        

        runContactMannager();

    }

    private static void runContactMannager(){
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }

    // public static void runStack(){
    //         Stack s= new Stack();

    //         s.push(5);
    //         s.push(7);
    //         s.push(10);
    //         s.push(20);

    //         s.prinStack();
    //         // s.getSizeStack();
    //         System.out.println("Tamano: "+s.getSizeStackComplejo());
    //         System.out.println("Top element is: " + s.peek());
    //         System.out.println("Popping-> " + s.pop());
    //         s.prinStack();
    //         s.getSizeStack();
    //         System.out.println("Top element is: " + s.peek());
    //         System.out.println("Popping-> " + s.pop());
    //         s.prinStack();
    //         s.getSizeStack();
    //         System.out.println("Top element is: " + s.peek());
    //         s.prinStack();
    //         s.getSizeStack();
            
    //     }
}
