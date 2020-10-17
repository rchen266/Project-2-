// --== CS400 File Header Information ==--
// Name: Rex Chen
// Email: rchen266@wisc.edu
// Team: AD
// TA: Sophie Stephenson
// Lecturer: Florian
// Notes to Grader: <optional extra notes>
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataWrangler {
    public static boolean load(RedBlackTree<Movie> movies) {
        try {
            Scanner scanner = new Scanner(new File("Project 2 movies.txt"));
            while (scanner.hasNext()) {
                String t = scanner.nextLine();// get the title of the movie
                String d = scanner.nextLine();// get the director of movie
                String g = scanner.nextLine();// get the genre of the movie
                int r = scanner.nextInt();// the runtime of the movie
                int l = scanner.nextInt();// the lenghth of the actors table
                scanner.nextLine();
                String[] s = new String[l];
                for (int i = 0; i < l; i++)//create a new array to put the names in
                {
                    s[i] = scanner.nextLine();
                }
                int yrs = scanner.nextInt();
                double rating = scanner.nextDouble();
                Movie m = new Movie(t, d, g, r, s, yrs, rating);
                movies.insert(m);

                scanner.nextLine();
                scanner.nextLine();

            }
            return true;
        } catch (IOException e) {
            System.out.println("File not found.");
            return false;
        }
    }
}
