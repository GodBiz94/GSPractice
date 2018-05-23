import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String res = longestPalindromeSearch(str);
		
		System.out.println(res);
	}
	
	public static String longestPalindromeSearch(String str){
		
		String t = "!#";
		for(char s1 : str.toCharArray()){
			t += (s1+"#");
		}
		int[] p = new int[t.length()];
		int id = 0, mx = 0, resLen = 0, resCenter = 0;
		for(int i = 1; i < t.length(); i++){
			p[i] = mx > i?Math.min(mx-i, p[2*id-i]):1;
			while(i+p[i] < t.length()){
				if(t.charAt(i+p[i]) == t.charAt(i-p[i])){
					p[i]++;
				}
				else{
					break;
				}
			}
			if(mx < i + p[i]){
				id = i;
				mx = i + p[i];
			}
			if(resLen < p[i]){
				resLen = p[i];
				resCenter = i;
			}
			
	
		}
		return str.substring((resCenter-resLen)/2, (resCenter-resLen)/2 + (resLen-1));
	}
}
