package lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//lab7 exercise1
public class SortMap {
	public static void main(String[] args) {
		SortMap example = new SortMap();
		example.ui();
	}

	public void ui() {
		Map map = new HashMap<Integer, Integer>();
		map.put(1, 20);
		map.put(2, 66);
		map.put(3, 20);
		List list = getValues(map);
		System.out.println(list);
	}

	public List getValues(Map map) {
		Collection values = map.values();
		List list = new ArrayList(values);
		Collections.sort(list);
		return list;
	}
}
