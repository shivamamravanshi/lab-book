package lab;

//lab6 exercise4
public class AlterString {
	public static void main(String[] args) {
		AlterString example = new AlterString();
		example.ui();
	}

	public void ui() {
		String string = "java";
		String replacedString = alterString(string);
		System.out.println(replacedString);
	}

	public String alterString(String string) {
		System.out.println(string);
		for (int i = 0, limit = string.length(); i < limit; i++) {
			char character = string.charAt(i);
			if ((character != 'a') && (character != 'e') && (character != 'i') && (character != 'o')
					&& (character != 'u')) {
				char replacedCharacter = (char) (character + 1);
				string = string.replace(character, replacedCharacter);
			}
		}
		return string;
	}
}
