package lab;

import java.util.HashMap;
import java.util.Map;

//lab7 exercise 2
public class CharacterArrayCount {
	public static void main(String[] args) {
		CharacterArrayCount example = new CharacterArrayCount();
		example.ui();
	}

	public void ui() {
		char[] characters = "APPLE".toCharArray();
		Map<Character, Integer> map = countCharacter(characters);
		System.out.println(map);
	}

	public Map<Character, Integer> countCharacter(char[] characters) {
		Map<Character, Integer> map = new HashMap<>();
		for (char character : characters) {
			if (map.containsKey(character)) {
				map.put(character, map.get(character) + 1);
			} else {
				map.put(character, 1);
			}
		}
		return map;
	}
}
