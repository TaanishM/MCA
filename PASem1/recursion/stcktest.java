package recursion;

import java.util.Scanner;

public class stcktest
{
	private static int fact(int x)
	{
		if(x==0||x==1)
			return 1;
		return x*fact(x-1);
	}
	public static void main(String []args)
	{
		System.out.println("Enter positive integer: ");
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		int result=fact(num);
		System.out.print(result);
		scanner.close();
	}
}