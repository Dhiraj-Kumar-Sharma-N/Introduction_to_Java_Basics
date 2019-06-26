package Java_Basics;

public class Arrays_LoopsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,9,2,8,3,7,4,6};
		int sum = 0;
		
		
		for (int i = 0; i < a.length; i++) {
			
			sum = sum +a[i];	
		}
		
		System.out.println("The sum of all the numbers in an integer array is =" + sum);
		
for (int k=a.length-1;k>=0;k--) {
			
			 System.out.println(a[k]);
			 
			 if (a[k]== 8) {
				
				 System.out.println("Integer 8 is located at index =" + k);
				 break;
			}
		}
		
		
	}

}
