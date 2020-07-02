package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		//System.out.println(data);
		
		System.out.println("The Second Largest Number is:" +data[data.length-2]);

	}

}
