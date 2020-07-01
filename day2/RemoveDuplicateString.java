package week1.day2;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] words = text.split("\\s+");
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
						
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count = count+1;
					if (count >1 ) {
						words[i]="";
					}
				}
			}
			
			System.out.println(words[i]+" ");
			
		}
			

	}

}
