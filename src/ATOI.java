
public class ATOI {
	public static void main(String[] args) {

		String str = "1000000000";
		
		long numValue = parseInt(str);
		
		System.out.println("The number is: " + numValue);
	}
	
	static long parseInt(String str) throws NumberFormatException{
		 long num = Integer.parseInt(str);
		
		return num;
	}
}
