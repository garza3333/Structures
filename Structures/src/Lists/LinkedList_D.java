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
public class LinkedList_D  extends LinkedList_S{
    protected Node tail;
 
    public LinkedList_D(){
        head=tail=null;
    }
    
     /**
     * El método publico que llama al privado para agregar al final
     * @param value - valor a añadir
     * @override
     */ 
    @Override
    public void add(Object value){
        this.ad(value);
    }
    /**
     * El método que llama al privado para agregar al inicio
     * @param value - valor a agregar
     */
    @Override
    public void addFirst(Object value){
        this.addF(value);
    }
    /**
     * Método que llama al privado que añade a la posición indicada
     * @param value - valor a agregar
     * @param index - posición a la cual agregar
     */
    @Override
    public void addI(Object value ,int index){
        this.adI(value,index);
    }
    /**
     * Llama al método privado que elimina el Node con el valor indicado
     * @param value - valor a buscar para eliminar
     */
    @Override
    public void delete(Object value){
        this.del(value);
    }
    /**
     * Llama al método privado que borra un Node por su posición en la lista
     * @param index - posición la cual eliminar
     */
    @Override
    public void deleteI(int index){
        this.delI(index);
    }
    /**
     * añade un valor a la cola de la lista
     * @param value - valor a añadir
     */
    private void ad(Object value){
        if(isEmpty()){
            Node primero = new Node(value);
            head = tail=primero;
        }else{
            Node temp = head;
            while(temp.getNext()!= null){
            temp = temp.getNext();
        }
            Node ultimo = new Node(value);
            temp.setNext(ultimo);
            ultimo.setPrevious(tail);
            tail = ultimo;
  
        } size++;
    }
    /**
     * añade el valor a la cabeza de la lista y corre los demás hacia adelante
     * @param value - es el valor a insertar en un Node
     */
    private void addF(Object value){
        if(isEmpty()){
            head = tail = new Node(value);
        }else{
            Node temp = head;
            Node nuevo = new Node(value);
            nuevo.setNext(temp);
            temp.setPrevious(nuevo);
            
            head = nuevo;
            
    
        }
        ++size;
    }
    /**
     * añade un valor al indice que desee
     * @param value - valor a añadir
     * @param index - posición al cual añadir
     */
    public void adI(Object value ,int index){
        if(isEmpty() && index==0){
            Node primero = new Node(value);
            head = tail = primero;
        }else{
            if((index >= size-1) || (index < 0)){
                System.out.println("el indice "+index+" aun no existe");
                return;
            }else{
                if(index==0){
                    this.addF(value);
                }else{
            Node temp = head;
            int cont = 0;
            while(cont<index-1){
            temp = temp.getNext();
            cont++;
        }
            Node ultimo = new Node(value);
            ultimo.setNext(temp.getNext());
            temp.setNext(ultimo);
            ultimo.setPrevious(temp);
            temp.getNext().setPrevious(ultimo); }
  
         }
        }size++;
    }
    /**
     * Método para eliminar un valor en la lista
     * @param value - valor a encontrar y eliminar
     */
    private void del(Object value){
        Node temp = head;
        if(value.equals(temp.getValue())){
            head = temp.getNext();
        }else{
            int cont = 0;
            while(temp.getNext().getValue()!= value){
                temp = temp.getNext();
                cont++;
            }if(cont == this.getSize()-2){
                
                temp.getNext().setPrevious(null);
                temp.setNext(null);
            }else{
            temp.getNext().setNext(null);
            temp.getNext().setPrevious(null);
            temp.getNext().getNext().setPrevious(temp);
            temp.setNext(temp.getNext().getNext());

            }
        } size--;
    }
    /**
     * Este método busca la posición asignada y elimina el Node de la lista
     * @param index - posición a eliminar
     */
    private void delI(int index){
        if(index == 0){
            head = head.getNext();
        }else{
            Node temp = head;
            int cont = 0;
            while(cont < index-1){
                temp = temp.getNext();
                cont++;
            }if(index == size-1){
                temp.getNext().setPrevious(null);
                temp.setNext(null);
            }else{
            temp.getNext().setNext(null);
            temp.getNext().setPrevious(null);
            temp.getNext().getNext().setPrevious(temp);           
            temp.setNext(temp.getNext().getNext());
            }
        }
        size--;
    }

}
