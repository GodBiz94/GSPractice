import java.util.HashSet;
import java.util.Scanner;
/*
 * HashSet = doesn't store duplicate values
 * 
 */
public class LargestUniqueSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		findUniqueSubstring(str);
	}
	
	static void findUniqueSubstring(String str){
		if(str == null || str.length() == 0){
			System.out.println("Invalid");
		}
		int result =0;
		int k =0;
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i =0; i<str.length(); i++){
			char c = str.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				result = Math.max(result, set.size());
			}
			else{
				while(k<i){
					if(str.charAt(k) == c){
						k++;
						break;
					}else{
						set.remove(str.charAt(k));
						k++;
					}
				}
			}
		}
		
		System.out.println(set);
	}
}
