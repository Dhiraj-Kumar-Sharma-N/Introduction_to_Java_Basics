package Java_Basics;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// ------------------------- GENERIC STRING FUNCTIONS ------------------------------------------------------------		
		
		System.out.println("Lets start Java Basics");
		
		int i =10;
		int j=20;
		int sum = i+j;
		
		System.out.println("Sum of i & j is = " + sum);

		String str ="Payment $100 paid";

		System.out.println("Character at 8th position is = " + str.charAt(8));
		
		System.out.println(str.length());
		
		System.out.println(str.indexOf("1"));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.substring(10));
		
		System.out.println(str.substring(11,16));
		
		System.out.println(str.length());
		
		System.out.println(str.concat(" towards purchase"));
		
		System.out.println(str.contains("y"));
		
		System.out.println(str.contentEquals("Payment $100 paid"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(String.join("-", "Java", "is", "cool"));
	  
		String str1 = "      john cena       ";
		
		System.out.println(str1.trim());
		
		
//---------------------------- PALLINDROME - REVERSE OF THE STRING IS SAME AS ACTUAL STRING .---------------------------------

		String str2 = "madam";
		String str3 = "";
		
		for (int k=str2.length()-1;k>=0;k--) {
			
			str3 = str3 + str2.charAt(k);
		}
		
		if (str3.equalsIgnoreCase(str2)) {
			
			System.out.println("Its a PALLINDROME");
		}
		else {
			System.out.println("Its not a PALLINDROME");
		}
	}

}
