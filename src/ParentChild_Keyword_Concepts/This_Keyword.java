package ParentChild_Keyword_Concepts;

public class This_Keyword {

	int a;
	int b;

	public void setData(int a, int b) {
		/*
		 * a = a; the value of a is set to 2 b = b; the value of b is set to 3
		 */

		this.a = a; // this keyword refers to a variable which is at class level
		this.b = b;
	}

	public void showData() {
		System.out.println("Value of A =" + a);
		System.out.println("Value of B =" + b);
	}

	public static void main(String args[]) {
		This_Keyword obj = new This_Keyword();
		obj.setData(2, 3);
		obj.showData(); // this method will use the value of A & B at the class level which is still 0
	}
}
