
public class FirstminandMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Array = {20,10,35,90,89,6,12};
		int min=Array[0];
		int max =Array[0];
		
		for(int i=1;i<=Array.length-1;i++) {
			
			if(min>Array[i]) {
				int temp= min;
				min=Array[i];
				Array[i]=temp;
			}else if(max<Array[i]) {
				int temp= max;
				max=Array[i];
				Array[i]=temp;
			}
			
			
		}
		
		System.out.println("minimum number is:" +min);
		System.out.println("maxium number is:" +max);
	}

}
