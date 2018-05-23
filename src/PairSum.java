import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []A = {1, 4, 45, 6, 10, -8};
		int n = 16;
		
		
		findPair(A, n);
	}
	
	static void findPair(int[]A, int sum){
		
		HashSet<Integer> table = new HashSet<>();
		
		for(int i =0; i<A.length; ++i){
			
			int temp = sum - A[i];
			
			if( temp >=0 && table.contains(temp)){
				System.out.println("The pair is " + A[i] + " & " + temp);
			}
			
			table.add(A[i]);
		}
		
		
	}
}
