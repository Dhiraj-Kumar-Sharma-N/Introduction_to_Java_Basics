package ParentChild_Keyword_Concepts;

public class Final_Keyword {

	// FINAL VARIABLE - VALUE CANNOT BE CHANGED/IT REMAINS CONSTANT

	final int speedlimit = 90;// final variable

	void run() {
		// speedlimit=400; FINAL VARIABLE VALUE CANNOT BE CHANGED
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		Final_Keyword obj = new Final_Keyword();
		obj.run();
	}
}
 
/*		//  FINAL METHOD - METHOD CANNOT BE OVERRIDDEN BUT CAN BE INHERITED 	 

class Bike {
	final void run() {
		System.out.println("running"); // Use of final keyword in Method
	}
}

class Final_Keyword extends Bike {
	// void run() Cannot override the final method from Bike
	{
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Final_Keyword honda = new Final_Keyword();
		honda.run();
	}
	*/
		//  FINAL CLASS - CLASS CANNOT BE EXTENDED BY A CHILD CLASS


/*final class Bike{}  

class Final_Keyword extends Bike{  //The type Final_Keyword cannot subclass the final class Bike
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
	  Final_Keyword honda= new Final_Keyword();  
  honda.run();  
  }  
} 
}*/

