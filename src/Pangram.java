import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pangram {

	static Map<Character, Boolean> letterMap = new TreeMap<Character, Boolean>();

	static {
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		for(int i =0; i<alphabet.length; i++){
			letterMap.put(alphabet[i], false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String missing = getMissingLetters(str);
		System.out.println("Missing characters are: " + missing);

	}
	
	static String getMissingLetters(String str){
		char[] letters = str.toLowerCase().toCharArray();
		
		Arrays.sort(letters);
		
		for(int i =0; i<letters.length; i++){
			char letter = letters[i];
			if(String.valueOf(letter).matches("[a-zA-Z]")){
				letterMap.put(letter, true);
			}
		}
		
		StringBuffer buffer = new StringBuffer();
		for(Map.Entry<Character, Boolean> e: letterMap.entrySet()){
			if(e.getValue()== false){
				buffer.append(e.getKey());
			}
		}
		
		return buffer.toString();
	}

}
 