package lab;

public abstract class MediaItem extends Item {
	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public MediaItem(int id, String title, int copies, int runtime) {
		super(id, title, copies);
		this.runtime = runtime;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Runtime = "+runtime+"hr");
	}
	
}
