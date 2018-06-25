package Lists;

import genericList.Node_T;

/**
 *
 * @author Daniel
 * @param <T>
 */
public class Queue_T<T> {
    int size;
    Node_T head;
    Node_T tail;
    public Queue_T(){
        this.head = tail = null;
    }
    private boolean isEmpty(){
        return this.head == null;
    }
    public void enqueue(T value){
        this.enq(value);
    }
    public void dequeue(){
        this.deq();
    }
    public T peek(){
        return this.pek();
    }
    public void show(){
        this.se();
    }
    private void enq(T value){
        if(isEmpty()){
            this.head = tail =  new Node_T(value);
        }else{
            Node_T aux = tail;
            Node_T n = new Node_T(value);
            tail.setNext(n);
            n.setPrevious(aux);
            this.tail = n;
        }
        
    }
    private void deq(){
        
        Node_T aux = head;
        head = aux.getNext();
        aux.setNext(null);
        
    }
    private T pek(){
        System.out.println(tail.getValue());
        return (T) tail.getValue();
    
    }
    
        private void se(){
        
        Node_T temp = head;
        System.out.print("[");
        while(temp.getNext()!=null){
            System.out.print(String.valueOf(temp.getValue())+",");
            temp = temp.getNext();
        } System.out.println(String.valueOf(temp.getValue())+"]");
    }
}
