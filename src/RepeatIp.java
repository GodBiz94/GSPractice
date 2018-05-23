import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatIp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] iplog = { "10.0.0.1-frank [10/dec/17 10:14:27]", "10.0.0.1-frank [10/dec/17 10:14:28]",
				"10.0.0.2-nancy [10/dec/17 10:14:28]", "10.0.0.1-frank [10/dec/17 10:14:27]" };

		matchIp(iplog);

	}

	static void matchIp(String[] iplog) throws NullPointerException {

		TreeMap<String, Integer> map = new TreeMap<>();
		Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
		Matcher mtch;

		for (String str : iplog) {
			String sub = str.substring(0, 8);
			mtch = ptn.matcher(sub);

			if (mtch.find() == true) {

				if (map.containsKey(sub)) {
					map.put(sub, map.get(sub) + 1);
				} else {
					map.put(sub, 1);
				}
			}

		}
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		System.out.println("Most repeating ip: " + maxEntry);

	}

}
