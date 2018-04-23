package Lists;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Stack {
    Node tail,head;
    int size;
    public Stack(){
    this.tail = null;
    }
    public void push(Object value){
        this.in(value);
    }
    public Object pop(){
        return this.del();
    }
    public Object peek(){
        return this.last();
    }
    public boolean isEmpty(){
        return this.tail == null;
    }
    public void show(){
        this.se();
    }
    public int getSize(){
        return this.size;
    }
    
    private void in(Object value){
        if(isEmpty()){
            this.tail = this.head = new Node(value);
        }else{
            Node aux = tail;
            Node n = new Node(value);
            tail.setNext(n);
            n.setPrevious(aux);
            this.tail = n;
           
        }
        this.size++;
    }
    private Object del(){
        Node aux = tail;
        aux.getPrevious().setNext(null);
        this.tail = aux.getPrevious();
        return aux.getValue();
    }
    private Object last(){
        System.out.println(tail.getValue());
        return tail.getValue();
    }
        private void se(){
        
        Node temp = head;
        System.out.print("[");
        while(temp.getNext()!=null){
            System.out.print(temp.getValue().toString()+",");
            temp = temp.getNext();
        } System.out.println(temp.getValue().toString()+"]");
    }
    
}
