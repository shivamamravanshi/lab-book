package lab;

import java.time.LocalDateTime;

//lab 8 exercise 2
public class Timer implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(10000);
				LocalDateTime dateTime = LocalDateTime.now();
				System.out.println(dateTime.getHour() + ":" + dateTime.getMinute() + ":" + dateTime.getSecond());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
