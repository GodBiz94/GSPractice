import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows: ");
		int r = sc.nextInt();
		System.out.println("Number of columns: ");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("enter the values: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		makeSpiral(r, c, arr);
		
	}

	static void makeSpiral(int r, int c, int[][] arr) throws NullPointerException {
		int r_start = 0;
		int c_start = 0;
		
		while(r_start < r && c_start < c){
			for(int i = c_start; i<c; i++){
				System.out.println(arr[r_start][i] + " ");
			}
			r_start++;
			
			for(int i = r_start; i<r; i++){
				System.out.println(arr[i][c - 1] + " ");
			}
			c--;
			
			if(r_start < r){
				for(int i = c -1; i>c_start; i--){
					System.out.println(arr[r-1][i] + " ");
				}
				r--;
			}
			
			if(c_start < c){
				for (int i = r-1; i >= r_start; --i)
                {
                    System.out.print(arr[i][c_start]+" ");
                }
                c_start++;
			}
		}

	}
}
