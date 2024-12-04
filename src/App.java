import Materia.Stacks.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        runStack();        
    }

    public static void runStack(){
            Stacks s= new Stacks();

            s.push(5);
            s.push(7);
            s.push(10);
            s.push(20);

            s.prinStack();
            s.getSizeStack();
            System.out.println("Top element is: " + s.peek());
            System.out.println("Popping-> " + s.pop());
            s.prinStack();
            s.getSizeStack();
            System.out.println("Top element is: " + s.peek());
            System.out.println("Popping-> " + s.pop());
            s.prinStack();
            s.getSizeStack();
            System.out.println("Top element is: " + s.peek());
            s.prinStack();
            s.getSizeStack();
            
        }
}
