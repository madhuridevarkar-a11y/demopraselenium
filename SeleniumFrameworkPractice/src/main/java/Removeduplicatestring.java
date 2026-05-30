import java.util.HashSet;
import java.util.Set;

public class Removeduplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Sentenace = "java is good. java is langauge";
		//String[] words = Sentenace.split(" ");
		String[] words = {"banana", "orange","Apple" ,"banana","pears","orange"};
		Set<String> unique = new HashSet<String>();
		Set<String> duplicate = new HashSet<String>();
		for(String word:words) {
			
		unique.add(word);
				
			}
		
		System.out.println(unique);	
		}
			
		//System.out.println(duplicate);
	

}
