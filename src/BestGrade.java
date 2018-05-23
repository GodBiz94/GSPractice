import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class BestGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<String, Integer> tree = new TreeMap<>();
		
		System.out.println("Number of entries: ");
	    int n = sc.nextInt();
	    
	    for(int i =0; i<n; i++){
	    	System.out.println("Enter name: ");
	    	String name = sc.next();
	    	System.out.println("Enter grade: ");
	        int grade = sc.nextInt();
	        
	        tree.put(name, grade);
	    }
	    
	    System.out.println("The best grade: " + Collections.max(tree.values()));
	}
}
