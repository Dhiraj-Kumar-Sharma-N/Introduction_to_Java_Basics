package Code_Snippets;

import java.util.ArrayList;

public class PrintUniqueNumber_withCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 6, 2, 9, 4, 6, 4, 2, 6, 5, 2, 9, 6, 2, 6 ,9 };

		// 2 - 3,4 - 2, 6 = 4 ,8 = 1 ,5 =1 9 = 2

		ArrayList<Integer> arrlistofNum = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			if (!arrlistofNum.contains(arr[i])) {

				arrlistofNum.add(arr[i]);
				k++;

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {

						k++;

					}
				}
				System.out.println(arr[i] + " is repeated " + k + " times");
				
				if (k == 1) {
					System.out.println(arr[i] + " is a uniques number ");
				}
			}

		}
		System.out.println("Total number of values in array is = " + arr.length);

	}

}
