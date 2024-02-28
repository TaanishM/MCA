package recursion;

public class stringdel {
	public static void main(String args[])
	{
	 String str = "123:98724123:3.8";
	 String arr[] = str.split(":", -1);
	 
	 for (String a : arr)
		 System.out.println(a);
	
	int x = Integer.parseInt(arr[0]);
	long y = Integer.parseInt(arr[1]);
	float z = Float.parseFloat(arr[2]);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	}
}
