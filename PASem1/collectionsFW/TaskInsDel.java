package collectionsFW;
import java.util.*;

class operation{
	int index, element;
	public operation(int index, int element) {
		super();
		this.index = index;
		this.element = element;
	}
	public operation(int index) {
		this.index = index;
		this.element=0;
	}
	void addele(ArrayList<Integer> li) {
		li.add(index,element);
	}
	void delele(ArrayList<Integer> li) {
		li.remove(index);
	}
}

public class TaskInsDel {
	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		for(;n>0;n--)
		{
			System.out.println("Enter element");
			list.add(sc.nextInt());
		}
		String check = new String();
		System.out.println("INSERT(I) or DELETE(D)");
		check=sc.next();
		switch(check) {
		case "i":
		case "insert":
		case "Insert":
		case "INSERT":
		case "I": System.out.println("Enter element and index to insert at:");
				  int ele = sc.nextInt();
				  int ind = sc.nextInt()-1;
				  operation op = new operation(ind,ele);
				  op.addele(list);
				  break;
		case "delete":
		case "Delete":
		case "DELETE":
		case "d":
		case "D": System.out.println("Enter element and index to insert at:");
		  		  int inde = sc.nextInt()-1;
		  		  operation op2 = new operation(inde);
		  		  op2.delele(list);
		  		  break;
		default: System.out.println("Invalid choice");
				 break;
		}
		System.out.println(list);
		sc.close();
	}
}
