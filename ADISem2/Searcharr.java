public class Searcharr {
	public static void main(String []args) {
		int arr[] = {10,20,30,40,50,60};
		int target = 20;		//fix for absent values
		int index=0;
		search(arr,target,index); //convert to binary search
	}
	public static void search(int arr[], int target, int index)
	{
		if(index>arr.length){
			return;
		}
		if(arr[index]==target){
			System.out.println("Found at index "+index);
		}
		else{
			search(arr,target,index+1);
		}
	}
}
