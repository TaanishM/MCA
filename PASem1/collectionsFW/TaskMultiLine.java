package collectionsFW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Line{
	int arr[];

	public Line(int[] arr) {
		super();
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "\nLine [arr=" + Arrays.toString(arr) + "]";
	}
	
}

class Operate{
	Scanner sc = new Scanner(System.in);
	private ArrayList<Line> ls = new ArrayList<Line>();
	private int i, j;
	
	// INPUT function
	public void input() {
		System.out.print("Number of rows: ");
		int n = sc.nextInt();
		
		// Input numbers
		for (i = 0; i < n; i++) {
			System.out.printf("\nNumber of inputs for line %s: ",(i+1));
			int m = sc.nextInt();
			
			int arr[] = new int[m];
			
			if (m > 0) {
				System.out.printf("Enter %s numbers: ",m);
				for (j = 0; j < m; j++)
					arr[j] = sc.nextInt();
			}
			
			Line line = new Line(arr);
			ls.add(line);
		}
	}
	
	// PRINT function used to printing numbers of each line
	public void print() {
		System.out.println();
		
		int k = 1;
		for (Line l: ls) {
			System.out.printf("Line %s: ",k++);
			for (int num: l.arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	
	// out function
	public void out() {
		System.out.print("\nAmount to retrieve: ");
		int p = sc.nextInt();
		
		int out[][] = new int[p][2];
		
		// storing indexes
		for (i = 0; i < p; i++) {
			System.out.printf("Enter indexes %s: ",(i+1));
			out[i][0] = sc.nextInt();
			out[i][1] = sc.nextInt();
		}
		
		System.out.println("\nout:");
		for (i = 0; i < out.length; i++) {
			
			if (out[i][0]-1 < ls.size() && (out[i][1]-1) < ls.get(out[i][0]-1).arr.length)
				System.out.println(ls.get(out[i][0]-1).arr[out[i][1]-1]);
			else
				System.out.println("ERROR!");
		}
	}
}

public class TaskMultiLine {

	public static void main(String[] args) {
		Operate q = new Operate();
		
		q.input();
		q.print();
		q.out();
	}
}
