package lab;

import java.util.HashMap;
import java.util.Map;

//lab7 exercise 3
public class SquareOfNumbers {
	public static void main(String[] args) {
		SquareOfNumbers example = new SquareOfNumbers();
		example.ui();
	}

	public void ui() {
		int[] numbers = { 10, 22, 3, 55, 7 };
		Map<Integer, Integer> map = getSquares(numbers);
		System.out.println(map);
	}

	public Map<Integer, Integer> getSquares(int[] numbers) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int number : numbers) {
			map.put(number, Math.multiplyExact(number, number));
		}
		return map;
	}
}
