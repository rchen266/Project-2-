// --== CS400 File Header Information ==--
// Name: Rex Chen
// Email: rchen266@wisc.edu
// Team: AD
// TA: Sophie Stephenson
// Lecturer: Florian
// Notes to Grader: <optional extra notes>
public class Movie implements Comparable<Movie> {
    private String title;
    private String director;
    private String genre;
    private int runtime;
    private String[] actors;
    private int year;
    private double ratings;

    public Movie(String t, String d, String g, int rt, String[] actor, int yr, double r) {
        title = t;
        director = d;
        genre = g;
        runtime = rt;
        this.actors = actor;
        year = yr;
        ratings = r;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getTitle();
    }

    @Override
    public int compareTo(Movie m) {
        if (title.compareTo(m.getTitle()) < 0) 
            return -1;
        
        if (title.compareTo(m.getTitle()) > 0) 
            return 1;
        
        return 0;
    }

}
