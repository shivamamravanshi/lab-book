package lab;

import java.util.Arrays;
//lab3 exercise1
public class SecondSmallest {
	public static void main(String[] args) {
		SecondSmallest example = new SecondSmallest();
		example.ui();
	}

	public void ui() {
		int[] numbers = { 12, 34, 566, 24, 5664 };
		int secondSmallest = getSecondSmallest(numbers);
		System.out.println("Second Smallest number is: " + secondSmallest);
	}

	public int getSecondSmallest(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[1];
	}
}
