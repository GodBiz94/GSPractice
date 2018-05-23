import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		findPrimes(n);
		sc.close();
	}

	static void findPrimes(int n) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				list.add(i);
				n = n / i;
			}

		}
    if(n<1)
    	System.out.println(n);
    else 
    	System.out.println("Prime Factors are: " + list);
	}

}
