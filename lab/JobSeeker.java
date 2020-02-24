package lab;

//lab6 exercise10
public class JobSeeker {
	public static void main(String[] args) {
		JobSeeker example = new JobSeeker();
		example.ui();
	}

	public void ui() {
		String userName = "shivam1200_job";
		System.out.println(validateRegistration(userName));
	}

	public boolean validateRegistration(String userName) {
		if (userName.length() < 12)
			return false;
		if (userName.endsWith("_job"))
			return true;
		return false;
	}
}
