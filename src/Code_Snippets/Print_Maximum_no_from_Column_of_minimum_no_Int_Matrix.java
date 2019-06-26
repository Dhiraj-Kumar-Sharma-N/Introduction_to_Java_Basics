package Code_Snippets;

public class Print_Maximum_no_from_Column_of_minimum_no_Int_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{2,4,6},{9,3,1},{2,10,15}};
		
		int min=arr[0][0];
		
		int minColumnNo = 0;
		
		
				
		System.out.println("The Lenght of the Array = "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				System.out.println("Element at "+i +"," +j +" is ="+arr[i][j]);
				
				if (arr[i][j]<min) {
					
					min = arr[i][j];
				
					minColumnNo = j; 
					
				}
			}
			
		}
		
		int k =0;
		
		int max=arr[0][minColumnNo];
		
		while (k<3) {
			
			if(arr[k][minColumnNo]>max) {
		
		max=arr[k][minColumnNo];
		
		
	}
			
			k++;
	}
			
		System.out.println("The Minimum value in the Integer Array is : "+min );
		
		System.out.println("The Max value in the column containing the minumum value from the int matrix  ="+max);
	}

	}



