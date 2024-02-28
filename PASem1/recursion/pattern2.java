package recursion;

import java.util.Scanner;

public class pattern2 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		for(int i=0;i<x;i++)
		{
			for(int k=x-i;k>1;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		sc.close();
	}
	
}