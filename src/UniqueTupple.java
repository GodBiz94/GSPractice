import java.util.ArrayList;
import java.util.Scanner;

public class UniqueTupple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		String str = sc.nextLine();
		
		for(int i =0; i<str.length(); i++){
			for(int j =0; j<str.length()-i; j++){
				String sub = str.substring(i, i + j + 1);
				if(!list.contains(sub) && sub.length() == 2){
					list.add(sub);
				}
			}
		}
		
		System.out.println(list);
	}
}
