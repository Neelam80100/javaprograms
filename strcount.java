package pro;
//Java Program to count the total number of characters in a string (except space
public class strcount {
 
  public static void main(String[] args) 
  {    
        String str = "My Java Program";    
        int count = 0;    
        System.out.println("The entered string is: "+str);    
        //Count the characters in the string except space    
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) != ' ')    
                count++;    
        }                
        //Displays the total number of characters in the string    
        System.out.println("Total number of characters in the string: " + count);    
    }      
}