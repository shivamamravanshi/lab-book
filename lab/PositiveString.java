package lab;

//lab6 exercise8
public class PositiveString {
	public static void main(String[] args) {
		PositiveString example = new PositiveString();
		example.ui();
	}

	public void ui() {
		String string = "ANT";
		System.out.println(checkPositiveString(string));
	}

	public boolean checkPositiveString(String string) {
		for (int i = 1, limit = string.length(); i < limit; i++) {
			char character = string.charAt(i);
			char previousCharacter = string.charAt(i - 1);
			if (previousCharacter - character > 0) {
				return false;
			}
		}
		return true;
	}
}
