

public class DotProduct {

	public static void main(String[] args) {
		

		int[] a = { 1, 3, -5 };
		int[] b = { 4, -2, -1 };

		System.out.println("The dot product is: " + dotProduct(a, b));

	}
	
	static int dotProduct(int[]a, int[]b){
		if(a.length != b.length){
			throw new IllegalArgumentException("The dimensions have to be equal!");
		}
		
		int sum =0;
		for(int i =0; i<a.length; i++){
			sum += a[i] * b[i];
		}
		
		return sum;
			
	}
}
