import java.util.Scanner;
/*
 * Using a single scan method to reduce complexity
 * 
 * 
 * 
 */
public class SecondSmallestInUnsortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
	   findSecondSmallest(arr);
		
	}
	
	static void findSecondSmallest(int[] arr){
		int first, second, n = arr.length;
		
		if(n<2){
			System.out.println("Invalid request");
		}
		
		first = second = Integer.MAX_VALUE;
		for(int i =0; i<n; i++){
			if(arr[i] < first){
				second = first;
				first = arr[i];
			}
			else if(arr[i] < second && arr[i] != first){
				second = arr[i];
			}
		}
		if(second == Integer.MAX_VALUE){
			System.out.println("No second smallest");
		}
		else{
			System.out.println(second);
		}
	}
}
