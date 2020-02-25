package lab;

//lab7 exercise7
public class ReverseAndSortInCollection {
	public static void main(String[] args) {
		ReverseAndSortInCollection example = new ReverseAndSortInCollection();
		example.ui();
	}

	public void ui() {
		int[] numbers = { 13, 565, 3456, 572, 7545, 7774, 4565 };
		int[] reverseSortedNumbers = getSorted(numbers);
		for (int number : reverseSortedNumbers) {
			System.out.println(number);
		}
	}

	private int[] getSorted(int[] numbers) {
		int[] reverseSortedNumbers = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {

			StringBuilder rev = new StringBuilder("");
			while (numbers[i] > 0) {

				rev = rev.append(numbers[i] % 10);
				numbers[i] = numbers[i] / 10;
			}
			String x = new String(rev);
			reverseSortedNumbers[i] = Integer.parseInt(x);
		}
		return reverseSortedNumbers;
	}
}
