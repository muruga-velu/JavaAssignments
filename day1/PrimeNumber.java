package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
				
		int input = 15;
		boolean flag = true;
		
		for (int i = 2; i < input; i++) {
			
			if(input%i== 0)
			{
				flag = false;
				break;
			} 
			}
		
			if(flag == false)
			{
				System.out.println("Given number is not prime");
			}
			
			else
			{
				System.out.println("Given number is prime");
			}

	}

}
