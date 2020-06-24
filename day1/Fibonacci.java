package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int firstNumber = 0; 
		int secondNumber = 1;
		
		for (int i = 1; i <=range; i++) {
			
			System.out.println(firstNumber);
			int sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
		}

	}

}
