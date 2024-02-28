package adidsa;

public class OccArr {
	public static void main (String []args) {
		int arr[]= {1,2,1,1,4,3};
		int x=1;
		int res[]=sol(0,x,arr,0);
		for(int i = 0; i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
	public static int[] sol(int idx, int trgt, int[] arr, int count) //practice this function
	{
		if(idx==arr.length)
		{
			int res[]=new int[count];
			return res;
		}
		if(arr[idx]==trgt)
		{
			int res[]=sol(idx+1,trgt,arr,count+1);
			res[count]=idx;
			return res;
		}
		else 
		{
			int res[]=sol(idx+1, trgt, arr, count);
			return res;
		}
	}
}
