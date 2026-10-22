package list;

public class LinkedList {
	Node HEAD;
	Node TAIL;
	
	public LinkedList() {
		this.HEAD=null;
	}
	
	public void appendWithTail(int value) {
		
	}
	
	public Node search(int value) {
		
	}
	
	public Node delete(int value) {
		
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		Node curNode = this.HEAD;
		if(this.HEAD==null) {
			this.HEAD=newNode;
		}else {
			while(curNode.next!=null) {
				curNode=curNode.next;
			}
			curNode.next=newNode;
		}
	}
	
	public void show() {
		Node curNode = this.HEAD;
		while(curNode!=null) {
			System.out.printf("----%s------\n", curNode.toString());
			System.out.printf("Value: %d - Next: %h\n", curNode.value,curNode.next);
			curNode=curNode.next;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.append(10);
		list.append(20);
		list.append(30);
		
		list.show();

	}

}
