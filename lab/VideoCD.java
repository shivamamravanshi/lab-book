package lab;

public class VideoCD extends MediaItem{
	private String director;
	private String gener;
	private int yearRelease;
	public VideoCD(int id, String title, int copies, int runtime, String director,
			String gener, int yearRelease) {
		super(id, title, copies, runtime);
		this.director = director;
		this.gener = gener;
		this.yearRelease = yearRelease;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Video Director = "+director+", Gener = "+gener+", Year Of Release = "+yearRelease);
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	public int getYearRelease() {
		return yearRelease;
	}
	public void setYearRelease(int yearRelease) {
		this.yearRelease = yearRelease;
	}
	
}
