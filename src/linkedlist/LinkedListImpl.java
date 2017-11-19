 class Node {
	public String value;
	public Node next;
	
	public Node(String value) {
		this(value, null);
	}
	
	public Node(String value, Node next) {
		this.value = value;
		this.next = next;
	}
}

import java.util.NoSuchElementException;


public class LinkedListQueue  {
	private Node front, back;
	
	public LinkedListQueue() {
		front = null;
		back = null;
	}
	
	public boolean isEmpty() {
		  return front == null;
	}

	@Override
	public void enqueue(String str) {
	  	Node n = new Node(str);
      if(isEmpty()){
        front = n;
        back = front;
      } else {
        back.next = n;
        back = back.next;
      }
	}

	@Override
	public String dequeue() {
	    if(isEmpty()){
        throw new NoSuchElementException;
      }
      String s = front.value;
      front = front.next;
      
	}
  
  public String removeLast(){
    if(isEmpty()){
        throw new NoSuchElementException;
      }
    Node previous = null;
    // start front the front.
    Node current  = front;
    while( current.getNext() != null){
      previous = current;
      current = current.next;
    }
    Node result =tail;
    tail = previous;
    //consider the case of only one element.
    // after remove it will be empty.
    if(tail == null){
      head = null;
    }else{
      tail.next = null;
    }
    return result.value;
  }

}
