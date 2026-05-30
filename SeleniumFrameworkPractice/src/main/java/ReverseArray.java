import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String Sentance = "i like mango. Mango is my favourite fruit";
		//String[] Word = Sentance.split(" ");
		String[] Word = {"apple" ,"banana", "chiku", "Orange","kiwi"};
		int left= 0;
		int right = Word.length-1;
		System.out.println(Word.length);
		
		while(left<right) {
			String temp = Word[left];
			Word[left]=Word[right];
			Word[right]=temp;
			
			left++;
			right--;
			
			//StringBuilder reverse = new StringBuilder();
			//reverse.reverse(Word);
		}
		
		
		
		 String result = String.join(" ", Word);
		 
		 System.out.println(result);
		 
		//System.out.println(Arrays.toString(Word));
	}
	
	

}
