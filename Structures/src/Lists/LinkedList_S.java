package Lists;

/**
 *
 * @author Daniel
 */
public class LinkedList_S {
    protected Node head;
    protected int size;
    
    
    /**
     * Este constructor pasa los valores por defecto a la cabeza y tamaño
     */
    public LinkedList_S(){
        this.head = null;
        this.size = 0;
    }
    /**
     * El método publico que llama al privado para agregar al final
     * @param value - valor a añadir
     */
    public void add(int value){
        this.ad(value);
    }
    /**
     * El método que llama al privado para agregar al inicio
     * @param value - valor a agregar
     */
    public void addFirst(int value){
        this.addF(value);
    }
    /**
     * Método que llama al privado que añade a la posición indicada
     * @param value - valor a agregar
     * @param index - posición a la cual agregar
     */
    public void addI(int value , int index){
        this.adI(value, index);
    }
    /**
     * Este métdoo llama al privado que busca un valor en la lsta
     * @param value - valor a buscar
     * @return - devuelve el valor 
     */
    public boolean contains(int value){
        return this.fdV(value);
        
    }
    /**
     * Método que llama al privado para buscar un valor por su indice
     * @param index - Posición de la cual sacar el valor
     * @return - retorna el valor
     */
    public Object findI(int index){
        Object r = this.fdI(index);
        return r;
    }
    /**
     * Llama al método privado que permite ver la lista en pantalla
     */
    public void see(){
        this.se();
    }
    /**
     * Llama al método privado que elimina el Node con el valor indicado
     * @param value - valor a buscar para eliminar
     */
    public void delete(int value){
        this.del(value);
    }
    /**
     * Llama al método privado que borra un Node por su posición en la lista
     * @param index - posición la cual eliminar
     */
    public void deleteI(int index){
        this.delI(index);
    }
    /**
     * Llama al método privado para obtener la referencia a un Node particular
     * @param value - valor para identificar al Node
     * @return - retorna la referencia al Node
     */
    public Node getNode(int value){
        Node r = this.findNode(value);
        return r;
    }
    /**
     * Llama al método privado para obtener la referencia a un Node particular
     * @param index - Posición de la cual sacar la referencia
     * @return - retorna la referencia al Node
     */
    public Node getNodeI(int index){
        Node r = this.findNodeI(index);
        return r;
    }
    /**
     * añade al final de la lista
     * @param value - valor a añadir
     */
    private void ad(int value){
        if(isEmpty()){
            head = new Node(value);
        }else{
        Node temp = head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }Node ultimo = new Node(value);
         temp.setNext(ultimo);}
         size++;
    }
    /**
     * añade el valor a la cabeza de la lista y corre los demás hacia adelante
     * @param value - es el valor a insertar en un Node
     */
    private void addF(int value){
        if(isEmpty()){
            head = new Node(value);
        }else{
            Node temp = head;
            Node nuevo = new Node(value);
            nuevo.setNext(temp);
            head = nuevo;
    
        }
        ++size;
    }
    /**
     * Añade un valor a cualquier parte de la lista siempre y cuando exista
     * @param value - valor a añadir
     * @param index - posición al cual añadir
     */
    private void adI(int value ,int index){
        if(isEmpty() && index==0){
            head = new Node(value);        
        }
            
        else{
            if((index>=size) || (index < 0)){
                System.out.println("el indice "+index+" aun no existe!");
                return;
        }else{
            if(index == 0){
                this.addF(value);
            }else if(index == this.size){
                this.ad(value);
            }else{
                int cont = 0;
                Node temp = head;
                while(cont < index-1){
                    temp = temp.getNext();
                    cont++;
                }Node nuevo = new Node(value);
                nuevo.setNext(temp.getNext());
                temp.setNext(nuevo);  
         }
        }}size++;
    }
    /**
     * Realiza una busqueda por valor 
     * 
     * @param value 
     * @return - Hasta que el valor coincida retorna los datos
     */
    private boolean fdV(int value){
        if(this.isEmpty()){
            System.out.println("Lista vacía");
            return false;
        }else{
            Node temp = head;
            while(temp.getValue()!=value){
                if(temp.getValue() == value){
                    return true;
                }
                temp = temp.getNext();
            }
            return false;
    }
    }
    /**
     * Realiza una busqueda por posición 
     * @param index - cantidad de veces a iterar 
     * @return - Hasta que el contador coincida con el index retorna el valor en esta posición
     */
    private Object fdI(int index){
        if(index>=size || index<0){
            System.out.println("indice fuera de rango");
            return null;
            
        }else{
        int cont = 0;
        Node temp = head;
 
        while(cont<=index){
            if(cont==index){
                return temp.getValue();
            }
            temp = temp.getNext();
            cont++;
            
        }
        }
  
        return null;

    }
    /**
     * Busca la referencia de un nodo con respecto a su valor
     * @param value - parametro para que reconozca el nodo
     * @return - retorna la referencia al nodo
     */
        private Node findNode(int value){

        Node temp = head;
        
        while(temp.getValue()!=value){
            temp = temp.getNext();
        }

        return temp;
        
    }
        /**
         * Busca la referencia de un nodo con respecto a su posición
         * @param index - cantidad de veces a iterar
         * @return - retorna la referencia al Node 
         */
        private Node findNodeI(int index){
    
        int cont = 0;
        Node temp = head;
        if(index >= size || index<0){
            System.out.println("indice fuera del rango");
            return null;
        }else{
            while(cont<=index){
                if(cont==index){
                    return temp;
                }else{
                temp = temp.getNext();
                cont++;
                }
            }
        }
        return null;
    }
    /**
     * verifica si la lista esta vacía 
     * @return - retorna true si es cierto si no entonces false
     */
    public boolean isEmpty(){
        return(head==null);
    }   
    public int getSize(){
        return size;
    }
    /**
     * muestra la lista completa
     */
    private void se(){
        
        Node temp = head;
        System.out.print("[");
        while(temp.getNext()!=null){
            System.out.print(String.valueOf(temp.getValue())+",");
            temp = temp.getNext();
        } System.out.println(String.valueOf(temp.getValue())+"]");
    }
    /**
     * Método para eliminar un valor en la lista
     * @param value - valor a encontrar y eliminar
     */
    private void del(int value){
        Node temp = head;
        if(value == temp.getValue()){
            head = temp.getNext();
        }else{
            while(temp.getNext().getValue()!= value){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
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
            }temp.setNext(temp.getNext().getNext());
             size--;
        }
    }
   
}
