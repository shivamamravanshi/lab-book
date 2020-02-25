package lab;

import java.util.Scanner;

//lab5 exercise5
public class ValidateAge {
	public static void main(String[] args) {
		ValidateAge example = new ValidateAge();
		example.ui();
	}

	public void ui() {
		Scanner readAge = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = readAge.nextInt();
		validate(age);
		readAge.close();
	}

	public void validate(int age) {
		if (age <= 15)
			throw new InvalidAgeException("Age cannot be bellow 15 year");
	}
}
