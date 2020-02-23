package lab;

import java.util.HashMap;
import java.util.Map;

//lab3 exercise4
public class CharacterCount {
	public static void main(String[] args) {
		CharacterCount example = new CharacterCount();
		example.ui();
	}

	public void ui() {
		String string = "Hello User";
		char[] charArray = string.toCharArray();
		characterCount(charArray);
	}

	public void characterCount(char[] charArray) {
		Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (c == ' ')
				continue;
			if (charCounts.containsKey(c)) {
				charCounts.put(c, charCounts.get(c) + 1);
			} else {
				charCounts.put(c, 1);
			}
		}
		System.out.println(charCounts);
	}
}
