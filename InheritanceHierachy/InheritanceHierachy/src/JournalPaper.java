
public class JournalPaper extends WrittenItem {
	private int dataForYearPublished;
	public void JournalPaper() {
		
	}
	public void JournalPaper(int yearPublished) {
		this.dataForYearPublished = yearPublished;
		
	}
	public void dispJournalPaper() {
		int yearPublished = 1986;
		System.out.println("Data for year published:");
		System.out.println(yearPublished);
	}
}
	
