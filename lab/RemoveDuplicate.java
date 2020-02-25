package lab;

import java.util.ArrayList;
import java.util.Collections;

//lab 7 exercise 8
public class RemoveDuplicate {
	public static void main(String[] args) {
		RemoveDuplicate example = new RemoveDuplicate();
		example.ui();
	}

	public void ui() {
		int[] numbers = { 123, 456, 789, 1023, 1534, 754, 123 ,789 };
		int[] modifiedNumbers = modifyArray(numbers);
		for (int number : modifiedNumbers) {
			System.out.println(number);
		}
	}

	private int[] modifyArray(int[] numbers) {

		ArrayList list = new ArrayList();
		for (int i = 0; i < numbers.length; i++) {
			if (!list.contains(numbers[i]))
				list.add(numbers[i]);
			else
				continue;

		}
		Collections.sort(list);
		int[] modifiedNumbers = new int[list.size()];
		int j = list.size() - 1;
		for (Object i : list) {
			modifiedNumbers[j] = (int) i;
			j--;
		}
		return modifiedNumbers;
	}
}
