package lab;

//lab5 exercise2
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci example = new Fibonacci();
		example.ui();
	}

	public void ui() {
		printFibonacci(10);
	}

	public void printFibonacci(int number) {
		int firstNumber = 0;
		int secondNumber = 1;
		int next = firstNumber + secondNumber;
		for (int i = 0; i < number; i++) {
			System.out.println(firstNumber);
			next = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = next;
		}
	}

}
