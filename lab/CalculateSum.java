package lab;
//lab1 exercise 1
public class CalculateSum {
	public static void main(String[] args) {
		CalculateSum cal = new CalculateSum();
		cal.ui();
	}

	public void ui() {
		int sum =calculateSum(6);
		System.out.println(sum);
	}
	public int calculateSum(int number) {
		int sum=0;
		for(int i=2;i<=number;i++) {
			if((i%3==0) || (i%5==0)) {
				sum+=i;
			}
		}
		return sum;
	}
}
