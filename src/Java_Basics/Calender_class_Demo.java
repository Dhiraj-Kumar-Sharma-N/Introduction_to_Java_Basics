package Java_Basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender_class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calobj = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		System.out.println(sdf.format(calobj.getTime())); // 04/28/2019
		

		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy E mm:hh:ss ");
		
		System.out.println(sdf1.format(calobj.getTime())); // 04/28/2019 Sun 18:11:11 
		
		
		System.out.println(calobj.getTime());    // Sun Apr 28 11:18:44 IST 2019
		
		System.out.println(calobj.getTimeInMillis());  // 1556430573832 (from jan 1st 1970 )
		
		System.out.println(calobj.get(Calendar.DAY_OF_MONTH)); //28
		
		System.out.println(calobj.get(Calendar.DAY_OF_WEEK));  //1 (Sunday) 2- monday .....
		
		System.out.println(calobj.get(Calendar.AM)); // 0  0=AM ,1 = PM
		
		System.out.println(calobj.get(Calendar.AM_PM)); // 0=AM ,1 = PM
		
		System.out.println(calobj.get(Calendar.MAY));  //5 1- JANUARY ,5 MAY
		
		System.out.println(calobj.get(Calendar.JANUARY));  //1
		
		System.out.println(calobj.get(Calendar.DAY_OF_WEEK_IN_MONTH));  // 4 WEEKS IN THE MONTH
		
		System.out.println(calobj.get(Calendar.DATE));  //28
		
		System.out.println(calobj.get(Calendar.DAY_OF_YEAR));  //118 NO OF DAYS FROM JAN 1ST 2019
		
		System.out.println(calobj.get(Calendar.HOUR));   //11 11 AM HOUR
		
		System.out.println(calobj.get(Calendar.HOUR_OF_DAY));  //11
		
		System.out.println(calobj.get(Calendar.MINUTE));  //31 MINUTE
		
				
	}

}
