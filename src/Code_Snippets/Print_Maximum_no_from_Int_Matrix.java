package Code_Snippets;

public class Print_Maximum_no_from_Int_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{2,4,6},{9,3,1},{2,0,5}};
		
		int max=arr[0][0];
		
		
		System.out.println("The Lenght of the Array = "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				System.out.println("Element at "+i +"," +j +" is ="+arr[i][j]);
				
				if (arr[i][j]>max) {
				
				max=arr[i][j];
											
				}
			}
			
		}
		
		System.out.println("The Maximum value in the Integer Array is : "+max );
	}

}
