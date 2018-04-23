
package Trees;

/**
 * @author Daniel
 */
public class BinarySearch_Tree {
	/**
	 * Métodos públicos del árbol
	 */
	
	Node root;
	/**
	 * Constructor del árbol le da valor nulo a la raíz
	 */
	public BinarySearch_Tree() {
		this.root = null;	
	}
	/**
	 * Busca el menor valor del árbol
	 * @return
	 */
	public int findMin(){
		return this.min();
	}
	/**
	 * Busca el mayor valor del árbol
	 * @return
	 */
	public int findMax() {
		return this.max(this.getRoot());
	}
	/**
	 * regresa true si la raíz es nula
	 * @return
	 */
	public boolean isEmpty() {
		return this.root == null;
	}
	/**
	 * retorna la raíz del árbol
	 * @return
	 */
	public Node getRoot() {
		return this.root;
	}
	/**
	 * Inserta un nuevo valor en el árbol
	 * @param key
	 * @return
	 */
	public boolean insert(int key) {
		return this.in(key,root);
	}
        /**
         * Elimina un nodo del arbol binario buscando el valor
         * @param key 
         */
        public void remove(int key){
             this.del(key,root);
        }
	/**
	 * Busca cualquier valor en el árbol
	 * retorna true si lo encuentra y si no , false
	 * @param key
	 * @return
	 */
	public boolean contains(int key) {
		return this.fi(key,this.root);
	}
	/**
	 * Imprime las llaves del árbol de menor a mayor
	 */
	public void inOrder() {
		this.printOrder(this.getRoot());
	}
	/**
	 * Imprime las llaves del árbol de mayor a menor
	 */
	public void noOrder() {
		this.printNorder(this.getRoot());
	}
	/**
	 * Imprime las llaves del árbol comenzando por la
	 * raíz luego el izquierdo y por ultimo el derecho
	 */
	public void preOrder() {
		this.printPreOrder(this.getRoot());
	}
	/**
	 * Imprime las llaves del árbol comenzando por el
	 * nodo izquierdo luego el derecho y por ultimo la raíz
	 */
	public void postOrder() {
		this.printPostOrder(this.getRoot());
	}
	/**
	 * Obtiene la altura del árbol desde la raiz
	 * @return
	 */
	public int getHeight() {
		return -1+this.height(this.getRoot());
	}
        /**
         * Obtiene la altura de un sub àrbol partiendo de un nodo cualquiera
         * @param node
         * @return 
         */
	public int getHeight(Node node) {
		return -1+this.height(node);
	}
	

	
	
	
	
	
	
	
	
	/**
	 * Métodos privados del árbol
	 * 
	 * 
	 */
	
	

	
	/**
	 * FINDMAX
	 * Busca el mayor valor del árbol
	 * @param node
	 * @return
	 */
	
	private int max(Node node) {
		if(node.right == null) {
			return node.getKey();
		}else {
			return max(node.getRight());
		}
		
	}
	/**
	 * FINDMIN
	 * Busca el menor valor del árbol
	 * @return
	 */
	private int min(){
		Node temp = getRoot();
		while(temp.left != null){
			temp = temp.left;
		}return temp.getKey();
	}


	/**
	 * INSERT
	 * inserta un nuevo elemento en el árbol
	 * @param key
	 * @param node
	 * @return
	 */
	private boolean in(int key,Node node) {
		if(isEmpty()) {
			this.root = new Node(key);
			
		}else {
			
			if(node.getKey() > key) {
	
				if(node.getLeft() == null) {
					node.left = new Node(key);
					return true;
				}else {
					return in(key,node.getLeft());
				}
			}else {
				if(node.getRight() == null) {
					node.right = new Node(key);
					return true;
				}else {
					return in(key,node.right);
				}
			}
		}return false;
	}
        /**
         * REMOVE 
         * Elimina un elemento del àrbol 
         * @param key
         * @param n
         * @return 
         */
        private Node del(int key,Node n){
            if(n == null){
                return n;
            }
            if(key < n.getKey()){
                n.left = del(key,n.left);
            }else if(key > n.getKey()){
                n.right = del(key,n.right);
            }else if(n.left != null && n.right != null){
                n.key = max(n.left);
                n.left = del(n.key,n.left);
            }else{
                n = n.left != null ? n.left : n.right;
            }
            return n;
            
        }
	/**
	 * FIND
	 * Encuentra cualquier valor en el árbol
	 * y retorna true , salvo que sea nulo
	 * @return
	 */
	private boolean fi(int key,Node node) {
		if(key==node.getKey()){
			return true;
			
		}else if(key<node.getKey()){
			if(node.getLeft()== null)
				return false;
			else
			return fi(key,node.getLeft());
			
	}else if(key >node.getKey()){
		if(node.getRight()==null)
			return false;
		else
			return fi(key,node.getRight());
		}return false;
		
	}
	/**
	 * INORDER
	 * Imprime las llaves del árbol de menor a mayor
	 * @param node
	 */
	private void printOrder(Node node) {
		if(node != null) {
			printOrder(node.getLeft());
			System.out.println(node.getKey());
			printOrder(node.getRight());
		}
	}
	/**
	 * !INORDER
	 * Imprime las llaves del árbol de mayor a menor
	 * @param node
	 */
	private void printNorder(Node node) {
		if(node!=null) {
			printNorder(node.getRight());
			System.out.println(node.getKey());
			printNorder(node.getLeft());
		}
	}
	/**
	 * PREORDER
	 * Imprime las llaves del árbol comenzando por la
	 * raíz luego el izquierdo y por ultimo el derecho
	 * @param node
	 */
	private void printPreOrder(Node node) {
		if(node!=null) {
			System.out.println(node.getKey());
			printPreOrder(node.getLeft());
			printPreOrder(node.getRight());
		}
	}
	/**
	 * POSTORDER
	 * Imprime las llaves del árbol comenzando por el
	 * nodo izquierdo luego el derecho y por ultimo la raíz
	 * @param node
	 */
	private void printPostOrder(Node node) {
		if(node!=null) {
			
			printPostOrder(node.getLeft());
			printPostOrder(node.getRight());
			System.out.println(node.getKey());
		}
	}
	/**
	 * HEIGHT
	 * @param node
	 * @return
	 */
	private int height(Node node) {
		if (node == null) {
		    return 0;
		}else {
		    int l = height(node.getLeft());
		    int r = height(node.getRight());
		    return 1 + this.max(l, r);
		}
		
	}
	/**
	 * Compara dos números y obtiene el mayor
	 * a menos de que sean iguales
	 * @param num1
	 * @param num2
	 * @return
	 */
	private int max(int num1 , int num2) {
		if(num1>=num2) {
			return num1;
		}else{
			return num2;
		 }
	}
	public void see() {
		String inicio = this.ini(" ",this.getHeight() *2);
		System.out.println(inicio+this.getRoot().getKey());
		this.pprint(this.getRoot(),this.getHeight(),3);
		
		
	}
	private String ini(String cadena,int num) {
		int cont = num;
		while(cont != 0) {
			cadena+="    ";
			cont--;
		}
		return cadena;
		
	}
	private void pprint(Node node,int r , int c) {
		System.out.println("");
		
		if(node.getLeft()!=null && node.getRight()!=null) {
			
		System.out.print(this.ini(" ", r)+node.getLeft().getKey()+this.ini(" ", r)+node.getRight().getKey()+this.ini(" ", r));
		
		this.pprint(node.getLeft(), r-1, c+1);
		this.pprint(node.getRight(), r-1, c+1);
		
		}else if(node.getLeft()!=null && node.getRight()==null) {
			
			System.out.print(this.ini(" ", r)+node.getLeft().getKey()+this.ini(" ", r)+this.ini(" ", r));
			this.pprint(node.getLeft(), r-1, c+1);
		}else if(node.getLeft()==null && node.getRight()!=null) {
			
			System.out.print(this.ini(" ", r)+this.ini(" ", r)+node.getRight().getKey()+this.ini(" ", r));
			this.pprint(node.getRight(), r-1, c+1);
		}
		
	}
        
        public void showTree(Node n){
            
            if(n == root){
                String s = ini("",height(n));
                System.out.println(s+n.getKey());
                if(n.right != null && n.left != null){
                    showTree(n.left);
                    showTree(n.right);
                    System.out.println("");
                    
                }else if(n.left != null && n.right == null){
                    showTree(n.left);
                    System.out.println("");
                }else if(n.right != null && n.right == null){
                    showTree(n.right);
                    System.out.println("");
                }else{
                    System.out.println("");
                    
                }
            }else{
                if(n.left != null && n.right != null){
                    String s = ini("",height(n.left));
                    System.out.print(s+n.left.getKey()+s+n.right.getKey());
                    showTree(n.left);
                    showTree(n.right);
                    System.out.println("");
                    
                }else if(n.left != null && n.right == null){
                    String s = ini("",height(n.left));
                    System.out.print(s+n.left.getKey()+s);
                    showTree(n.left);
                    System.out.println("");
                                     
                    
                }else if(n.right != null && n.left == null){
                    String s = ini("",height(n.right));
                    System.out.print(s+s+n.right.getKey());
                    showTree(n.right);  
                    System.out.println("");
                
            }else{
                    
                }
            }
        }
}
