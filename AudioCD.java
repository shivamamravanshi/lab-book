package lab;

public class AudioCD extends MediaItem{
	private String artist;
	private String genre;
	public AudioCD(int id, String title, int copies, int runtime, String artist, String genre) {
		super(id, title, copies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Audio Artist = "+artist+", Genre = "+genre);
	}
	
}
