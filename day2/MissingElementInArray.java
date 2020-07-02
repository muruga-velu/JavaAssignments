package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = { 1, 2, 3, 4, 7, 6, 8 };
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			if((i+1)!= numbers[i]){
				
				System.out.println("The missing number is: "+(i+1));
				break;
			}
		}
		

	}

}
