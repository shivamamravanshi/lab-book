package lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//lab7 exercise6
public class EligibleVoter {
	public static void main(String[] args) {
		EligibleVoter example = new EligibleVoter();
		example.ui();
	}

	public void ui() {
		HashMap map = new HashMap();
		map.put(1, "12/11/2018");
		map.put(2, "01/01/2000");
		map.put(3, "05/05/1998");
		map.put(4, "23/02/2002");
		List list = votersList(map);
		for (Object i : list) {
			System.out.println(map.get(i));
		}
	}

	private List votersList(HashMap map) {
		Map map1 = new HashMap();
		map1.put("Jan", 1);
		map1.put("Feb", 2);
		map1.put("Mar", 3);
		map1.put("Apr", 4);
		map1.put("May", 5);
		map1.put("Jun", 6);
		map1.put("Jul", 7);
		map1.put("Aug", 8);
		map1.put("Sep", 9);
		map1.put("Oct", 10);
		map1.put("Nov", 11);
		map1.put("Dec", 12);
		Collection collection1 = map1.keySet();
		Collection collection2 = map.keySet();
		List list1 = new ArrayList(collection1);
		List list2 = new ArrayList(collection2);
		Date date = new Date();
		String s = date.toString();
		String[] arr = s.split(" ");
		String sysdate = "";
		sysdate = sysdate + arr[2] + " " + arr[1] + " " + arr[5];
		int year18 = Integer.parseInt(arr[5]) - 18;
		Object mon = map1.get(arr[1]);
		int month18 = (Integer) (mon);
		int day18 = Integer.parseInt(arr[2]);
		List eligible = new ArrayList();
		for (Object i : list2) {
			String[] str = ((String) map.get(i)).split("/");
			if (Integer.parseInt(str[2]) < year18) {
				eligible.add(i);
				continue;
			} else if (Integer.parseInt(str[2]) == year18) {
				if (Integer.parseInt(str[1]) < month18) {
					eligible.add(i);
				} else if (Integer.parseInt(str[1]) == month18) {
					if (Integer.parseInt(str[0]) < day18) {
						eligible.add(i);

					} else if (Integer.parseInt(str[0]) == day18) {
						eligible.add(i);
					}
				}
			} else {
				continue;
			}
		}
		return eligible;
	}
}
