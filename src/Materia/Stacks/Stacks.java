package Materia.Stacks;
import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stacks {
    private Node top; // Nodo en la cima de nuestra pila

    // Creamos la pila con la cima null o vacia
    public Stacks() {
        this.top = null;
    }

    public void push (int value){
        Node newNode = new Node(value); // Creamos un nuevo nodo con el valor
        newNode.setNext(top); // El nuevo nodo apunta al nodo anterior en la cima
        top = newNode; // Actualizamos la cima de la pila
    }

    // Metodo que retira el nodo de la cima
    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value= top.getValue();
        top= top.getNext();
        return value;
    }
    
    public boolean isEmpty() {
        return top == null;
    }

    public int peek(){
        
    }
}
