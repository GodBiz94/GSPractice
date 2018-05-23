import java.util.Arrays;
import java.util.Comparator;

public class AnagramGroup implements Comparator<String> {
  
	
	public String sortChars(String s){
		
		char[] c = s.toCharArray();
		Arrays.sort(c);
		
		return new String(c);
	}
	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return sortChars(str1).compareTo(str2);
	}
	
	
	public static void main(String[] args) {
		
		String[] words = { "abc", "abcd", "acd", "acb", "abdc"};
		
		Arrays.sort(words, new AnagramGroup());
		
		for(int i =0; i<words.length; i++){
			System.out.println(words[i]);
		}
	}
}
