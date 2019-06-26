package Code_Snippets;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {{12,33,43},{-90,44,67},{-55,-44,-99}};
		
		int max=a[0][0];
		
		for(int i=0;i<3;i++) {
						
			for(int j =0;j<3;j++) {
				
				if(a[i][j]>max) {
					
					max=a[i][j];
				}
			}
		}
		
	System.out.println("The Minimum value in the Integer Array is : "+max);
	}

}
