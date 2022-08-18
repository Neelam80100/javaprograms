package pro;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
/*
 You are given a piece of Java code. You have to complete the code by writing down the handlers for exceptions thrown by the code. 
The exceptions the code may throw along with the handler message are listed below:

Division by zero: Print "Invalid division".
String parsed to a numeric variable : Print "Format mismatch".

Exceptions other than mentioned above : Any other exception except the above ones fall in this category.
 Print "Exception encountered".

Finally, after the exception is handled, print "Exception Handling Completed".

 */

public class ExceptionTest {

	public static void main(String[] args) {
		//Take input from user as string (Two Numbers n1 and n2)
	    //parse string in number using parseInt
	    //Divide n1/n2
		Scanner sc = new Scanner(System.in);
        String a= sc.nextLine(); 
        String b= sc.nextLine(); 

		try{
                        int n1 = Integer.parseInt(a);
                        int n2 = Integer.parseInt(b);
                        int n3=n1/n2;
                       
                System.out.println(n3); 
            }
            catch (ArithmeticException e) {
               
                System.out.println( "Invalid division");
            }
	
				
        catch(InputMismatchException e){
            System.out.println("Format mismatch");
        }
        catch(Exception e)
        {
            System.out.println("Exception encountered");
        }
		finally {
			System.out.println("Exception Handling Completed");
		}
	}

}
