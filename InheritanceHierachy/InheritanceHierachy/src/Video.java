
public class Video extends MediaItem{
	private String dataForDirector;
	private String genere;
	private int yearRealesed;
	public void Video() {
		
	}
	public void Video(String director,String genere,int year) {
		this.dataForDirector=director;
		this.genere=genere;
		this.yearRealesed=year;
		
	}
	public void dispVideo() {
		String director = "Francis Ford Coppola";
		String genere = "Drama";
		int year = 1984;
		System.out.println("Director:");
		System.out.println(director);
		System.out.println("Genere:");
		System.out.println(genere);
		System.out.println("Year of released:");
		System.out.println(year);






	}

}
