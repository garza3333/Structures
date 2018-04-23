package Lists;



/**
 *
 * @author Daniel
 */
public class Queue {
    int size;
    Node head,tail;
    public Queue(){
        this.head = tail = null;
    }
    private boolean isEmpty(){
        return this.head == null;
    }
    public void enqueue(Object value){
        this.enq(value);
    }
    public void dequeue(){
        this.deq();
    }
    public Object peek(){
        return this.pek();
    }
    public void show(){
        this.se();
    }
    private void enq(Object value){
        if(isEmpty()){
            this.head = tail =  new Node(value);
        }else{
            Node aux = tail;
            Node n = new Node(value);
            tail.setNext(n);
            n.setPrevious(aux);
            this.tail = n;
        }
        
    }
    private void deq(){
        
        Node aux = head;
        head = aux.getNext();
        aux.setNext(null);
        
    }
    private Object pek(){
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
