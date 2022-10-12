
public class Node {
	public Node next;
	public int data;

	// Creates an empty node.
	public Node(){
		next = null;
		data = Integer.MIN_VALUE;
	}

	// Creates a node storing the specified data.
	public Node (int data){
		next = null;
		this.data = data;
	}

	// Returns the node that follows this one.
	public Node getNext(){
		return next;
	}

	// Sets the node that follows this one.
	public void setNext (Node node){
		next = node;
	}

	// Returns the data stored in this node.
	public int getData(){
		return data;
	}

	// Sets the data stored in this node.
	public void setData (int elem){
		data = elem;
	}
	
	// Sets the data stored in this node.
	public String toString (){
		return Integer.toString(data);
	}	
}
