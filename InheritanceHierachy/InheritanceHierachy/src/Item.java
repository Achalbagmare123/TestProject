
public abstract class Item {
    private int identificationNumber;
    private String title;
    private int numberOfCopies;
	private String numcopies;
    public void Item(){
    	System.out.println("Information about book");
    	
    }
    public void displayItem(int idnum,String title,int numcopies) {
    	this.identificationNumber = idnum;
    	this.title = title;
    	this.numberOfCopies = numcopies;
    	
    	 }
    abstract void dispitem();
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
    public String toString() {
		String item="idnum:"+identificationNumber+"title:"+title+"numcopies:"+numberOfCopies;
		return item; 	
    }
	public void print() {
		System.out.println("Identification Number: " +identificationNumber);
		System.out.println("Title: " +title);
		System.out.println("Number of copies: " +numberOfCopies);
		}
		
	}

