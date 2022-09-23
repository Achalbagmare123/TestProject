
public class CD extends MediaItem {
	private String dataForArtist;
	private int MusicalGenre;
	public void Cd() {
		
	}
	public void cd(String artist,int genre) {
		this.dataForArtist=artist;
		this.MusicalGenre=genre;
	}
	public void dispCD() {
			String artist = "David";
			int genre = 1968;
			System.out.println("Data for artist:");
			System.out.println(artist);
			System.out.println("Musical Genre:");
			System.out.println(genre);




	}

}
