
import Lists.Arreglo;
import Trees.BinarySearch_Tree;
import Trees.Node;



/**
 *
 * @author Daniel
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PILA
        
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//        s.push(5);
//        s.show();
//        s.pop();
//        s.pop();   
//        s.show();
//        s.pop();
//        s.show();
//        s.peek();

    //COLA
//        Queue q = new Queue();
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        q.enqueue(4);
//        q.enqueue(5);
//        q.enqueue(6);
//        q.show();
//        q.dequeue();
//        q.show();
//        q.dequeue();
//        q.show();
//        q.peek();
//    Arreglo a = new Arreglo(3);
//    a.add(1);
//    a.insertI(3,-1);
//    a.add(13213);
//    a.see();




//Arbol binario de busqueda

	BinarySearch_Tree b = new BinarySearch_Tree();
	
	
	
	b.insert(21);
	b.insert(15);
	b.insert(25);
	b.insert(14);
	b.insert(16);
	b.insert(24);
	b.insert(26);
	b.insert(27);
	
	
	
//	b.insert(100);
//	b.insert(90);
//	b.insert(110);
//	b.insert(80);
//	b.insert(70);
//	b.insert(50);
//	b.insert(1);
//	b.insert(150);
//	b.insert(350);
//	b.insert(155);
//	b.insert(140);
//	b.insert(141);
//	b.insert(142);
//	b.insert(143);
//	b.insert(144);
//	b.insert(91);
//	System.out.println(b.getHeight(b.getRoot()));
        b.remove(21);
	b.see();

//	
//	Node n = b.getRoot();
//
//	System.out.println(n.getKey());
//	n = n.getRight();
//	System.out.println(n.getKey());
//
//	System.out.println("HD "+n.getRight().getKey()+" HI "+n.getLeft().getKey());

	
//	System.out.println(b.findMax());
//        System.out.println(b.findMin());
    
        
        
        

    }
    
}
