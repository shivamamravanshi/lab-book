package lab;

//lab1 exercise3
public class CheckNumber {
	public static void main(String[] args) {
		CheckNumber check = new CheckNumber();
		check.ui();
	}

	public void ui() {
		boolean flag = checkNumber(1245788);
		if (flag == true)
			System.out.println("Number is increases");
		else
			System.out.println("Number is not increasing");
	}

	public boolean checkNumber(int num) {
		int digit;
		int previousDigit = Integer.MAX_VALUE;
		while (num > 0) {
			digit = num % 10;
			if (digit > previousDigit) {
				return false;
			}
			previousDigit = digit;
			num /= 10;
		}
		return true;
	}
}
