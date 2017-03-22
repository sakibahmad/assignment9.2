/*
 * program to build any collection containing duplicates.
 *  Create its copy with all duplicates removed.
 */

//import util package
import java.util.*;

//defing class
public class Democopy {
	// main mehtod
	public static void main(String[] args) {
		// creating an array list of student
		ArrayList<String> n = new ArrayList<String>();
		System.out.println(" the names of student in class");
		// adding the nammes with duplicate value
		n.add("Ram");
		n.add("Shayam");
		n.add("Ram");
		n.add("Ravi");
		n.add("Kapil");
		n.add("Ram");
		// iterator for keeping the pointer on array
		Iterator it = n.iterator();
		// checking next element
		while (it.hasNext()) {
			// printing the next element
			System.out.println(it.next());
		}
		System.out.println("");
		/*
		 * Hashset removes duplicate value
		 */

		HashSet<String> m = new HashSet<String>();
		System.out.println("the names of student in class");
		System.out.println("removing duplicate names");
		// adding multiple value having duplicate value
		m.add("Ram");
		m.add("Shayam");
		m.add("Ram");
		m.add("Ravi");
		m.add("Kapil");
		m.add("Ram");
		// maintaing the reference
		Iterator its = m.iterator();
		while (its.hasNext()) {
			// printing the next element in HashSet
			System.out.println(its.next());
		}

	}

}
