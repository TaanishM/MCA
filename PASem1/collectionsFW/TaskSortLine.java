package collectionsFW;

import java.util.*;

class Checker implements Comparator<Player>
{

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.score == o2.score) {
			return o1.name.compareTo(o2.name);
		}
		else {
			return o2.score - o1.score;
		}
	}
	
}

class Player{
	String name;
	int score;
	@Override
	public String toString() {
		return "name=" + name + " score=" + score + "\n";
	}
	Player(String name, int score){
		this.name =	name;
		this.score = score;
		}
}

public class TaskSortLine {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of entries");
		int n = sc.nextInt();
		ArrayList<Player> ls= new ArrayList<Player>();
		
		int score;
		String name;
		
		while(n>0) {
			System.out.println("Enter name: ");
			name=sc.next();
			System.out.println("Enter score: ");
			score=sc.nextInt();
			ls.add(new Player(name,score));
			n--;
			}
		sc.close();
		
		Collections.sort(ls, new Checker());
		System.out.println(ls);
	}
}
