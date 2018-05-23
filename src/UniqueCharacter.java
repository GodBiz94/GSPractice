import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * 
 * 
 * Using linkedhashmap because it stores value in order of insertion
 * 
 */
public class UniqueCharacter {

	public static char getFirstUnique(String str){
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		
		for(char c : str.toCharArray()){
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		 for (Entry<Character,Integer> entry : counts.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }
	        throw new RuntimeException("didn't find any non repeated Character");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = getFirstUnique(str);
		
		System.out.println("The first unique character is: " + c );
		
	}
	
}
