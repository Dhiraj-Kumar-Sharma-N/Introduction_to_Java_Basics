package ParentChild_Keyword_Concepts;

// 					USE OF SUPER KEYWORD FOR VARIABLES

//Parent class or Superclass or base class
class Super_Keyword_Parent_Variables
{
 int num = 100;
}
//Child class or subclass or derived class
class Super_Keyword_Child_for_Variables extends Super_Keyword_Parent_Variables
{
 /* The same variable num is declared in the Subclass
  * which is already present in the Superclass
  */
  int num = 110;
  void printNumber(){
	System.out.println(num);
  }
  public static void main(String args[]){
	  Super_Keyword_Child_for_Variables obj= new Super_Keyword_Child_for_Variables();
	obj.printNumber();	
  }
}