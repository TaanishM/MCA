package adidsa;

import java.util.Scanner;

public class Diceroll {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int faces = sc.nextInt();
		int dist = sc.nextInt();
		String step = new String();;
		steps(faces, dist, step);
		sc.close();
	}
	public static void steps(int faces, int dist, String step) {
		if(dist==0) {
			System.out.println(step);
			return;
		}
		if(dist<0) {
			return;
		}
		for(int i = 1;i<=faces;i++){
		steps(faces, dist-i, step+i+" ");
		}
	}
}
