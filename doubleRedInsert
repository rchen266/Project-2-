// Name: Michael Kukovec
// Email: kukovec@wisc.edu
// Team: AD
// TA: Sophie Stephenson
// Lecturer: Gary Dahl
// Notes to Grader: N/A

import org.junit.Test;
import static org.junit.Assert.*;

public class TestRedBlackTree {

	@Test
	public void doubleRedInsert() {
		// Double red insertion
		RedBlackTree<Integer> myTree = new RedBlackTree<Integer>();
		myTree.insert(5);
		myTree.insert(2);
		myTree.insert(1);
		if (!myTree.toString().equals("[2, 1, 5]")) {
			fail("Double red insertion not performed correctly");
		}
	}

	@Test
	public void duplicateInsert() {
		// Duplicate insertion
		RedBlackTree<Integer> myTree = new RedBlackTree<Integer>();
		myTree.insert(5);
		myTree.insert(2);
		try {
			myTree.insert(2);
			fail("Duplicate value exception not caught");
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void redParentSibling() {
		// Parent's sibling is red insertion
		RedBlackTree<Integer> myTree = new RedBlackTree<Integer>();
		myTree.insert(10);
		myTree.insert(5);
		myTree.insert(15);
		myTree.insert(2);

		if (!myTree.root.isBlack || !myTree.root.leftChild.isBlack || !myTree.root.rightChild.isBlack
				|| myTree.root.leftChild.leftChild.isBlack) {
			fail("Parent sibling red insertion not performed correctly");
		}
	}

	@Test
	public void blackParentSibling() {
		// Parent's sibling is black insertion
		RedBlackTree<Integer> myTree = new RedBlackTree<Integer>();
		myTree.insert(100);
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(175);
		myTree.insert(160);
		if (!myTree.toString().equals("[50, 25, 160, 100, 175]")) {
			fail("Parent sibling black insertion not performed correctly");
		}
	}

	@Test
	public void insertMovie() {
		// Insert a movie object
		RedBlackTree<Movie> myTree = new RedBlackTree<Movie>();
		String[] actors = new String[3];
		actors[0] = "Actor 1";
		actors[1] = "Actor 2";
		actors[2] = "Actor 3";
		myTree.insert(new Movie("Title", "Director", "Genre", 120, actors, 2020, 9.5));
		if (myTree.root.equals(null)) {
			fail("Movie object not inserted properly");
		}
	}

	@Test
	public void searchForMissingMovie() {
		// Look for a movie that isn't there
		RedBlackTree<Movie> myTree = new RedBlackTree<Movie>();
		String[] actors = new String[3];
		actors[0] = "Actor 1";
		actors[1] = "Actor 2";
		actors[2] = "Actor 3";
		myTree.insert(new Movie("Title", "Director", "Genre", 120, actors, 2020, 9.5));

		Movie myMovie = new Movie();

		try {
			FrontEnd.findMovie(myMovie, myTree).equals(null);
			fail("Found movie that shouldn't exist");
		} catch (NullPointerException e) {
			// do nothing, no movie was found
		}
	}
}
