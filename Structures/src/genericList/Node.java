package genericList;
/**
 * Clase Node para almacenamiento de información
 * @author Daniel
 * @param <T> generico
 */
public class Node <T> { 
    private Node previous;
    private Node next;
    private T value;
    
    
    
    public Node(){
        this(null);
    }
    /**
     * 
     * @param value - es el valor a almacenar
     */
    public Node(T value){
        this.value = value;
        this.next = null;
        this.previous = null;
     
    }
    /**
     * 
     * @param value - edita el valor del Node
     */
    public void setValue(T value){
        this.value =  value;
    }
    /**
     * 
     * @return - retorna el valor dentro del nodo 
     */
    public T getValue(){
        return this.value;
    }
    /**
     * 
     * @return retorna la posicion del siguiente Node
     */
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node node){
        this.next = node;
    }
    public void setPrevious(Node node){
        
        this.previous = node;
    }
    public Node getPrevious(){
    return this.previous;
    }

    
}
