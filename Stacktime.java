package adidsa;

public class Stacktime {
    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(10);
        list.push(4);
        list.push(5);
        list.push(23);
        list.push(7);
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
        System.out.println("Size: "+list.size());
        list.print();
    }
}

class Stack{
    
	Node head;
    Stack(){
        head=null;
    }
    
    int size(){
        Node curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        return size;
    }
    
    void print(){
        Node curr=head;
        printViaRec(curr);
      }
    
    void printViaRec(Node curr){
        if(curr==null)   return;
        System.out.println(curr.val);
        printViaRec(curr.next);
    }
    
    void push(int x){
        Node Node = new Node(x);
        if(head==null){
            head=Node;
        }else{
            Node.next=head;
            head=Node;
        }
    }
    
    int peek() {
    	if(head==null) {
    		return 0;
    	}
    	return head.val;
    }
    
    void pop() {
    	head=head.next;
    }

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next=null;
    }
   }
}
