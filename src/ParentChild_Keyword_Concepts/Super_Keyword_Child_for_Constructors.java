package ParentChild_Keyword_Concepts;

// 					USE OF SUPER KEYWORD FOR VARIABLES

//Parent class or Superclass or base class
class Super_Keyword_Parent_Constructors{
	
public Super_Keyword_Parent_Constructors(){
	System.out.println("no-arg constructor of parent class");
}
//arg or parameterized constructor
public Super_Keyword_Parent_Constructors(String str){
	System.out.println("parameterized constructor of parent class = " + str);
}
}


//Child class or subclass or derived class
class Super_Keyword_Child_for_Constructors extends Super_Keyword_Parent_Constructors
{
	public Super_Keyword_Child_for_Constructors(){
	       /* super() must be added to the first statement of constructor 
		* otherwise you will get a compilation error. Another important 
		* point to note is that when we explicitly use super in constructor
		* the compiler doesn't invoke the parent constructor automatically.
		*/
		super(" hahaha ");
		System.out.println("Constructor of child class");

	   }
	 void display(){
			System.out.println("Method call success ");
		   }
  public static void main(String args[]){
	  Super_Keyword_Child_for_Constructors obj= new Super_Keyword_Child_for_Constructors();
	  obj.display();
  }
}