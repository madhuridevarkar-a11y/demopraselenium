import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Removewhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fruit = "b a na n a";
		String animalname =" e#le$ph#an^t";
		String revisedfruit =  fruit.replaceAll("\\s+", "");
		String formattedString =  animalname.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(revisedfruit);
		System.out.println(formattedString);;
		
		String[] array1 = {"apple", "banana" , "orange"};
		String[] array2 = {"apple", "banana" , "orange", "chiku"};
		Set<String> common = new HashSet<>();
		Set<String> dupicate = new HashSet<>();
		if(Arrays.equals(array1,array2))
		{
			
			System.out.println("Array are equal");
		}else 
			System.out.println("Array are not equal");
		
		//find common
		for(String array: array1 ) {
		common.add(array);
		
	}
		for(String array: array2 ) {
			if(common.contains(array))
			dupicate.add(array);

}
		System.out.println(dupicate);
	}}
