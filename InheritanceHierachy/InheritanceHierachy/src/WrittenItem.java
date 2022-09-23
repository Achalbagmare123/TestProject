
public class WrittenItem extends Item{
	
	private String dataForAuthor;
	
	public WrittenItem(){
			
	}
	public void displayWrittenItem(String dataForAuthor) {
	    	this.dataForAuthor=dataForAuthor;;
	    	
	    	 }
	 public void dispwrittenitem() {
		 String dataForAuthor = "Haper Lee";
		 System.out.println("Data for author");
		 System.out.println(dataForAuthor);
		
		 
	 }
	public String getDataForAuthor() {
		return dataForAuthor;
	}
	public void setDataForAuthor(String dataForAuthor) {
		this.dataForAuthor = dataForAuthor;
	}
	
	public String toString() {
		return "WrittenItem [dataForAuthor=" + dataForAuthor + "]";
	}

	
	
		
	void dispitem() {
		int idNum = 1234;
		String title = "The god Father";
		int numCopies = 5;
		System.out.println("Identification Number:");
		System.out.println(idNum);
		System.out.println("Title:");
		System.out.println(title);
		System.out.println("Number of copies:");
		System.out.println(numCopies);
	}
	
	}
		 	

	
	
	
	