import java.util.*; 
  
public class SortMerge { 

    public static void sortedMerge(int a[], int b[], int res[], int n, int m) 
    {
        int x = 0, y = 0, z = 0; 
        while (x < n) { 
            res[z] = a[x]; 
            x++; 
            z++; 
        }
        while (y < m) { 
            res[z] = b[y]; 
            y++; 
            z++; 
        }
        Arrays.sort(res); 
    } 

    public static void main(String[] args)  
    { 
    	Scanner sc = new Scanner(System.in);
    	int size1 = 5,size2 = 5;
    	int arr1[] = new int[size1]; 
        int arr2[] = new int[size2];
        System.out.println("Enter elements of array 1:");
        for (int i = 0;i<size1;i++) {
        	arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of array 2:");
        for (int i = 0;i<size2;i++) {
        	arr2[i]=sc.nextInt();
        }
        int sortarr[]=new int[size1 + size2]; 
        sortedMerge(arr1, arr2, sortarr, size1, size2); 
      
        System.out.print("Sorted list:"); 
        for (int i = 0; i < size1 + size2; i++) 
            System.out.print(" " + sortarr[i]);
        sc.close();
    } 
} 