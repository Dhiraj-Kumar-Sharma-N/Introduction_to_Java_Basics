package Java_Basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date obj= new Date();
		
		System.out.println(obj.toString());  // Sun Apr 28 11:00:13 IST 2019
				
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		System.out.println(sdf.format(obj)); // 04/28/2019

		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy E mm:hh:ss ");
		
		System.out.println(sdf1.format(obj)); // 04/28/2019 Sun 10:11:28 
	}

}
