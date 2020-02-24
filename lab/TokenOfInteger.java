package lab;

import java.util.Scanner;
import java.util.StringTokenizer;

//lab6 exercise1
public class TokenOfInteger {
	public static void main(String[] args) {
		TokenOfInteger example = new TokenOfInteger();
		example.ui();
	}

	public void ui() {
		Scanner readLine = new Scanner(System.in);
		int sumOfInteger = 0;
		StringTokenizer integerLine = new StringTokenizer(readLine.nextLine());
		while (integerLine.hasMoreTokens()) {
			String integerString = integerLine.nextToken();
			int integer = Integer.parseInt(integerString);
			System.out.println(integer);
			sumOfInteger += integer;
		}
		System.out.println("Sum of integers are: " + sumOfInteger);
		readLine.close();
	}
}
