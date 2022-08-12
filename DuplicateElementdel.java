package pro;

//program to remove duplicate elements in an array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
class ArrayElement{
	void display() {
		// create an ArrayList from the array
	    // using asList() method of the Arrays class
	    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
	    System.out.println("ArrayList with duplicate elements: " + numbers);

	    // convert the ArrayList into a set
	    Set<Integer> set = new LinkedHashSet<>();
	    set.addAll(numbers);

	    // delete all elements of ArrayList
	    numbers.clear();

	    // add element from set to ArrayList
	    numbers.addAll(set);
	    System.out.println("ArrayList without duplicate elements: " + numbers);

	}

}
public class DuplicateElementdel {
		public static void main(String[] args) {
		//create object of class
		ArrayElement de=new ArrayElement();
		//calling method
		de.display();
	}

}
