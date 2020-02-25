package lab;

public class JournalPaper extends WrittenItem{
	private int publishedYear;

	public JournalPaper(int id, String title, int copies, String author, int publishedYear) {
		super(id, title, copies, author);
		this.publishedYear = publishedYear;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Publish Year = "+publishedYear);
	}
	

	
}
