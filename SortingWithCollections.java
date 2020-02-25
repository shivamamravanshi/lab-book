package lab;
//lab7 exercise5
import java.util.ArrayList;
import java.util.Collections;

public class SortingWithCollections {
	public static void main(String[] args) {
		SortingWithCollections example = new SortingWithCollections();
		example.ui();
	}

	public void ui() {
		int[] numbers = { 21, 45, 66, 23, 88 };
		System.out.println(getSecondSmallest(numbers));
	}

	public int getSecondSmallest(int[] numbers) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int number : numbers) {
			numberList.add(number);
		}
		Collections.sort(numberList);
		return numberList.get(1);
	}
}
