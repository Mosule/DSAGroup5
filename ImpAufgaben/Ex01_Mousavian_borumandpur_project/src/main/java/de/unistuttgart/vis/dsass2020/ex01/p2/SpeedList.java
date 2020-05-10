package de.unistuttgart.vis.dsass2020.ex01.p2;

public class SpeedList<T> implements ISpeedList<T> {

	class Node<T> {
		private T obj;
		private Node<T> next;
		private Node<T> shortcut; // the "n"th shortcut of this node
		public Node() {
			obj = null; next = null; shortcut = null;
		}
		public Node(T obj, Node<T> next, Node<T> shortcut) {
			this.obj = obj;
			this.next = next;
			this.shortcut = shortcut;
		}
		public void setElement(T obj) {
			this.obj = obj;
		}
		public T getElement() {
			return obj;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		public Node<T> getNext() {
			return next;
		}
		public void setShortcut(Node<T> shortcut) {
			this.shortcut = shortcut;
		}
		public Node<T> getShortcut() {
			return shortcut;
		}
	}
	Node<T> head;
	int count;
	int n;
	public SpeedList(int n) {
		head = new Node<>();
		this.n = n;
//		setShortcuts(n);
	}
	public boolean isEmpty() {
		return head.getNext() == null;
	}
	public int size() {
		return count;
		
	}
	public void prepend(T t) {
		//sets a new node before head
		Node<T> newNode = new Node<T>(t, head.getNext(), head.getShortcut());
		count++;
		head.setNext(newNode);
		Node<T> p = newNode;
		int i; //counter
		
		for (i=0; i<n; i++) {
			if (p.next != null) {
				p = p.next;
			}
		}
		newNode.shortcut = p;
		
	}
	public void append(T t) {
		Node<T> lastNode = head;
		// finds the last node
		while (lastNode.getNext() != null)
			lastNode = lastNode.getNext();
		Node<T> newNode = new Node<T>(t, null,null);
		count++;
		// sets the new node before null
		lastNode.setNext(newNode);
		//the nodes which are added the list by append cannot have a shortcut
	    
	}
	public T getElementAt(int pos) {
		if (pos<0 || pos>count) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> p = head;
	    int i = 0;
	    while(i < pos +1 && p.next != null)
	    {
	        p = p.next;
	        i++;
	    }
	    return p.getElement();
	}
	//gets the shortcut for node in position "pos" 
	public T getShortcutAt(int pos) {
		
		Node<T> p = head;
	    int i = 0;
	    while(i < pos +1  && p.next != null)
	    {
	        p = p.next;
	        i++;
	    }
	    Node<T> n = p.shortcut;
	    if (n.getElement() == null) {
	    	throw new IllegalArgumentException("there is no shortcut for this node");
	    }
	    else {
	    	return n.getElement();
	    	
	    }
	    
		
	}

}
