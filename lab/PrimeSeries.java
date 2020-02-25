package lab;

//lab5 exercise3
public class PrimeSeries {
	public static void main(String[] args) {
		PrimeSeries example = new PrimeSeries();
		example.ui();
	}

	public void ui() {
		primeSeries(13);
	}

	public void primeSeries(int number) {
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
