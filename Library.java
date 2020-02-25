package lab;

public class Library {
public static void main(String[] args) {
	Item book = new Book(1,"Lost in Space",10,"Jack");
	Item video = new VideoCD(2,"Game Of Thrones",20,3,"Mark","Drama",2019);
	Item audio = new AudioCD(3,"Lost",10,1,"Enrique","Music");
	Item journal = new JournalPaper(4,"Corona Virus",10,"Hindustan Times",2020);
	Item[] items = new Item[4];
	items[0] = book;
	items[1] = video;
	items[2] = audio;
	items[3] = journal;
	Library library = new Library();
	library.display(items);
}/*
public void display(AudioCD audio) {
	System.out.println("Audio Id = "+audio.getId()+", Audio Title = "+audio.getTitle()+", Number Of Copies = "+
			audio.getCopies()+", Audio Director = "+", Audio Runtime in hrs = "+audio.getRuntime()+
			"Audio gener = "+audio.getGenre()+", Audio Artist = "+ audio.getArtist());
}
public void display(Book book) {
	System.out.println("Book Id = "+book.getId()+", Book Title = "+book.getTitle()+", Number Of Copies = "+
			book.getCopies()+", Book author = "+book.getAuthor());
}
public void display(VideoCD video) {
	System.out.println("Video Id = "+video.getId()+", Video Title = "+video.getTitle()+", Number Of Copies = "+
			video.getCopies()+", Video Director = "+video.getDirector()+", Video Runtime in hrs = "+video.getRuntime()+
			"Video gener = "+video.getGener()+", Video Release year = "+ video.getYearRelease());
}
public void display(JournalPaper journal) {
	System.out.println("Journal Id = "+journal.getId()+", Journal Title = "+journal.getTitle()+", Number Of Copies = "+
			journal.getCopies()+", Journal author = "+journal.getAuthor()+"Year Of Publish = "+journal.getPublishedYear());
}*/
public void display(Item[] items) {
	for (int i = 0; i < items.length; i++) {
		Item item = items[i];
		if(item instanceof Book) {
			Book book = (Book)item; 
			book.print();
			System.out.println();
			//this.display(book);
		}else if(item instanceof VideoCD) {
			VideoCD video = (VideoCD)item;
			video.print();
			System.out.println();
			//this.display(video);
		}else if(item instanceof AudioCD) {
			AudioCD audio = (AudioCD) item;
			audio.print();
			System.out.println();
			//this.display(audio);
		}else if(item instanceof JournalPaper){
			JournalPaper journal = (JournalPaper) item;
			journal.print();
			System.out.println();
			//this.display(journal);
		}else {
			item.print();
		}
	}
}
}
