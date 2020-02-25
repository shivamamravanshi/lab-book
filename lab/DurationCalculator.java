package lab;

import java.time.LocalDate;
import java.time.Period;

//lab6 exercise9
public class DurationCalculator {
	public static void main(String[] args) {
		DurationCalculator calculate = new DurationCalculator();
		calculate.ui();
	}

	public void ui() {
		LocalDate date = LocalDate.of(1998, 2, 28);
		calculateDuration(date);
	}

	public void calculateDuration(LocalDate date) {
		LocalDate currentDate = LocalDate.now();
		Period duration = Period.between(date, currentDate);
		System.out.println("Duration between given date and current date is: " + duration.getYears() + " Years "
				+ duration.getMonths() + " Months " + duration.getDays() + " Days ");
	}
}
