package Java_Basics;

public class AccessModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessModifiers obj =  new  AccessModifiers();

//obj.PrivateMethod(); Private method cannot be accessed outside the class it is declared 
obj.ProtectedMethod();
obj.PublicMethod();
obj.DefaultMethod();

// System.out.println(obj.i); Private variable cannot be accessed outside the declared class
System.out.println(obj.j);
System.out.println(obj.k);
System.out.println(obj.l);
	}

}
