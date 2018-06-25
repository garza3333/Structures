package Lists;

import genericList.Node_T;
/**
 *
 * @author Daniel
 * @param <T>
 */
public class Stack_T<T> {
    Node_T tail;
    Node_T head;
    int size;
    public Stack_T(){
    this.tail = this.head =null;
    }
    public void push(T value){
        this.in(value);
    }
    public T pop(){
        return this.del();
    }
    public T peek(){
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
    
    private void in(T value){
        if(isEmpty()){
            this.tail = this.head = new Node_T(value);
        }else{
            Node_T aux = tail;
            Node_T n = new Node_T(value);
            tail.setNext(n);
            n.setPrevious(aux);
            this.tail = n;
           
        }
        this.size++;
    }
    private T del(){
            Node_T aux = tail;
            aux.getPrevious().setNext(null);
            this.tail = aux.getPrevious();
        return (T) aux.getValue();
    }
    private T last(){
        System.out.println(tail.getValue());
        return (T) tail.getValue();
    }
        private void se(){
        
        Node_T temp = head;
        System.out.print("[");
        while(temp.getNext()!=null){
            System.out.print(temp.getValue()+",");
            temp = temp.getNext();
        } System.out.println(temp.getValue()+"]");
    }
    
}
