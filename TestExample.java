package pro;

//Create a class named 'Shape' with a method to print "This is This is shape".
//Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print
//"This is rectangular shape" and "This is circular shape" respectively.
//Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
//Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.


//creating shape class
class Shape{
   //create method 
   public void Sha(){
     //display given message
     System.out.println("This is shape");}
   }

//creating Rectangle class and inherits shape class
class Rectangle extends Shape{
    //create method 
     public void Rec(){
    //display given message
    	 System.out.println("This is rectangle shape");}

}

//create circle class and inherit shape class
class Circle extends Shape{
	// create method 
	public void Cir(){
		//display given message
		System.out.println("This is circular shape");}
}

//create square class and inherits Rectangle class
class Square extends Rectangle{
	//create method
	public void Sqa(){
		//display given message
		System.out.println("Square is rectangle");}

}

 class TestExample{
	 public static void main(String[] args){
		 //create object of square class
		 Square sqt=new Square();
		 //call method of shape class using square class object
		 sqt.Sha();
		 //call method of Rectangle class using square class object
		 sqt.Rec();
	 }
}

