
public class Main {

	public static void main(String[] args) {
		WrittenItem writtenitem = new WrittenItem();
		writtenitem.dispitem();
		Book book = new Book();
		book.dispwrittenitem();
		JournalPaper j = new JournalPaper();
		j.dispJournalPaper();
		MediaItem m = new MediaItem();
		m.dispitem();
		Video v = new Video();
		v.dispVideo();
		CD c = new CD();
		c.dispCD();
		
		
		

	}

}
