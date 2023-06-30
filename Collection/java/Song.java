package Collection.java;

public class Song {

	String name;
	String singer;
	String movie;
	String lang;
	public Song(String name,String singer,String movie,String lang) {
		super();
		this.name=name;
		this.singer=singer;
		this.movie=movie;
		this.lang=lang;
	}
	public void songDisplay() {
		System.out.println(name);
		System.out.println(singer);
		System.out.println(movie);
		System.out.println(lang);
	}
	
	public String toString() {
//		return "[name: "+name",singer"+singer"]"
		return lang;
	
		
	}
	
	

}
