import java.util.Scanner;

public class NewtonRaphson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find it's root: ");
		int N = sc.nextInt();
		
		//double root = Math.pow((double)N, 0.5);
		System.out.println("Make a guess: ");
		int initialGuess = sc.nextInt();
		double estimate = raphsonMethod(N, initialGuess);
		
		System.out.println("The estimated root is: " + estimate);
	}
	
	static double raphsonMethod(int N, int initialGuess ){
		double newGuess = initialGuess - newFunction(N, initialGuess);
		
		return newGuess;
	}
	
	static double newFunction(int N, int initialGuess){
		return (double)(((Math.pow((double)initialGuess, 2)) - N)/ (2*initialGuess));
	}
}
