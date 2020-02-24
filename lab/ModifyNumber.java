package lab;

//lab6 exercise5
public class ModifyNumber {
	public static void main(String[] args) {
		ModifyNumber example = new ModifyNumber();
		example.ui();
	}

	public void ui() {
		int modifiedNumber = modifyNumber(45862);
		System.out.println(modifiedNumber);
	}

	public int modifyNumber(int number) {
		int modifiedNumber;
		String numberInString = number + "";
		StringBuffer result = new StringBuffer();
		for (int i = 1, limit = numberInString.length(); i < limit; i++) {
			char character = numberInString.charAt(i);
			char previousCharacter = numberInString.charAt(i - 1);
			int difference = Math.abs(character - previousCharacter);
			result.append(difference);
			if (i + 1 == numberInString.length()) {
				result.append(numberInString.charAt(i));
			}
		}
		modifiedNumber = Integer.parseInt(result.toString());
		return modifiedNumber;
	}
}
