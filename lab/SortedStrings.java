package lab;

//lab3 exercise 2
public class SortedStrings {
	public static void main(String[] args) {
		SortedStrings example = new SortedStrings();
		example.ui();
	}

	public void ui() {
		String[] strings = { "Java", "Hello", "Programming", "LANGUAGE", "Shivam" };
		String[] sortedStrings = sort(strings);
		for (String string : sortedStrings) {
			System.out.println(string);
		}
	}

	public String[] sort(String[] strings) {
		String[] sortedStrings = new String[strings.length];
		if (strings.length % 2 == 0) {
			for (int i = 0; i < (strings.length) / 2; i++) {
				sortedStrings[i] = strings[i].toUpperCase();
			}
			for (int i = (strings.length / 2); i < strings.length; i++) {
				sortedStrings[i] = strings[i].toLowerCase();
			}
		} else {
			for (int i = 0; i < (strings.length / 2) + 1; i++) {
				sortedStrings[i] = strings[i].toUpperCase();
			}
			for (int i = (strings.length / 2) + 1; i < strings.length; i++) {
				sortedStrings[i] = strings[i].toLowerCase();
			}
		}
		return sortedStrings;
	}
}
