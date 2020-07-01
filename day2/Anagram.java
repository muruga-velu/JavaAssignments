package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		
		int len1 = text1.length();
		int len2 = text2.length();
		
		if (len1 == len2) {
			
			char[] carr1 = text1.toCharArray();
			char[] carr2 = text2.toCharArray();
			
			Arrays.sort(carr1);
			Arrays.sort(carr2);
			
			if (Arrays.equals(carr1, carr2)) {
				
				System.out.println("The given numbers are Anagram");
				
			}
			
		} else {
			
			System.out.println("The given numbers are not Anagram");

		}
		
		

	}

}
