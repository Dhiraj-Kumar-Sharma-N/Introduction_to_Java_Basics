package Code_Snippets;

public class Pallindrome_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str1 = "Madam";
		String Str2 = "";
		
		for (int i = Str1.length()-1; i >= 0; i--) {
			
			System.out.println(Str1.charAt(i));
			
			Str2 = Str2 +Str1.charAt(i);
			
		}
		
		if (Str2.equalsIgnoreCase(Str1)) {
			
			System.out.println("The given string is a Pallindrome");
		}
		else {
			System.out.println("The given string is not a Pallindrome");
		}
	}

}
