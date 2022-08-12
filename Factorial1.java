package pro;
//program to find factorial of a number
import java.util.*;
public class Factorial1 {
    //create a method 
	void display() {
		//create an instance of scanner class
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		// take input from user
		int num = sc.nextInt();
		//calculating factorial
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

	}
		    public static void main(String[] args) {
              //create object of class
		    Factorial1 fact=new  Factorial1();	
		    //calling the method
		              fact.display();

	}

}
