
package Trees;

/**
 *
 * @author Daniel
 */
public class Node<T extends Comparable<?>> {
	int key;
	Node right;
        Node left;
	//Node parent;
	public Node() {
		this(0);
	}
	public Node(int key) {
		this.key = key;
		this.right = null;
		this.left = null;
		
	}
	public int getKey() {
		return this.key;
	}
	public Node getRight() {
		return this.right;
	}
	public Node getLeft() {
		return this.left;
	}
//	public Node getParent() {
//		return this.parent;
//	}
	public void setRight(Node node) {
		this.right = node;
	}
	public void setLeft(Node node) {
		this.left = node;
	}
//	public void setParent(Node node) {
//		this.parent = node;
//	}    
}
