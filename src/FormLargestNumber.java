import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class FormLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> list = new Vector<>();
		list.add("1");
		list.add("34");
		list.add("3");
		list.add("98");
		list.add("9");
		list.add("76");
		list.add("45");
		list.add("4");
		printLargest(list);
	}
	
	static void printLargest(Vector<String> list){
		Collections.sort(list, new Comparator<String>(){

			@Override
			public int compare(String X, String Y) {
				// TODO Auto-generated method stub
				
				String XY = X + Y;
				String YX = Y + X;
				return XY.compareTo(YX) > 0 ? -1:1;
			}
			
		});
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
	}

}
