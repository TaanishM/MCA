package collectionsFW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Movie implements Comparable<Movie>
{
	int movieID, movieYear, movieRate;
	String movieName = new String();
	
	@Override
	public String toString() {
		return "\n [ID: "+movieID +", Name: "+movieName +", Year: "+movieYear +", Rating: "+movieRate +"]";
	}
	
	public Movie(int movieID, int movieYear, int movieRate, String movieName) {
		super();
		this.movieID = movieID;
		this.movieYear = movieYear;
		this.movieRate = movieRate;
		this.movieName = movieName;
	}

	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public int getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}
	public int getMovieRate() {
		return movieRate;
	}
	public void setMovieRate(int movieRate) {
		this.movieRate = movieRate;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public int compareTo(Movie o) {
		if(this.movieID>o.movieID)
		{return 1;}
		if(this.movieID<o.movieID)
		{return -1;}
		else {return 0;}
	}
	
}

class rateComp implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		
		if(o1.movieRate>o2.movieRate)
			{return -11;}
		else if(o1.movieRate<o2.movieRate)
		{return 1;}
		else {return 0;}
		
	}
}
class yearComp implements Comparator<Movie>
	{

		@Override
		public int compare(Movie o1, Movie o2) {
			
			if(o1.movieYear>o2.movieYear)
				{return -1;}
			else if(o1.movieYear<o2.movieYear)
			{return 1;}
			else {return 0;}
			
		}
	
}
class nameComp implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.movieName.compareTo(o2.movieName);
		}
}

public class TaskMovie {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Movie> ls = new ArrayList<Movie>();
		ls.add(new Movie(1,2022,72,"Talk To Me"));
		ls.add(new Movie(2,2023,68,"Reptile"));
		ls.add(new Movie(3,2023,86,"Killers of The Flower Moon"));
		ls.add(new Movie(4,2023,71,"Barbie"));
		ls.add(new Movie(5,2022,78,"Everything Everywhere All At Once"));
		
		System.out.println("Sort by Name(N), Year(Y), ID(ID), Rating(R)");
		String check = sc.next();
		
		switch(check) {
			case "Name":
			case "NAME":
			case "name":
			case "n":
			case "N":	Collections.sort(ls,new nameComp());
						break;
			
			case "Year":
			case "y":
			case "YEAR":
			case "year":
			case "Y": 	Collections.sort(ls, new yearComp());
						break;
						
			case "id":			
			case "ID":  Collections.sort(ls);
						break;
						
			case "Rating":
			case "rating":
			case "RATING":
			case "r":
			case "R":  	Collections.sort(ls, new rateComp());
						break;
						
			default : System.out.println("Invalid, ordered by ID");
					Collections.sort(ls);
					break;
		}
		
		System.out.println(ls);	
		sc.close();
	}
}
