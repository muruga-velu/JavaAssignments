package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="I am a software tester";
		String reverse ="";
		String[] word = test.split(" ");
		for (int i = 0; i < word.length; i++) {
			
			if(i%2 != 0) 
				{

				for (int j = word[i].length()-1; j >=0 ; j--) 
				{
					reverse = reverse + word[i].charAt(j);
				}
				
				System.out.println(reverse + "");
								
			}
			
			else
			{
				System.out.println(word[i] +"");
			}
			
		}
	}

}
