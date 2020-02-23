package lab;

//lab4 
public class CubeOfDigits {
	public static void main(String[] args) {
		CubeOfDigits example = new CubeOfDigits();
		example.ui();
	}

	public void ui() {
		long sum = sumOfCubeOfDigit(3759);
		System.out.println(sum);
	}

	public long sumOfCubeOfDigit(int number) {
		long sum = 0;
		while (number > 0) {
			int digit = number % 10;
			long cubeOfDigit = digit * digit * digit;
			sum += cubeOfDigit;
			number = number / 10;
		}
		return sum;
	}
}
