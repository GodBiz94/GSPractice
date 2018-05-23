import java.util.Scanner;

public class OptimalPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int[][] cost = { {1,2,3},{4,8,2},{1,5,2}};

		System.out.println("Enter the index to be reached: ");
		

		int optimal = minCost(cost, 2, 2);
		
		System.out.println("Optimal cost is: " + optimal);
	}

	static int minCost(int[][] cost, int m, int n) throws NullPointerException {

		if (n < 0 || m < 0)
			return Integer.MAX_VALUE;
		else if (m == 0 && n == 0)
			return cost[m][n];

		return cost[m][n] + min(minCost(cost, m - 1, n - 1), minCost(cost, m - 1, n), minCost(cost, m, n - 1));

	}
	
	static int min(int x, int y, int z){
		if(x<y)
			return (x<z) ? x : z;
		else 
			return (y<z) ? y : z;
	}

}
