
public class ReverseusingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits = {"apple" ,"banana", "chiku", "Orange","kiwi"};	
	    StringBuilder finalreverse = new StringBuilder();
	    
	    for (String fruit:fruits) {
	    	
	    	StringBuilder reverse = new StringBuilder(fruit);	
	    	
	    	reverse.reverse();
	    	System.out.println(reverse);
	    }
	    
	    
	    
		
		
		
	}		

}
