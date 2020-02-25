package lab;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//lab 9
public class TimerMainExecutor {
	public static void main(String[] args) {
		TimerMainExecutor example = new TimerMainExecutor();
		example.ui();
	}

	public void ui() {
		ExecutorService service = Executors.newCachedThreadPool();
		Runnable runnable = new Timer();
		try {
			service.submit(runnable);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
