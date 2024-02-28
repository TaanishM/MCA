public class LinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.push(4);
        list.insertAtEnd(5);
        
        list.print();
        
        list.removeHead(); 	//Added capability to search and delete (independent) elements from within the list
        
        list.insertOrder(4);
        
        System.out.println("\nOrdered Insert");
        
        list.print();
        
        list.searchList(5);
        
        System.out.println("\nDelete");
        list.delItem(5);
        list.print();
    }
}

class LinkedList{
    
	Node head;
    LinkedList(){
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
        Node node = new Node(x);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    
    void insertOrder(int x) {
    	Node node = new Node(x);
    	Node curr=head;
    	while(curr.next!=null && curr.next.val<node.val){
    		curr=curr.next;
    	}
    	node.next=curr.next;
    	curr.next=node;
    }
    
    void searchList(int x) {
    	Node curr = head;
    	int count = 0;
    	while(curr.val!=x) {
    		if(curr.next==null) 
    		{
    			System.out.println("\nNot found");
    			return;
    		}
    		else
    		curr=curr.next;
    		count++;
    	}
    	System.out.println("\n"+x+" found at "+(count+1));
    }
    
    void delItem(int x) {
    	Node curr=head;
    	while(curr.next!=null) 
    	{
    		if(curr.next.val==x) {
    			curr.next=curr.next.next;
    		}
    		else {
    			curr=curr.next;
    		}
    	}
    }
    
    void insertAtEnd(int x){
        Node node = new Node(x);
        if(head==null){
            head=node;
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next = node;
        }
    }
    
    void removeLast(){
        //list size is 0
        if(head==null){
            System.out.println("No node present");
            return;
        }
        
        if(head.next==null){
            head=null;
        }else{
        	Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }
    }
    void removeHead(){
        if(head==null){
            return;
        }
        head=head.next;
    }
}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next=null;
    }
}