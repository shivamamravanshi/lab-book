package lab;

import java.util.Arrays;

//lab3 exercise3
public class ReverseAndSort {
	public static void main(String[] args) {
		ReverseAndSort example = new ReverseAndSort();
		example.ui();
	}

	public void ui() {
		int[] numbers = { 1241, 4356, 9656, 334 };
		int[] sorted = getSorted(numbers);
		for (int num : sorted) {
			System.out.println(num);
		}
	}

	public int[] getSorted(int[] numbers) {
		int[] reverseAndSortedNumbers = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			StringBuffer stringNumber = new StringBuffer();
			stringNumber.append(number);
			stringNumber.reverse();
			reverseAndSortedNumbers[i] = Integer.parseInt(stringNumber.toString());
		}
		Arrays.sort(reverseAndSortedNumbers);
		return reverseAndSortedNumbers;
	}
}
