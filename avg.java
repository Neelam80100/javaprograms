package pro;
//Write a Java program to calculate the average value of array elements
public class avg {
	
     public static void main(String arg[]) {
   
    	// declare array and 
    	    // initialize it with values
    	    int array[] = {10, 20, 30, 40, 50};

    	    // initialize sum variable with 0
    	    int sum = 0;

    	    // add array elements
    	    for (int i=0; i<array.length; i++) {
    	      sum += array[i]; // sum = sum + array[i];
    	    }

    	    // display addition of the array element
    	    System.out.println("Sum of array elements= " + sum);
    	    //calculate average of the array
    	  float  average = sum / array.length;
    	  //display average of the array
           System.out.print("average of the array:" +average);
  }

}
