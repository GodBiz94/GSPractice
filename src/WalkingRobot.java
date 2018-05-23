import java.util.ArrayList;
import java.util.Scanner;

public class WalkingRobot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		findPosition(str);
	}
	
	static void findPosition(String str){
		
		
		
		ArrayList<Integer> mlist = new ArrayList<>();
		ArrayList<Integer> nlist = new ArrayList<>();
		
		
		int msum=0;
		int nsum=0;
		for(int i = 0; i<str.length(); i++ ){
		    
			if( str.charAt(i) == 'U'){
				mlist.add(1);
			}
			
			else if( str.charAt(i) == 'D'){
			    mlist.add(-1);
			}
		
			else if( str.charAt(i) == 'L'){
				nlist.add(-1);
			}
			else if( str.charAt(i) == 'R'){
				nlist.add(1);
			}
		}
		
		for( int m : mlist){
			msum += m;
		}
		
		for( int n: nlist){
			nsum += n;
		}
		
		
		System.out.println("Position: " + msum + "," + nsum );
	}
}
