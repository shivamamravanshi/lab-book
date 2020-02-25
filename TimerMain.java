package lab;

//lab8 exercise2
public class TimerMain {
	public static void main(String[] args) {
		TimerMain example = new TimerMain();
		example.ui();
	}

	public void ui() {
		Thread thread = new Thread(new Timer());
		thread.start();
	}
}
