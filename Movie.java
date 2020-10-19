import java.util.Arrays;

// --== CS400 File Header Information ==--
// Name: Amulya Malapaka
// Email: amalapaka@wisc.edu
// Team: AD
// TA: Sophie Stephenson
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
public class Movie implements Comparable<Movie>{
	private RedBlackTree<Movie> movieOrganizer = new RedBlackTree();
	private String title;
	private String director;
	private String genre;
	private int runtime;
	private String[] act;
	private int year;
	private double ratings;
	
	public Movie() {
		title = "";
		director = "";
		genre = "";
		runtime = 0;
		this.act = null;
		year = 0;
		ratings = 0.0;
	}
	
	public Movie(String t, String d, String g, int rt, String[] act, int yr, double rating)
	{
		title = t;
		director = d;
		genre = g;
		runtime = rt;
		this.act = act;
		year = yr;
		ratings = rating;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public int getReleaseDate() {
		return year;
	}
	public int getRunTime() {
		return runtime;
	}
	public String getDirector() {
		return director;
	}
	public double getRatings() {
		return ratings;
	}
	public String getActors() {
		return Arrays.toString(this.act);
	}
	
	public void setTitle(String title) {
		this.title = title.toLowerCase();
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setReleaseDate(int year) {
		this.year = year;
	}
	public void setRunTime(int runTime) {
		this.runtime = runTime;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public void setActors(String[] actors) {
		this.act = actors;
	}
	@Override
	public String toString()
	{
		return "Title: " + title + " \n Director: " + director + "\n Genre: " + genre + "\n Runtime: " + runtime
				+ "\n Release: " + year + "\n Actors" + Arrays.toString(act) + "\n Ratings: " + ratings;
	}
	@Override
	public int compareTo(Movie o){
		if(title.compareTo(o.getTitle())>0)
		{
			return 1;
		}
		if(title.compareTo(o.getTitle())<0)
		{
			return -1;
		}
		return 0;
	}
	
	
}
