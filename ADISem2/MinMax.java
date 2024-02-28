package adidsa;

import java.util.*; 

public class MinMax { 

    public static int maxVal(int arr[], int n) 
    {
      if(n == 1) 
        return arr[0]; 
          
        return Math.max(arr[n-1], maxVal(arr, n-1)); 
    }
    
    public static int minVal(int arr[], int n) 
    { 
      if(n == 1) 
        return arr[0]; 
          
        return Math.min(arr[n-1], minVal(arr, n-1)); 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
    	int size = 5;
        int arr[] = new int[size];
    	System.out.println("Enter value for array:");
        for(int i=0; i<size;i++) {
        	arr[i]=sc.nextInt();
        }
        int n = arr.length; 
        System.out.println("Max value:"+maxVal(arr, n));
        System.out.println("Min value:"+minVal(arr, n)); 
        sc.close();
    } 
} 