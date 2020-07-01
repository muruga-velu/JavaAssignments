package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "madam";
		String rev ="";
		char[] word = input.toCharArray();
		
		for (int i = word.length-1; i >= 0; i--) 
		{
			rev = rev+word[i];
			
		}
		
		System.out.println("Input string is: "+input);
		System.out.println("Reverse string is: "+rev);
		
		if(input.equalsIgnoreCase(rev))
		{
			System.out.println("The number is palindrome");
		}
		
		else
		{
			System.out.println("The number is not palindrome");
		}

	}

}
