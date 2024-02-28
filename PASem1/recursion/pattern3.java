package recursion;

import java.util.Scanner;

public class pattern3 {
	public static void main(String []args)
	{
		int a=0, b=0,i,j,k,l;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(i=num;i>=1;i--)
		{
			for(j=num;j>i;j--)
				System.out.print(" ");
			for(k=1;k<=i;k++)
				System.out.printf("%d%s",++a,"*");
			for(l=1;l<=i;l++)
			{
				System.out.printf("%d", ++b +i*i);
				if(l!=i)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
