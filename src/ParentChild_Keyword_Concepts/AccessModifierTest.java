package ParentChild_Keyword_Concepts;

import Java_Basics.AccessModifiers;

public class AccessModifierTest extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessModifiers obj =  new  AccessModifiers();

//obj.PrivateMethod(); Private method cannot be accessed outside the class it is declared 
//obj.ProtectedMethod(); The method ProtectedMethod() from the type AccessModifiers is not visible
obj.PublicMethod();
// obj.DefaultMethod();The method DefaultMethod() from the type AccessModifiers is not visible

//protected method 

AccessModifierTest obj2 = new AccessModifierTest();

obj2.ProtectedMethod();

//System.out.println(obj.i); Private variable cannot be accessed outside the declared class
System.out.println(obj.j);
//System.out.println(obj.k);default variable cannot be accessed outside package 
System.out.println(obj2.l); //Only after inheritance the object of differnet class Protected variables are accesible 

	}

}
