import java.util.Scanner;

public class StaircaseProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	    int noOfWays = ways(n);
	    
	    System.out.println("No. of ways: " + noOfWays);
	}
	
	static int ways(int n){
		
		if(n<=1)
			return 1;
		
		
		return ways(n-1) + ways(n-2);
			
	}
	
}
