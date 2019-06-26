package ParentChild_Keyword_Concepts;

// 					USE OF SUPER KEYWORD FOR METHODS

//Parent class or Superclass or base class
class Super_Keyword_Parent_Method {

//Overridden method
	void display() {
		System.out.println("Parent class method");
	}
}

//Child class or subclass or derived class
class Super_Keyword_Child_for_Methods extends Super_Keyword_Parent_Method {
	// Overriding method
	void display() {
		System.out.println("Child class method");
	}

	void printMsg() {
		// This would call Overriding method
		display();
		// This would call Overridden method
		super.display();
	}

	public static void main(String args[]) {
		Super_Keyword_Child_for_Methods obj = new Super_Keyword_Child_for_Methods();

		obj.printMsg();

	}
}