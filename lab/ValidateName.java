package lab;

//lab5 exercise4
public class ValidateName {
	public static void main(String[] args) {
		ValidateName example = new ValidateName();
		example.ui();
	}

	public void ui() {
		String fName = "Shivam";
		validate(fName);
		String lName = "Amravanshi";
		validate(lName);
	}

	public void validate(String name) {
		if ((name == null) || (name.isEmpty())) {
			throw new NameIsEmptyException("Name is Empty");
		}
	}
}
