package Java_Basics;



public class AccessModifiers {
	
	private int i = 10;
	public int j =20;
	int k =30;
	protected int l = 40;
	
	void DefaultMethod() {
		
		System.out.println("Defalut method cannot be accessed outside the package");
	}
	
public void PublicMethod() {
		
		System.out.println("Public method can be accessed outside the package  by importing package.classname and then creatin an object");
	}


private void PrivateMethod() {
	
	System.out.println("Private method can only be accessed within the same class");
}

protected void ProtectedMethod() {
	System.out.println("Protected  method can be accessed outside the package only by subclass i.e.inherited");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessModifiers obj = new AccessModifiers();

obj.PrivateMethod();
obj.ProtectedMethod();
obj.PublicMethod();
obj.DefaultMethod();

System.out.println(obj.i);
System.out.println(obj.j);
System.out.println(obj.k);
System.out.println(obj.l);
	}

}
