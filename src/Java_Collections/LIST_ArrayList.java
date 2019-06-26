package Java_Collections;

import java.util.ArrayList;

public class LIST_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// can accept duplicate values 
		//ArraList,LinkedList,vector- Implementing List interface 
		//array have fixed size where as arraylist can grow dynamicaly 
		//you can access and insert any value in any index 
		
		
		ArrayList<Integer> ArrListOfInt = new ArrayList<Integer>();
		ArrayList<String> ArrListOfStr = new ArrayList<String>();

//  ---------------------------------   ADDING ELEMENTS INTO THE ARRAY LIST  ------------------------------------

		ArrListOfInt.add(100);
		ArrListOfInt.add(200);
		ArrListOfInt.add(300);

		System.out.println(ArrListOfInt);

		ArrListOfStr.add("Dhiraj");
		ArrListOfStr.add("Kumar");
		ArrListOfStr.add("Sharma");

		System.out.println(ArrListOfStr);

//  -----------------------   REMOVING ELEMENTS FROM THE ARRAY LIST USING INDEX OR STRING -----------------------

		ArrListOfInt.remove(1);
		System.out.println(ArrListOfInt);
		ArrListOfStr.add(2, "N"); // add string at index 2
		System.out.println(ArrListOfStr);
		ArrListOfStr.remove("Sharma");
		System.out.println(ArrListOfStr);

		for (int i = 0; i < ArrListOfInt.size(); i++) {
			System.out.println(ArrListOfInt.get(i));   // Get method to retrieve value 

		}
		for (int j = 0; j < ArrListOfStr.size(); j++) {
			System.out.println(ArrListOfStr.get(j));

		}

//  --------------------------   REMOVING ALL ELEMENTS FROM THE ARRAY LIST -------------------------------------

		// ArrListOfStr.removeAll(ArrListOfStr); //removes all the values

		System.out.println(ArrListOfStr);

//  -----------------------   VALIDATING IF AN ELEMENT IS PRESENT IN THE ARRAY LIST -------------------------------

		if (ArrListOfStr.contains("Kumar")) {

			System.out.println("Search exist and condition is true ");
		} else {

			System.out.println("Search does not exist and condition is false. ");
		}

//  -----------------------   FINDING THE INDEX OF AN ELEMENMT FORM THE ARRAYLIST  -------------------------------

		System.out.println(ArrListOfStr.indexOf("Dhiraj"));

		System.out.println(ArrListOfInt.indexOf(300));

//  -----------------------   FINDING THE SIZE OF  THE ARRAYLIST AND VALIDATING IF AYYALIST IS EMPTY  --------------
		

		System.out.println(ArrListOfStr.isEmpty());
		
		System.out.println(ArrListOfInt.size());
		
	}

}
