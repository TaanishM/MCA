package recursion;
import java.util.Scanner;
 
public class pattern1 {
	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		for(int i=0;i<=x;i++)
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------");
		
		for(int i=0;i<=x;i++)
		{
			for(int j=x;j>=i;j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}