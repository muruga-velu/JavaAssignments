package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 13;
		boolean isPrime = true;
		
		for (int i = 2; i < input; i++) {
			
			if(input%i== 0)
			{
				isPrime = false;
				break;
			} 
			}
		
			if(isPrime == true)
			{
				System.out.println("Given number is prime");
			}
			
			else
			{
				System.out.println("Given number is not prime");
			}

	}

}
