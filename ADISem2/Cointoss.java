package adidsa;
import java.util.Scanner;

public class Cointoss {
	public static void toss(int x, String ans)
	{
		if(x==0)
		{
			System.out.println(ans);
			return;
		}
		int len=ans.length();
		if(ans.length()==0 || ans.charAt(len-1)!='H') //delete entries with consecutive Heads
		toss(x-1,ans+"H");
		toss(x-1,ans+"T");
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String ans = new String();
		toss(n,ans);
		sc.close();
	}
}
