package Materia.Stacks;
import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {
    private Node top; // Nodo en la cima de nuestra pila
    private int size;

    // Creamos la pila con la cima null o vacia
    public Stack() {
        this.top = null;
       this.size = 0;
       size++; 
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
        size--;
        return value;
    }
    
    public boolean isEmpty() {
        return top == null;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void prinStack(){
        Node current = top;
        while(current!= null){
            System.out.print(current.getValue()+"| ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void getSizeStack(){
        int count = 0;
        Node current = top;
        while(current!= null){
            count++;
            current = current.getNext();
        }
        System.out.println("Tamaño de la pila: " + count);
    }

    public int getSizeStackComplejo(){
        return size;
    }
}
