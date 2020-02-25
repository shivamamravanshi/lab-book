package lab;

//lab1 exercise2
public class CalculateDifference {
	public static void main(String[] args) {
		CalculateDifference cal = new CalculateDifference();
		cal.ui();
	}

	public void ui() {
		int diff = calculateDifference(10);
		System.out.println(diff);
	}

	public int calculateDifference(int num) {
		int sumOfSquares = 0, squareOfNum = 0, sumOfNumber = 0;
		for (int i = 1; i <= num; i++) {
			sumOfNumber += i;
			squareOfNum = i * i;
			sumOfSquares += squareOfNum;
		}
		return sumOfSquares - (sumOfNumber * sumOfNumber);
	}
}
