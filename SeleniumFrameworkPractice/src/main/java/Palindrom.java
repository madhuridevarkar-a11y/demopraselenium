
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palindrom = "madhuri" ;
		StringBuilder reversed = new StringBuilder(palindrom);
		reversed.reverse();
		System.out.println(reversed);
		
		/*for(int i=palindrom.length()-1;i>=0;i--)
		{
			reversed.append(palindrom.charAt(i));
		}
		String reverse= reversed.toString();
		System.out.println(reversed.toString());
		*/
	if (palindrom.contentEquals(reversed)) {
		
			System.out.println("String is Palnidrom");
	}else {
	System.out.println("String is not Palnidrom");
	}
	
	}

}
